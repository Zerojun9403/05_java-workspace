package edu.polymorphism.pack3.ex1;

public class 플랫폼실행하기 {


    public static void main(String[] args) {
        Facebook facebook = new Facebook("자연인");
        facebook. login();                                     //Meta 플랫폼 클래스에서 상속받은 기능
        facebook.post("오늘도 자연은 아름답네요 :)"); // 인터페이스 구현 메서드
        facebook.like("post001");                      // 인터페이스 구현 메서드
        facebook.logout();                                     //Meta 플랫폼 클래스에서 상속받은 기능


        System.out.println();


        Instagram instagram = new Instagram("이코딩");
        instagram.login();
        instagram.post("맛있는 음식");
        instagram.like("photo456");
        instagram.logout();
    }
}
