package edu.practice.day4;

public class PracticeRun {

    public static void main(String[] args) {


        // 객체 생성 - 필수 생성자 이용
        Student s1 = new Student("김자바", "2024001", 85);
        Student s2 = new Student("박코딩", "2024002", 45);

        // 정보 출력
        s1.displayInfo();
        s2.displayInfo();


    }
}
