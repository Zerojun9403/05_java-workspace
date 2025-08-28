package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {

    public static void main(String[] args) {
        System.out.println("==== 게스트하우스 방문자 관리 시스템 ====");

        GuestHouse guest = new GuestHouse();
        /*
         *  Scnner 이용해서 고객의 정보 저장
         *  while 문을 활용해서 0번을 입력하면 고객정보 입력 종료
         *
         *
         */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== 고객 정보 입력 프로그램 ===");
            System.out.print("고객 이름 입력 (종료: 0) : ");
            String name = sc.nextLine();

            // 0번 입력 시 종료
            if (name.equals("0")) {
                System.out.println("고객 정보 입력을 종료합니다.");
                break;
            }


            // 방문자 정보
            guest.setGuestName("김여행");
            guest.setCheckInDate("2025-08-27");
            guest.setRoomNumber(201);


            // static 변수 확인
            // ( totalCount 최초 1회 실행이기 때문에 guest1 이라고 작성해서 호출하는 대신
            // GuestHouse라는 클래스 이름으로 호출 하는 것이 맞으므로 자동완성에서 누락되는것이 맞음)
            System.out.println("guest1 이 보이는 총 방문자 수 : " + guest.totalCount); //GuestHouse.totalCount

            // 체크인 진행
            System.out.println("----- 체크인 후 방문자수 변화 -----");

            guest.checkIn(); // 방문자 수 1 증가
            System.out.println("guest1 이 보이는 총 방문자 수 : " + guest.totalCount); //GuestHouse.totalCount


            // 올바른 static 접근 방식

            System.out.println("=== 게스트 하우스 공통정보 ==="); //게스트 하우스 자체에서 제공
            System.out.println("게스트 하우스 명 : " + GuestHouse.GUESTHOUSE_NAME);
            System.out.println("WI-FI 비밀번호 :  " + GuestHouse.WIFI_PASSWORD);

            System.out.println("=== 게스트 하우스 운영 규정(static final)===");
            System.out.println("체크인 시간 : " + GuestHouse.CHECK_IN_TIME);
            System.out.println("체크아웃 시간 : " + GuestHouse.CHECK_OUT_TIME);
            System.out.println("최대 숙박일수  : " + GuestHouse.MAX_STAY_DAY + "일");
            System.out.println("최소 숙박일수: " + GuestHouse.MIN_STAY_DAY + "일");


            System.out.println("=== 방문자별 개별 정보 ===");
            guest.guestInfo();


        }
    }
}
