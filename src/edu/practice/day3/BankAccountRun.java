package edu.practice.day3;

public class BankAccountRun {

    public static void main(String[] args) {
        // 1) 계좌 생성
        BankAccount a1 = new BankAccount();                       // 홍길동
        a1.setName("홍길동");
        a1.setAccountNumber("123-456-789");
        a1.setPassword("7890");
        a1.setBalance(100_000);                           // 초기 잔액: 100000

        BankAccount a2 = new BankAccount("김철수", "987-654-321", 0, "1234");

        // 2) 계좌 정보(헤더) 출력
        a1.getAccountInfo();

        // 3) 입금
        a1.deposit(50_000);   // 홍길동 → 150000
        a2.deposit(30_000);   // 김철수 → 30000

        System.out.println();

        // 4) 송금 (홍길동 → 김철수 20000원)
        a1.transfer("7890", a2, 20_000);

        System.out.println();

        // 5) 거래 횟수 요약(홍길동)
        System.out.println("=== " + a1.getName() + "님 총 거래 횟수 ===");
        System.out.printf("총 %d회 거래를 하셨습니다.%n", a1.getTransactionCount());
    }
}
