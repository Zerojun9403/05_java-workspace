package edu.oop.matching;

/* 결혼 정보 회사 실행만 진행하는 클래스 */

public class MatchingMemberRun {

    public static void main(String[] args) {
        MatchingService service = new MatchingService();
        service.displayMenu();
    }
}
