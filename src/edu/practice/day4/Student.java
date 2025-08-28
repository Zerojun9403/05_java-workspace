package edu.practice.day4;

public class Student {

    /*
    * **요구사항**:

        - private 필드: `name(String)`, `studentId(String)`, `score(int)`
        - 기본생성자와 필수생성자 작성
        - getter, setter 메서드 작성
        - `displayInfo()` 메서드로 학생 정보 출력
        - `isPass()` 메서드로 60점 이상이면 "합격", 미만이면 "불합격" 반환
    *
    *
    *
    * */

    private  String name;
    private  String studentId;
    private  int score;

    public static final String STUDENTINFO = "학생정보";

    // 필수 기능 생성자
    public Student(String name, String studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }
     //static 초기화 블럭
     static {
         System.out.println("=== " +  STUDENTINFO + " 시스템 시작 ===");
     }


    // 학생 정보 출력 메서드
    public void displayInfo() {
        System.out.println("학생명: " + name);
        System.out.println("학번: " + studentId);
        System.out.println("점수: " + score + "점");
        System.out.println("결과: " + isPass());
        // 같은 클래스 내에서 메서드를 호출할떄 클래스 명칭이나 객체 변수 명칭을 생략하고 호출 할수 있다.
        // return 값이 존재할떄
        System.out.println(); // 줄바꿈
    }

    // 합격 여부 반환 메서드
    public String isPass() {
        return (score >= 60) ? "합격" : "불합격";
    }
}
