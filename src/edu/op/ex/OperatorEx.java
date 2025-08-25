package edu.op.ex;

// 폴더위치 + 파일이름 생성방법
// .활용해서 폴더 수분 후 파일명칭 작성
// edu.op.ex.OperatorEx

import java.util.Scanner;

/**
 *
 * 기능작성용 클래스
 * */
public class OperatorEx {
    /* 자바에선 모든 기능을 class 내부에서 작성하기 떄문에
     * 대부분의 기능을 메서드 형태로 사용
     *  파일이름.기능이름()
    * */
    // 메서드(기능) 호출 테스트
    public  void  test(){
        System.out.println("test");
    }
     /**
      * 입력 받은 정수가 3의 배수가 맞는지 확인하는 기능
      * */
    public  void method1(){
        Scanner sc =new Scanner(System.in);
        System.out.print("숫자를 입력하세요:");
        int a = sc.nextInt();

        //boolean 변수 이름 앞에  is 단어를 붙이므러 true / false를 위한 변수이름 임을 표시
        // 위에서 sc.nextInt(); 내부 소비자 가 작성한 숫자 입력값을 a 변수이름에 저장한 후
        // a를 3으로 나누었을때 나머지가 0이 맞으면 3의배수
        boolean isTrue = (a % 3 == 0);

        // %d = decimal % b = boolean
        System.out.printf("%d는 3의 배수가 맞습니다. : %b" ,a,isTrue);


    }
}
