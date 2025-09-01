package edu.practice.day6;

public class PracticeRun {
    public static void main(String[] args) {
        // 쇼핑
        NaverShopping shopping = new NaverShopping("네이버 쇼핑", "user01", "쇼핑왕", 3, 500, 2);
        shopping.login();
        shopping.search();
        shopping.writeContent();
        shopping.addToCart();
        shopping.buyProduct();
        shopping.logout();

        System.out.println();

        // 블로그
        NaverBlog blog = new NaverBlog("네이버 블로그", "user02", "블로거", 2, 20, 500);
        blog.login();
        blog.search();
        blog.writeContent();
        blog.addNeighbor();
        blog.customizeTheme();
        blog.logout();

        System.out.println();

        // 카페
        NaverCafe cafe = new NaverCafe("네이버 카페", "user03", "카페지기", 5, "골드", 120);
        cafe.login();
        cafe.search();
        cafe.writeContent();
        cafe.joinCafe();
        cafe.uploadFile();
        cafe.logout();
    }
}
