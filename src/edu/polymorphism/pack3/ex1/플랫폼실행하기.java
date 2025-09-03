package edu.polymorphism.pack3.ex1;

public class 플랫폼실행하기 {
    public static void main(String[] args) {
        Meta플랫폼 f1 = new FaceBook("hong123");
        Meta플랫폼 i1 = new Instagram("kim456");

        f1.login();
        f1.post("오늘 날씨 좋네요~");
        f1.like("kim456");
        f1.logout();

        System.out.println("----------------------------");

        i1.login();
        i1.post("여행 사진 업로드 📷");
        i1.like("hong123");
        i1.logout();
    }
}
