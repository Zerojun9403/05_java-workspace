package edu.collection.pack4.model;
// @게터 세터 생성자 toSting 파라미터 생성자
public class Member {

    public static  final String 우리회사이름 ="[맴 버]";
    public static  String 회사사이트방문자수 ="5명";

    private  String 맴버이름;
    private  String  맴버핸드폰;
    private  String 맴버이메일;

    public Member() {
    }


    public Member(String 맴버이름, String 맴버핸드폰, String 맴버이메일) {
        this.맴버이름 = 맴버이름;
        this.맴버핸드폰 = 맴버핸드폰;
        this.맴버이메일 = 맴버이메일;
    }


    public String get맴버이름() {
        return 맴버이름;
    }

    public void set맴버이름(String 맴버이름) {
        this.맴버이름 = 맴버이름;
    }

    public String get맴버핸드폰() {
        return 맴버핸드폰;
    }

    public void set맴버핸드폰(String 맴버핸드폰) {
        this.맴버핸드폰 = 맴버핸드폰;
    }

    public String get맴버이메일() {
        return 맴버이메일;
    }

    public void set맴버이메일(String 맴버이메일) {
        this.맴버이메일 = 맴버이메일;
    }


}
