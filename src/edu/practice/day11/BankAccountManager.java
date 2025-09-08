package edu.practice.day11;


import pracitce.exception.ex.UserNotFoundException;

import java.util.*;

public class BankAccountManager {


    // try-catch가 없는 기능
    public void method1() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);
        ;

        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");


        System.out.print("계좌번호를 입력하세요: ");
        String acc = sc.nextLine();
        // 1. 계좌 등록
        Integer a = accountMap.get(acc);
        if (acc == null) {
            throw new NumberFormatException("❌ 해당 계좌번호는 존재하지 않습니다.");
        }
        // 2. 출금
        System.out.print("출금할 금액을 입력하세요: ");
        int money = sc.nextInt();
        sc.nextLine();
        if (a < money) {
            throw new IllegalArgumentException("잔액이 부족합니다." + money + "원");
        }


    }


    // try-catch가 있는 기능
    public void method2() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);
        ;

        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");

        try {
            // 1) 계좌번호 입력 및 검증
            System.out.print("계좌번호를 입력하세요: ");
            String acc = sc.nextLine().trim();

            if (!accountMap.containsKey(acc)) {
                System.out.println("❌ 해당 계좌번호는 존재하지 않습니다.");
                return;
            }

            int balance = accountMap.get(acc);

            // 2) 출금 금액 입력 (숫자 검증)
            System.out.print("출금할 금액을 입력하세요: ");
            String moneyInput = sc.nextLine().trim();
            int money;
            try {
                money = Integer.parseInt(moneyInput);
            } catch (NumberFormatException nfe) {
                System.out.println("❌ 출금 금액은 숫자로 입력해야 합니다.");
                return;
            }

            if (money <= 0) {
                System.out.println("❌ 출금 금액은 1원 이상이어야 합니다.");
                return;
            }

            if (balance < money) {
                throw new IllegalArgumentException("잔액이 부족합니다. (요청: " + money + "원, 잔액: " + balance + "원)");
            }

            // 3) 예금주 검증
            System.out.print("예금주 이름을 입력하세요: ");
            String inputName = sc.nextLine().trim();

            String ownerName = ownerMap.get(acc); // 계좌번호로 예금주 조회
            if (ownerName == null || !ownerName.equals(inputName)) {
                throw new UserNotFoundException("일치하는 계좌의 예금주가 존재하지 않습니다.");
            }

            System.out.println("✅ 예금주 명이 동일합니다: " + ownerName);

            // 4) 출금 처리
            accountMap.put(acc, balance - money);
            System.out.println("💳 출금 완료: " + money + "원");
            System.out.println("잔액: " + accountMap.get(acc) + "원");

        } catch (IllegalArgumentException e) {
            System.out.println("❌ 거래 실패: " + e.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println("❌ 본인 확인 실패: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ 알 수 없는 오류가 발생했습니다. 잠시 후 다시 시도해주세요.");
            e.printStackTrace(); // 디버깅용
        } finally {
            sc.close();
            System.out.println("✅ 거래 완료");
        }
    }

}
