package edu.oop.basic.ex;

public class ProductRun {

    public static void main(String[] args) {
        Product pc1 = new Product();
        //기본 생성자를 활용해서 데이터 추가
        pc1.setpName("갤럭시 S24");
        pc1.setPrice(1200000);
        pc1.setBrand("삼성");

        Product pc2 = new Product();
        pc2.setpName("아이폰 15");
        pc2.setPrice(1300000);
        pc2.setBrand("애플");


        System.out.println("p1,p2 실행결과");
        System.out.println("=== P1 실행결과 ===");
        pc1.information();
        System.out.println("=== P2 실행결과 ===");
        pc2.information();
    }
}

