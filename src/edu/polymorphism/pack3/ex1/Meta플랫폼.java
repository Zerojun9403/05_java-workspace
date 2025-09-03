package edu.polymorphism.pack3.ex1;

/*
 * Meta플랫폼을 추상클래스로 변경
 * FaceBook과 Instagram에서 extends로 상속받아
 * 반드시 post(), like() 기능을 구현하도록 강제
 */
public abstract class Meta플랫폼 {
    protected String 플렛폼이름;
    protected String 유저아이디;

    // 기본 생성자
    public Meta플랫폼() {}

    // 매개변수 생성자
    public Meta플랫폼(String 플렛폼이름, String 유저아이디) {
        this.플렛폼이름 = 플렛폼이름;
        this.유저아이디 = 유저아이디;
    }

    // 게터 & 세터
    public String get플렛폼이름() {
        return 플렛폼이름;
    }
    public void set플렛폼이름(String 플렛폼이름) {
        this.플렛폼이름 = 플렛폼이름;
    }
    public String get유저아이디() {
        return 유저아이디;
    }
    public void set유저아이디(String 유저아이디) {
        this.유저아이디 = 유저아이디;
    }

    // 공통 기능
    public void login() {
        System.out.println(유저아이디 + "님이 " + 플렛폼이름 + "에 로그인 했습니다.");
    }

    public void logout() {
        System.out.println(유저아이디 + "님이 " + 플렛폼이름 + "에 로그아웃 했습니다.");
    }

    // 자식 클래스에서 반드시 구현해야 하는 추상 메서드
    public abstract void post(String content);
    public abstract void like(String targetUser);
}
