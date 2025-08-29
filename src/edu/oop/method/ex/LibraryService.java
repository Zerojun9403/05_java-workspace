
package edu.oop.method.ex;

import edu.oop.method.Student;

import java.util.Scanner;

/**
 * 도서관 회원 관리 기능 시스템 클래스
 */
public class LibraryService {
    // 필드 인스턴스 변수 속성
    Scanner sc = new Scanner(System.in);
    LibraryMember m1 = new LibraryMember("LIB001", "김독서", "010-1111-2222", 25); // -> m1 만 사용추가  Array -> ArrayList 를 이용해서 사용 예정
    LibraryMember m2 = null;
    LibraryMember m3 = null;

    public void displayMenu() {
        int input;
        while (true) {
            System.out.println("""
                    === 멤버 관리 프로그램 ===
                    1. 회원 등록
                    2. 회원 정보 확인
                    3. 회원 정보 수정
                    4. 도서 대출
                    5. 도서 반납
                    6. 도서관 입장/퇴장
                    7. HTML 역량 비교하기
                    0. 도서관 통계 확인
                    """);

            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            switch (input) {
                case 1: // 회원 등록
                    System.out.println("회원을 등록할 슬롯을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    int select = sc.nextInt();
                    // createMember() 메서드 호출하여 새 회원 생성
                    if (select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) m1 = createMember();
                    else if (select == 2) m2 = createMember();
                    else m3 = createMember();
                    break;

                case 2: // 회원 정보 확인
                    System.out.println("회원 정보를 확인할 번호를 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // memberInform() 메서드 호출하여 회원 정보 출력
                    select = sc.nextInt();
                    // createMember() 메서드 호출하여 새 회원 생성
                    if (select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) memberInform(m1);
                    else if (select == 2) memberInform(m2);
                    else memberInform(m3);
                    break;

                case 3: // 회원 정보 수정
                    System.out.println("정보를 수정할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // updateMemberInfo() 메서드 호출
                    select = sc.nextInt();
                    if (select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) updateMember(m1);
                    else if (select == 2) updateMember(m2);
                    else updateMember(m3);

                    break;

                case 4: // 도서 대출
                    System.out.println("도서를 대출할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // borrowBooks() 메서드 호출
                    select = sc.nextInt();
                    if (select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) borrowBooks(m1);
                    else if (select == 2) borrowBooks(m2);
                    else borrowBooks(m3);

                    break;


                case 5: // 도서 반납
                    System.out.println("도서를 반납할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    // returnBooks() 메서드 호출
                    select = sc.nextInt();
                    if (select < 1 || select > 3) {
                        System.out.println("잘못된 번호입니다. 1~3 중선택하세요.");
                        return;
                    } else if (select == 1) returnBooks(m1);
                    else if (select == 2) returnBooks(m2);
                    else returnBooks(m3);
                    break;

                case 6: // 도서관 입장/퇴장
                    System.out.println("1=입장 / 2=퇴장");
                    System.out.print("선택: ");
                    // enterLibrary() 또는 exitLibrary() 메서드 호출
                    break;

                case 7: // 도서관 통계 확인
                    System.out.println("=== 도서관 운영 통계 ===");
                    // static 변수들과 상수들 출력
                    break;
            }
        }

    }

    private LibraryMember createMember() {
        System.out.print("맵버쉽 정보 입력세요 : ");
        String createInfo = sc.next();
        System.out.print("맵버쉽 이름을 입력세요 : ");
        String createName = sc.next();
        System.out.print("맵버쉽 번호를 입력세요 : ");
        String createNumber = sc.next();
        System.out.print("맵버쉽 나이를 입력세요 : ");
        int newAge = sc.nextInt();

        return new LibraryMember(createInfo, createName, createNumber, newAge);

    }

    private String memberInform(LibraryMember member) {

        // String. format() =  (static 메서드로 만들어짐) 정해진 형식에 원하는 값들을 끼워 넣어서 새로운 문자열을 만드는 매서드
        // String.toString()  = ( 일반 메서드로 만들어짐) 객체가 가진 데이터를 문자열로 파악하기 위해 만들어짐
        // 위와 같은 자바 개발자가 만든 기능을 활용하지 않고 출력 가능
        // member.getMembershipId() + "/" + member.getMemberName() + "/" + member.getPhoneNumber()
        // Sting+int -> 문자열에 숫자 이어붙여 문자열 처리됨
        return member.getMembershipId() + "/" + member.getMemberName() + "/" + member.getPhoneNumber() + member.getAge();
    }

    private void updateMember(LibraryMember member) {
        System.out.println("개명한 회원 의 이름을 입력하세요 : ");
        String newName = sc.next();

        // 맴버 이름을 새로운이름으로 변경
        member.setMemberName(newName);
        System.out.println("회원의 정보가 수정되었습니다. ");
    }

    /* 원하는 권수 만큼 책 대출
     * 대출의 최대는 10
     * */
    private void borrowBooks(LibraryMember member) {
        System.out.print("대출할 책 권 수를 입력하세요 : ");
        int bookCount = sc.nextInt();

        int result = member.getBorrowedBooks() + bookCount;

        if (result > LibraryMember.MAX_BORROW_BOOKS) {
            System.out.println("최대" + LibraryMember.MAX_BORROW_BOOKS + "권 만 대출 가능합니다.");
        } else {
            member.setBorrowedBooks(result);
            System.out.println(bookCount + "권 대출 완료. 총 대출 중인 도서 : " + member.getBorrowedBooks() + "권");
        }
    }



    /*
    * @param member m1,m2,m3 가 들어올 위치
    *
    * */
    private  void returnBooks(LibraryMember member){

        // 반납할 권수를 입력하세요
        System.out.print("반납할 책 권 수를 입력하세요 : ");
        int bookCount = sc.nextInt();

        // result = borrowedBooks - bookCount
        int result = member.getBorrowedBooks() - bookCount;
        // result < 0 반납할 도서가 없습니다.
        if(result < 0){
            System.out.println("반납 할 도서가 없습니다.");
        } else {//else borrowedBooks = result;
            // 00권 반납완료. 남은 대출도서borrowedBooks
            System.out.println(bookCount + "권 반납 완료 , 납은 대출권수"+member.getBorrowedBooks());
        }


    }
}






