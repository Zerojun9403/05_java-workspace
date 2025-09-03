package edu.polymorphism.pack3.ex1;

/*
* 추상존재하지 않고 , 부모클래스 + 인터페이스의 조합
* public class Instagram extends Meta플랫폼 implements 소셜미디어기능들
*
* public abstract class Meta플랫폼(){}
*
* 추상 기능이 존재하고 부모 클래스의 abstract를 활용한 조합
*
* public class Instagram extends Meta플랫폼(){}
* */



public class Instagram extends Meta플랫폼 {

    public Instagram(String 유저아이디) {
        super("Instagram", 유저아이디);
    }

    @Override
    public void post(String content) {
        System.out.println("[Instagram] " + 유저아이디 + "님이 사진/글을 올렸습니다: " + content);
    }

    @Override
    public void like(String targetUser) {
        System.out.println("[Instagram] " + 유저아이디 + "님이 " + targetUser + "에 하트를 눌렀습니다.");
    }
}
