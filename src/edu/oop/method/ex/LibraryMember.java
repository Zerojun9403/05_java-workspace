package edu.oop.method.ex;

/* 도서관 회원관리 시스템*/

public class LibraryMember {

    /** *
     * * *공유 정보 (static)**
     *
     * - `totalMemberCount` : 전체 회원 수 (int)
     * - `currentVisitorCount` : 현재 도서관 방문자 수 (int)
     *
     * **공통 규정 (static final)**
     *
     * - `LIBRARY_NAME` : "스마트 도서관"
     * - `OPENING_HOURS` : "09:00 - 22:00"
     * - `MAX_BORROW_BOOKS` : 최대 대출 가능 도서 수 (10권)
     * - `MIN_AGE_LIMIT` : 최소 가입 연령 (14세)
     *
     * **개인 정보 (인스턴스 변수)**
     *
     * - `membershipId` : 회원증 번호 (String)
     * - `memberName` : 회원명 (String)
     * - `phoneNumber` : 전화번호 (String)
     * - `borrowedBooks` : 현재 대출 중인 도서 수 (int)
     * - `age` : 나이 (int)
     *
     *
     *
     * ** */

    public static int totalMemberCount;
    public static int currentVisitorCount;

    // static final 상수
    public static final String LIBRARY_NAME = "스마트 도서관";
    public static final String OPENING_HOURS = "09:00 - 22:00";
    public static final int MAX_BORROW_BOOKS = 10;
    public static final int MIN_AGE_LIMIT = 14;

    // 인스턴스 변수
    private String membershipId;
    private String memberName;
    private String phoneNumber;
    private int borrowedBooks;
    private int age;

    // 메서드 생성자 존재하는 생성자


    public LibraryMember() {
    }

    // 한번에 작성해서 넣어주는 묶음 setter 같은 역할 을 함
    // 데이터 저장 패키지
    public LibraryMember(String membershipId, String memberName, String phoneNumber, int age) {
        this.membershipId = membershipId;
        this.memberName = memberName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    {
        membershipId = "TEMP001";
        memberName = "임시회원";
        phoneNumber = "010-0000-0000";
        borrowedBooks = 0;
        age = 14;
    }

    static {
        totalMemberCount = 0;
        currentVisitorCount = 0;
        System.out.println("=== " + LIBRARY_NAME + " 시스템 초기화 완료 ===");
        System.out.println("운영시간: " + OPENING_HOURS);
    }
    // 메서드 getter setter
    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
