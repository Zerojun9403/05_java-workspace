package edu.oop.field.pack3.ex;

public class ShoppingMallMember {


    /*  필드 영역  */
    // static :  공유 정보
    public static int totalMemberCount = 0; //전체 회원 수 (int)
    public static int dailyVisitorCount = 0; //일일 방문자 수 (int)

    /**
     * 공통 규정 (static final)
     **/
    public static final String SHOPPING_MALL_NAME = "더조은 온라인 쇼핑몰";
    public static final String SERVICE_CENTER_NUMBER = "1588-1234";
    public static final int MAX_CART_ITEMS = 50;
    public static final int MIN_PASSWORD_LENGTH = 8;


    /* * 개인 정보 (인스턴스 변수) * */
    private String memberId;
    private String memberName;
    private String email;
    private int cartItemCount;


    // 초기화 블럭
    // - 객체 생성시 필드를 {} 내의 값으로 초기화
    {
        memberId = "guest123";
        memberName = "게스트";
        email = "guest@tjemall.com";
        cartItemCount = 0;
    }

    // static 초기화 블럭
    // -> static 최초 1회만 읽음

    static {
        totalMemberCount = 0;
        dailyVisitorCount = 0;
        System.out.println("=== " + SHOPPING_MALL_NAME + " 시스템 시작 ===");
    }


    /* setter 부분 ->저장하는것 */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShoppingMallMember() {
    }

    /* getter 부분 ->  저장한것을 불러오는곳 */

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getEmail() {
        return email;
    }


    /* 기능 작성 영역 */

    public void joinMember() {
        totalMemberCount++;
        System.out.println(getMemberName() + "님이 회원가입 하셨습니다.(회원번호 : " + getMemberId() + ")");
    }

    public void visitSite() {
        dailyVisitorCount++;
        System.out.println(getMemberName() + "님이 사이트를 방문했습니다.");
    }

    // 장바구니 추가
    public void addToCart(int itemCount) {
        // char String은 equals 를 활용
        // static final 에 관계없이 >= > <= < == 과 같은 부등호는
        //     int                int            int    와 같이 숫자(실수, 정수)에만 가능
        if (MAX_CART_ITEMS >= cartItemCount + itemCount) {
            cartItemCount += itemCount; // 장바구니에 아이템 추가 가능
            System.out.println(getMemberName() + "님이 장바구니에 " + itemCount + "개 상품을 추가 했습니다. ");
        } else {
            System.out.println("장바구니 최대 수량 (" + MAX_CART_ITEMS + "개) 을 초과할 수 없습니다.");
        }
    }

    // 화원정보 출력
    public void printMemberInfo() {
        System.out.println("회원 ID  : " + memberId);
        System.out.println("회원명: " + memberName);
        System.out.println("이메일 : " + email);
        System.out.println("장바구니 : " + cartItemCount + "개");
    }

}
