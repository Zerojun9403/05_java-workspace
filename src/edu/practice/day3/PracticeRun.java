package edu.practice.day3;

public class PracticeRun {

        public static void main(String[] args) {
            Practice1 p1 = new Practice1("Java 프로그래밍","김개발",25000);
            Practice2 p2 = new Practice2("Galaxy S24",0,true);
            Practice3 p3 = new Practice3();
            Practice4 p4 = new Practice4();
            Practice5 p5 = new Practice5();

            // 원하는 문제의 주석을 해제하고 실행하세요
            System.out.println("=== 문제 1: 도서 관리 클래스 ===");
            // 초기 정보
            p1.displayInfo();

            // 대출
            p1.borrowBook();
            p1.displayInfo();

            // 반납
            p1.returnBook();
            p1.displayInfo();

            System.out.println("\n=== 문제 2: 스마트폰 클래스 ===");

            p2.powerOn();
            p2.displayStatus();
            p2.useBattery(100);
            p2.displayStatus();

            p2.chargeBattery(0);
            p2.displayStatus();

            System.out.println("\n=== 문제 3: 은행계좌 업그레이드 ===");
            // p3.method3();

            System.out.println("\n=== 문제 4: 학생 성적 관리 시스템 ===");
            // p4.method4();

            System.out.println("\n=== 문제 5: 자동차 관리 시스템 ===");
            //p5.method5();
        }
    }


