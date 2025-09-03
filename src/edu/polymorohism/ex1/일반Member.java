package edu.polymorohism.ex1;

/*
*  부모클래스인 Member 상속 받을 자식 클래스
*
*
* */
public class 일반Member extends Member {


    // 자식클래스에서 부모 클래스에 작성된 필드만 사용하고,
    // 자식클래스는 필드를 작성하지 않은 채 메서드만 재정의 할 수 있음
    public 일반Member(String memberId, String memberIName, String memberEmail) {
        super(memberId, memberIName, memberEmail);
    }
    // Member 부모 클래스를 상속받으면 다른 건 몰라도 아래 할인율() 기능은
    // Member 클래스에서 필수로 재정의 하라했던 기능이기 떄문에 반드시 생성!!!

    @Override
    public double 할인율() {
        return 0.05;  //일반 맴버는 5% 할인
    }


}
