package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {

    public static void main(String[] args) {
        // 올바른 static 접근 방식
        System.out.println("==== 게스트하우스 방문자 관리 시스템 ====");
        System.out.println("=== 게스트 하우스 공통정보 ==="); //게스트 하우스 자체에서 제공
        System.out.println("게스트 하우스 명 : " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("WI-FI 비밀번호 :  " + GuestHouse.WIFI_PASSWORD);

        System.out.println("=== 게스트 하우스 운영 규정(static final)===");
        System.out.println("체크인 시간 : " + GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간 : " + GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일수  : " + GuestHouse.MAX_STAY_DAY + "일");
        System.out.println("최소 숙박일수: " + GuestHouse.MIN_STAY_DAY + "일");

        /*
         *  Scanner 이용해서 고객의 정보 저장
         *  while 문을 활용해서 0번을 입력하면 고객정보 입력 종료
         */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== 고객 정보 입력 ===");
            System.out.print("고객 이름 입력 (종료: 0) : ");
            String name = sc.nextLine();

            // 0번 입력 시 종료
            if (name.equals("0")) {
                System.out.println("고객 정보 입력을 종료합니다.");
                break;
            }
            System.out.println("체크인 날짜를 입력하세요.(예 : 2025-01-01) : ");
            String date = sc.nextLine();

            System.out.println("방번호를 입력하세요 : ");
            int room = sc.nextInt();
            sc.nextLine();// nextInt 이후 생성되는 enter 처리

            GuestHouse guest = new GuestHouse();
            // 방문자 정보
            guest.setGuestName(name);
            guest.setCheckInDate(date);
            guest.setRoomNumber(room);
            /*
            * 필요한 타입: class 파일에 속성명칭 왼쪽에 작성한 자료형 타입
                int
                제공된 타입: class 파일이랑 일치하지 않고 , 추후 class 내부에 작성한 변수 이름에 데이터를 저장 하겠다.
                String
                클래스에 작성한 데이터 타입을 변경할것인가? 클래스 내부에 작성한 변수이름에 알맞게 전달한 데이터 타입을 수정할 것인가?
                클래스 에 작성한 초기 데이터 타입은 수정 자제
           */

            // static 변수 확인
            // ( totalCount 최초 1회 실행이기 때문에 guest1 이라고 작성해서 호출하는 대신
            // GuestHouse라는 클래스 이름으로 호출 하는 것이 맞으므로 자동완성에서 누락되는것이 맞음)
            System.out.println("guest 이 보이는 총 방문자 수 : " + guest.totalCount); //GuestHouse.totalCount

            // 체크인 진행
            System.out.println("----- 체크인 후 방문자수 변화 -----");
            guest.checkIn();
            System.out.println("=== 방문자별 개별 정보 ===");
            guest.guestInfo();


        }
        sc.close();
    }
}

