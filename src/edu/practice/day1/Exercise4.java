package edu.practice.day1;

import java.util.Scanner;

public class Exercise4 {

    public void method1() {
        /*
        *
        * - 국어, 영어, 수학 점수를 각각 입력받기
          - 평균 점수 계산 (소수점 둘째 자리까지)
          - 평균에 따른 학점 출력:
                - 90점 이상: A
                - 80점 이상: B
                - 70점 이상: C
                - 60점 이상: D
                - 60점 미만: F
        * - `Scanner sc = new Scanner(System.in)`
          - `int korean, english, math` (각 과목 점수)
          - `double average` (평균 점수)
          - `char grade` (학점)
          - 평균 계산: `average = (korean + english + math) / 3.0`
          - if-else if 문 사용 (조건문은 다음 차시에 배우지만 도전해보세요!)
          - 또는 삼항연산자 활용
        *
        *
        *
        * */


        Scanner sc = new Scanner(System.in);

        // 점수 입력
        System.out.print("국어 점수 입력: ");
        int korean = sc.nextInt();

        System.out.print("영어 점수 입력: ");
        int english = sc.nextInt();

        System.out.print("수학 점수 입력: ");
        int math = sc.nextInt();

        // 평균 계산
        double average = (korean + english + math) / 3.0;

        // 학점 변수
        char grade;

        // 조건문으로 학점 판정
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // 결과 출력
        System.out.printf("평균 점수: %.2f\n", average);
        System.out.println("학점: " + grade);
    }
}


