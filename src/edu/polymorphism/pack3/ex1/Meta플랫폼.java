package edu.polymorphism.pack3.ex1;


/*
*  Meta 플랫폼을 추상클래스 변경후
*  FaceBook 과 Instargram 에서 implements 없이
* post () 기능과 like() 기능을 사용할 수 있도록 추상메서드로 설정
*
* */
public class Meta플랫폼 {
    protected  String 플렛폼이름;
    protected  String  유저아이디;


    // 메서드 생성자 = main을 실행했을떄 데이터를 담을 수 있도록 공간을 생성해주는 메서드
    // new Meta플랫폼() 특별한 기준이나 규칙없이                          새로운 공간을 생성
    // new Mata 플랫폼(String String) 플랫폼이름이랑 유저아디가 존재해야지 공간을 생성하는거
    public Meta플랫폼() {
    }
    public Meta플랫폼(String 플렛폼이름, String 유저아이디) {
        this.플렛폼이름 = 플렛폼이름;
        this.유저아이디 = 유저아이디;
    }

    //게터 와 세터  게터 : 클라이언트나 DB에서 전달받은 데이터를 사용할 수 있도록 하는 기능
    //              세터 : 클라이언트한테 전달 받은 데이터를 프로그램이 실행되는 동안 임시로 저장하여 보유하고 있는 기능
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

    // 기타 메서드 : 보통 기타 메서드의 경우  또한 service 문서로 분류해서 작성

    public void login(){
        System.out.println(유저아이디 + "님이" + 플렛폼이름 +"에 로그인 했습니다.");
    }
    public void logout(){
        System.out.println(유저아이디 + "님이" + 플렛폼이름 +"에 로그아웃 했습니다.");
    }
}
