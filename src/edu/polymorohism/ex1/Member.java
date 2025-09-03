package edu.polymorohism.ex1;
/*
* 부모 클래스에 해당
* 일반회원, VIP 회원
* 필수로 Member 클래스를 상송 받는 자식 클래스는 각 회원 타입에서 할인율 다르게 구현
*  로그인 로그아웃은 자식 클래스에서 굳이 추가적으로 구현하지 않아도 됨
* */

public abstract class Member {

    // 필드 인스턴스 변수 속성
    protected  String memberId;
    protected  String memberIName;
    protected  String memberEmail;

    // 기능들 () 붙으면 메서드 ~ ~!
    // 디폴트(기본) 생성자 메서드
    public Member() {
    }

    // 파라미터(매개변수) 생성자 메서드
    public Member(String memberId, String memberIName, String memberEmail) {
        this.memberId = memberId;
        this.memberIName = memberIName;
        this.memberEmail = memberEmail;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberIName() {
        return memberIName;
    }

    public void setMemberIName(String memberIName) {
        this.memberIName = memberIName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    //  수정이 필요없이 공통 실행 기능 - 모든 회원이 동일하게 재활용 없이 사용할 기능
    public void login(){
        System.out.println(getMemberIName() + "님이 로그인 했습니다. ");
    }
    public void logout() {
        System.out.println(getMemberIName() + "님이 로그아웃 했습니다. ");
    }
    //비추상 클래스에 추상 메서드가 있습니다 -> public 과 class  사이에 abstract
    // 필수로 자식클래스에서 작성해야한다는 표기가 존재하지 않는데
    // 저(abstract) 를 쓴다 합니다.
    public  abstract double 할인율();


    // 일반Member = 보유하고 있는 쿠폰과 혜택이 존재하지 않습니다.
    // 구독 서비스에 따라 쿠폰 과 혜택을 받으실 수 있습니다.

    protected String memberName;   // 회원 이름
    protected String grade;        // 등급 (일반, 프리미엄, VIP)

    // 생성자

    public Member(String grade, String memberName) {
        this.grade = grade;
        this.memberName = memberName;
    }

    // 회원 공통 정보 확인
    public void info() {
        System.out.println("회원명: " + memberName + " / 등급: " + grade);
    }

    // 등급별 쿠폰과 혜택 출력 → 자식이 반드시 구현해야 함
    public abstract void 쿠폰과혜택();

    // 프리미엄Memver = 현재 ㅇㅇㅇ 쿠폰을 보유하고 있습니다.
    // 아쉽게도 혜택은 존재하지 않습니다.
    //  VIP로 구독 업그레이드 하기




    // VIPMember =  현재 ㅇㅇㅇ 쿠폰과 ㅇㅇㅇ 해택 이용 가능합니다.

    // 를 MemberSerivce 에서 회원, 쿠폰과 해택으로 확인하기
}
