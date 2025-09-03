package edu.polymorohism.ex1;
/*
 *  부모클래스인 Member 상속 받을 자식 클래스
 *
 *
 * */
public class 프리미엄Member extends Member {

    private  String 쿠폰;

    // 생성자
    public 프리미엄Member(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }

    public 프리미엄Member(String memberId, String memberIName, String memberEmail) {
        super(memberId, memberIName, memberEmail);
    }

    public 프리미엄Member(String memberId, String memberIName, String memberEmail, String 쿠폰) {
        super(memberId, memberIName, memberEmail);
        this.쿠폰 = 쿠폰;
    }

    public 프리미엄Member() {
    }

    // getter & setter
    public String get쿠폰() {
        return 쿠폰;
    }

    public void set쿠폰(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }

    @Override
    public double 할인율() {
        return 0.15; // 15%할인
    }
}
