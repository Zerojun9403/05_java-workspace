package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    // 상품ID : 상품명
    Map<String, String> productMap = new HashMap<>();
    // 상품ID : 가격
    Map<String, Integer> priceMap = new HashMap<>();

    // ===== 생성자에서 초기 데이터 세팅 =====
    public ProductManager() {
        addProduct("P001", "갤럭시S24", 1200000);
        addProduct("P002", "아이폰15", 1300000);
        addProduct("P003", "나이키운동화", 150000);
    }

    // ===== 상품 추가 =====
    void addProduct(String productId, String productName, int price) {
        if (productMap.containsKey(productId)) {
            System.out.println("이미 존재하는 상품입니다!");
        } else {
            productMap.put(productId, productName);
            priceMap.put(productId, price);
            System.out.println(productName + " 상품이 추가되었습니다!");
        }
    }

    // ===== 상품 검색 =====
    void searchProduct(String productId) {
        if (productMap.containsKey(productId)) {
            String name = productMap.get(productId);
            int price = priceMap.get(productId);
            System.out.println("상품ID: " + productId +
                    ", 상품명: " + name +
                    ", 가격: " + price + "원");
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }
    }

    // ===== 전체 상품 목록 출력 =====
    void displayAllProducts() {
        System.out.println("=== 전체 상품 목록 ===");
        if (productMap.isEmpty()) {
            System.out.println("등록된 상품이 없습니다.");
        } else {
            for (String productId : productMap.keySet()) {
                String name = productMap.get(productId);
                int price = priceMap.get(productId);
                System.out.println(productId + " - " + name + " : " + price + "원");
            }
        }
    }

    // ===== 상품 삭제 =====
    void removeProduct(String productId) {
        if (productMap.containsKey(productId)) {
            String name = productMap.remove(productId);
            priceMap.remove(productId);
            System.out.println(name + " 상품이 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 상품ID입니다.");
        }
    }

    // ===== 테스트용 main =====
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // 초기 데이터 확인
        manager.displayAllProducts();

        // 상품 검색
        manager.searchProduct("P002");
        manager.searchProduct("P010");

        // 상품 추가
        manager.addProduct("P004", "맥북프로", 2500000);
        manager.addProduct("P001", "갤럭시탭", 1000000);

        // 전체 출력
        manager.displayAllProducts();

        // 상품 삭제
        manager.removeProduct("P003");
        manager.removeProduct("P010");

        // 최종 출력
        manager.displayAllProducts();
    }
}
