package edu.polymorphism.pack3.ex1;

public class FaceBook extends Meta플랫폼 {

    public FaceBook(String 유저아이디) {
        super("FaceBook", 유저아이디);
    }

    @Override
    public void post(String content) {
        System.out.println("[FaceBook] " + 유저아이디 + "님이 글을 올렸습니다: " + content);
    }

    @Override
    public void like(String targetUser) {
        System.out.println("[FaceBook] " + 유저아이디 + "님이 " + targetUser + "님의 글에 좋아요를 눌렀습니다.");
    }
}
