package edu.collection.pack4.Run;

import edu.collection.pack4.model.Member;
import edu.collection.pack4.service.멤버기능서비스;

import java.util.Scanner;

public class 맴버실행파일 {

    public static void main(String[] args) {

        // 맴버 기능서비스 와 다양한 모델을 활용해서 프로그램 실행

        Scanner sc = new Scanner(System.in); // html 화면 대신 사용
        Member  m1 = new Member();
        멤버기능서비스 service = new 멤버기능서비스();
        new Member().set맴버이름("홍길동");
        new Member().set맴버이름("강말숙");
        // 공간을 생성하고 공간안에 홍길동 이나 강말숙 설정
        // 하여 사람이 알 수 있는 주소명칭을 붙여주는것
        // 공간주소명칭을 변수이름으로 설정
        // 공간마다 이름, 핸드폰번호, 이메일 과 같은 데이터를 각 고객에 맞게 공간에서 갖고 있는 상테

        System.out.println("우리와 함꼐 다 같이 [맴버] 가 되자! ");
        System.out.println("=".repeat(10 )+"[ 맴 버 회 사 ]"+"=".repeat(10));

        // html 에서 사용자가 키보드로 작성한 유저데이터
        System.out.println(" 회원가입을 진행합니다. ");
        System.out.println(" 성함을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println(" 휴대폰 번호 를 입력하세요 : ");
        String phoneNumber = sc.nextLine();
        System.out.println(" 이메일 를 입력하세요 : ");
        String email = sc.nextLine();

        Member m2 =new Member(name,phoneNumber,email);

        //.맴버조회(name,phoneNumber,email);
    }
}
