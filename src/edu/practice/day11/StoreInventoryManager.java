package edu.practice.day11;

import java.util.*;

public class StoreInventoryManager {

    public void method3() {
        Map<String, Integer> inventoryMap = new HashMap<>(); // 상품명 : 재고수량
        Map<String, Integer> priceMap = new HashMap<>();     // 상품명 : 가격
        Scanner sc = new Scanner(System.in);

        // 초기 재고 데이터
        inventoryMap.put("사과", 50);
        inventoryMap.put("바나나", 30);
        inventoryMap.put("오렌지", 0); // 재고 없음
        priceMap.put("사과", 1000);
        priceMap.put("바나나", 1500);
        priceMap.put("오렌지", 2000);

        try {
            System.out.print("구매할 상품명을 입력하세요: ");
            String item = sc.nextLine().trim();

            // 상품명 존재 여부 확인
            if (!inventoryMap.containsKey(item)) {
                System.out.println("❌ 해당 상품이 존재하지 않습니다.");
                return;
            }
            // (안전) 가격 정보도 함께 확인
            if (!priceMap.containsKey(item)) {
                System.out.println("❌ 해당 상품의 가격 정보가 없습니다.");
                return;
            }

            System.out.print("구매할 수량을 입력하세요: ");
            String qtyInput = sc.nextLine().trim();

            int qty;
            try {
                qty = Integer.parseInt(qtyInput);
            } catch (NumberFormatException nfe) {
                System.out.println("❌ 수량은 숫자로 입력해야 합니다.");
                return;
            }

            if (qty <= 0) {
                System.out.println("❌ 수량은 1 이상이어야 합니다.");
                return;
            }

            int stock = inventoryMap.get(item);
            if (stock < qty) {
                throw new RuntimeException("재고 부족: 현재 재고 " + stock + "개, 요청 수량 " + qty + "개");
            }

            // 재고 차감 및 총 가격 계산
            int price = priceMap.get(item);
            int total = price * qty;

            inventoryMap.put(item, stock - qty);

            System.out.println("✅ 구매 완료");
            System.out.println("- 상품: " + item);
            System.out.println("- 단가: " + price + "원");
            System.out.println("- 수량: " + qty + "개");
            System.out.println("- 총액: " + total + "원");
            System.out.println("- 잔여 재고: " + inventoryMap.get(item) + "개");

        } catch (RuntimeException e) {
            System.out.println("❌ 처리 실패: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ 알 수 없는 오류가 발생했습니다: " + e.getMessage());
            e.printStackTrace(); // 디버깅용
        } finally {
            sc.close();
            System.out.println("✅ 재고 관리 완료");
        }
    }


}
