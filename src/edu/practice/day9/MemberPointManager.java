package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class MemberPointManager {
    // 회원ID : 포인트
    Map<String, Integer> pointMap = new HashMap<>();

    // ===== 생성자에서 초기 데이터 세팅 =====
    public MemberPointManager() {
        pointMap.put("user01", 1000);
        pointMap.put("user02", 1500);
        pointMap.put("user03", 500);
    }

    // 신규 회원 등록
    void registerMember(String memberId) {
        if (pointMap.containsKey(memberId)) {
            System.out.println("이미 존재하는 ID입니다.");
        } else {
            pointMap.put(memberId, 0);
            System.out.println(memberId + " 님이 신규 회원으로 등록되었습니다.");
        }
    }

    // 포인트 적립
    void earnPoints(String memberId, int points) {
        if (pointMap.containsKey(memberId)) {
            int current = pointMap.get(memberId);
            int newTotal = current + points;
            pointMap.put(memberId, newTotal);
            System.out.println(memberId + " 님에게 " + points +
                    " 포인트가 적립되었습니다. 현재 포인트: " + newTotal);
        } else {
            System.out.println("존재하지 않는 회원 ID입니다.");
        }
    }

    // 포인트 사용
    void usePoints(String memberId, int points) {
        if (pointMap.containsKey(memberId)) {
            int current = pointMap.get(memberId);
            if (current >= points) {
                int newTotal = current - points;
                pointMap.put(memberId, newTotal);
                System.out.println(memberId + " 님이 " + points +
                        " 포인트를 사용했습니다. 남은 포인트: " + newTotal);
            } else {
                System.out.println("포인트가 부족합니다. 현재 포인트: " + current);
            }
        } else {
            System.out.println("존재하지 않는 회원 ID입니다.");
        }
    }

    // 전체 회원 포인트 조회
    void displayAllMembers() {
        System.out.println("--- 전체 회원 포인트 정보 ---");
        if (pointMap.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
        } else {
            for (String memberId : pointMap.keySet()) {
                int points = pointMap.get(memberId);
                System.out.println("ID: " + memberId + ", 포인트: " + points);
            }
        }
    }

    // ===== 테스트용 main =====
    public static void main(String[] args) {
        MemberPointManager manager = new MemberPointManager();

        // 초기 데이터 확인
        manager.displayAllMembers();

        // 신규 회원 등록
        manager.registerMember("user01"); // 이미 존재
        manager.registerMember("user04"); // 신규 등록

        // 포인트 적립
        manager.earnPoints("user02", 300);
        manager.earnPoints("user05", 200); // 없는 회원

        // 포인트 사용
        manager.usePoints("user03", 200);
        manager.usePoints("user03", 500); // 부족한 경우
        manager.usePoints("user99", 100); // 없는 회원

        // 최종 전체 출력
        manager.displayAllMembers();
    }
}
