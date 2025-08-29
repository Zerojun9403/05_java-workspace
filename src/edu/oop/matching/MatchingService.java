package edu.oop.matching;

import java.util.Scanner;

/**
 * 결혼정보회사 회원 관리 서비스 클래스
 */
public class MatchingService {
    Scanner sc =  new Scanner(System.in);
    MatchingMember mm1 = new MatchingMember("TMP001","홍길동",20,'여',"기자");
    MatchingMember mm2 = null;

    public void displayMenu() {
        int input;

        while (true) {
            System.out.println("\n=== 더조은 결혼정보회사 관리 시스템 ===");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 정보 확인");
            System.out.println("3. 회원 정보 수정");
            System.out.println("0. 프로그램 종료");
            System.out.println("=====================================");

            System.out.print("메뉴 선택: ");
            input = sc.nextInt();

            switch (input) {
                case 1: registerMember(); break;
                case 2: viewMemberInfo(); break;
                case 3: updateMemberDetails(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    // --- 기능 메서드 ---
    public void registerMember() {
        // 변수를 선언할때는 클래스 명칭 바로 아래에 작성
        System.out.print("아이디를  작성하세요 : ");
        String newId = sc.nextLine();

        System.out.print("이름을 작성하세요 : ");
        String newName = sc.nextLine();
        System.out.print("나이를 작성하세요 : ");
        int newAge = sc.nextInt();
        System.out.print("성별를 작성하세요 : ");
        char newGender = sc.next().charAt(0);
        System.out.print("작업을 작성하세요 : ");
        String newJob = sc.next();

        if (checkAgeValid()) { // 가입 완성이 되는 경우 나이기준이 true 이면 가입완성
            MatchingMember.totalMemberCount++;
            System.out.println( mm1.getMemberName()+ "님이 회원가입하셨습니다. (회원ID: " + mm1.getMemberId() + ")");
        } else { // 나이 기준에서 false 가 되면 가입 불가
            System.out.println("가입 연령 기준(" + MatchingMember.MIN_AGE_LIMIT + "세 ~ " + MatchingMember.MAX_AGE_LIMIT + "세)에 맞지 않아 등록이 취소됩니다.");
        }
    }

    /*  회사에서 원하는 나이가 아니면 가입 불가*/
    public boolean checkAgeValid() {

        // this . MatchingMember 에서 private 가리키고 있는 필드 명칭
        // MatchingMember 를 mm1 이라는 이라는 변수명칭으로 호출
        return mm1.getAge() >= MatchingMember.MIN_AGE_LIMIT && mm1.getAge() <= MatchingMember.MAX_AGE_LIMIT;
    }

    private void updateMemberDetails(){
        System.out.println("어떤 정보를 수정 하시겠습니까?");
        System.out.print("1:이름 / 2: 나이 / 3.직업 >>");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1 :
                System.out.println("이름이 성공적으로 변경되었습니다 ");
                String memberName = sc.nextLine();
                mm1.setMemberName();
                break;
            case 2 :
                System.out.println("나이가 성공적으로 변경되었습니다");
                int memberAge = sc.nextInt();
                mm1.setAge();
                break;
            case 3 :
                System.out.println("직업 이 성공적으로 변경되었습니다");
                String memberJob = sc.nextLine();
                mm1.setJob();
                break;
            default:
                System.out.println("잘못된 선택입니다. ");
        }
        System.out.println();

    }

    public void updateMatchingScore(int scoreChange) {
        int newScore = this.mm1.getMatchingScore() + scoreChange;
        if (newScore >= 0 && newScore <= MatchingMember.MAX_MATCHING_SCORE) {
            //mm1.getMatchingScore() = newScore;
            mm1.setMatchingScore(newScore);
            System.out.println("매칭 점수가 " + scoreChange + "점 변경되었습니다. (현재: " + mm1.getMatchingScore() + "점)");
        } else {
            System.out.println("매칭 점수는 0 ~ " + MatchingMember.MAX_MATCHING_SCORE + "점 사이만 가능합니다.");
            System.out.println("요청이 취소되었습니다. (현재 점수: " + mm1.getMatchingScore() + "점 / 계산 결과: " + newScore + "점)");
        }
    }


    public void viewMemberInfo() {
        System.out.println("--- 회원 정보 ---");
        System.out.printf("ID: %s, 이름: %s, 나이: %d세, 성별: %c, 직업: %s, 매칭점수: %d점\n",
                mm1.getMemberId(), mm1.getMemberName(), mm1.getAge(), mm1.getGender(), mm1.getJob(), mm1.getMatchingScore());
    }
}

