package edu.polymorohism.ex1;

public class VIPMember extends Member{
    private  String 쿠폰;
    private  String 해택;

    public VIPMember() {
    }

    public VIPMember(String memberId, String memberIName, String memberEmail) {
        super(memberId, memberIName, memberEmail);
    }

    public VIPMember(String memberId, String memberIName, String memberEmail, String 쿠폰, String 해택) {
        super(memberId, memberIName, memberEmail);
        this.쿠폰 = 쿠폰;
        this.해택 = 해택;
    }

    public String get쿠폰() {
        return 쿠폰;
    }

    public void set쿠폰(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }

    public String get해택() {
        return 해택;
    }

    public void set해택(String 해택) {
        this.해택 = 해택;
    }

    @Override
    public double 할인율() {
        return 0.25; // 25% 할인
    }
}
