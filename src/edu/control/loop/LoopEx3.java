package edu.control.loop;
/**
 * 루프 기능용 클래스
 * 문자열 /  while 문
 *
 */

import java.util.Scanner;

public class LoopEx3 {

    Scanner sc = new Scanner(System.in);

    public void method1() {
        // 문자열.charAt(인덱스)  : 인덱스 번째 문자 하나를 얻어와 반환
        // 문자열.length() : 문자열의 길이(메서드)
        String str = "Hello World";


        //  str 문자열의 총길이를 length() 메서드를 활용하여 가져오고
        //  문자열의 문자를 하나씩 charAt으로 출력하는 기능
        //  문자열 = 문자+나열 = String
        for (int i = 0; i < str.length(); i++) {
            System.out.println("i의 값" + i);
            System.out.println("i 위치의 문자 확인 : " + str.charAt(i));
            /*
             *
             * str은 문자열 이기 때문에 문장 전체에서 자리는 바라본다는 것 자체가 문제
             * */
            //System.out.println("i 위치의 문자 확인 : " + str(i));
        }
    }

    // while(조건식): 끝이 확실하지 않은 반복에 사용


    /*
     *  -1 이 입력 될때까지 정수를 계속 입력 받아
     * 입력 받은 수의 합계를 구하기
     *
     * 변수이름 : int sum = 0; 합계 누적적용 변수
     *           int input = 0; 입력 값을 저장 할 변수
     *
     *  while(조건이 참일 경우에만 지속적으로 실행 ){
     * }
     *  method2()
     * */
    public void method2() {

        int input = 0;
        int sum = 0;
        System.out.println("정수를 입력하세요 (-1 입력 시 종료):");

        while (true) {
            input = sc.nextInt(); // 정수 입력 받기

            if (input == -1) {   // 종료 조건
                break;
            }

            sum += input;        // 합계 누적
        }

        // 최종 결과 출력
        System.out.println("입력된 수의 합계: " + sum);

    }


    /*
     *
     * while 문을 활용해서
     * 0이 입력 될 떄 까지 정수를 계속 입력 받고
     * 0 입력시 누적된 합계
     */

    public void method3() {

        int input = 0;
        int sum = 0;
        System.out.println("정수를 입력하세요 (0 입력 시 종료):");

        while (true) {
            input = sc.nextInt(); // 정수 입력 받기

            if (input == 0)    // 종료 조건
                break;


            sum += input;        // 합계 누적
        }

        // 최종 결과 출력
        System.out.println("입력된 수의 합계: " + sum);

    }



    /*
     * do ~ while문
     *
     * 조건식이 뒤에 작성된 while 문
     * 최소 1회 이상은 반복을 무조건 보장
     * while 문이 false 여도 최초 1회는 무조건  true 일떄
     * 식을 실행 함.
     * */

    /**
     * 0이 입력될 때 까지 정수를 계속 입력 받고 0입력시 누적된 합계 출력
     */
    public void method4() {

        int input = 0;
        int sum = 0;
        System.out.println("정수를 입력하세요 (0 입력 시 종료):");

        do { //입력한 값이 0이 아닐때 반복
            input = sc.nextInt();
            sum += input;
        } while (input != 0);
        System.out.println("숫자 합계 :" + sum);
    }

    /**
     * 문자열을 입력 받아 i-- 를 이요해서 거꾸로 출력
     * <p>
     * String.length() + String.charAt() + for 문 활용
     * <p>
     * 메서드 명칭 method5()
     * 변수 이름 : String str int i
     */
    public void method5() {
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();

        int i = str.length() - 1; // 마지막 인덱스부터 시작

        // do-while문: 조건을 나중에 검사 → 최소 1번은 실행됨
        do {
            System.out.print(str.charAt(i));
            i--;  // 인덱스 감소
        } while (i >= 0);
        System.out.println();
    }


    /**
     *
     * Math.random() // 0.0<=값 <=1.0(double 소수타입형태)
     * Math.random() *10 // 0.0<=값 <=10.0 0이외 1부터 모두 10까지 범위 증가
     * (int)Math.random() *10 // 0<=값 <=10 (정수 변환)
     * (int)(Math.random() * 10)+ 1  // 1<=값 <=10(정수 변환)
     * <p>
     * 1~10 사이의 랸덤 숫자를 맞출떄 까지 반본3
     * Math.random() 활용 + 난수 -> 정수로 형 변환
     * 변수이름 : int answer input count
     * 만약에 정답 보다 사용자가 입력한 값이 크다면 -> 작성한 숫자보다 정답은 작습니다.
     * 만약에 정답 보다 사용자가 입력한 값이 작다면 -> 작성한 숫자보다 정답은 큽습니다.
     * 만약에 정답 과 일치 한다면  -> 정답입니다. .
     *
     */
    public void method6() {

        // 1~10 사이 난수 생성
        int answer = (int) (Math.random() * 10) + 1; // 1~10 난수 생성
        int input;
        int count = 0;

        System.out.println("1부터 10 사이의 숫자를 맞춰보세요!");

        do {
            System.out.print("숫자 입력: ");
            input = sc.nextInt();
            count++;

            if (input > answer)
                System.out.println("작성한 숫자보다 정답은 작습니다.");
            else if (input < answer)
                System.out.println("작성한 숫자보다 정답은 큽습니다.");
            else
                System.out.println("정답입니다!" + answer + "시도횟수" + count);


        } while (input != answer); // 정답을 맞출 때까지 반복
    }

    /**
     * 사용자로 부터 숫자 하나를 입력 받아 그 수의 구구단을 1부터 9까지 출력
     * 출력할 단 을 입력하세요 :
     * for 문을 활용한 반복만 존재
     * 1회 실행 후 종료
     * mathod7()
     *
     */

    public void method7() {
        System.out.print("출력할 단을 입력하세요: ");
        int dan = sc.nextInt();   // 사용자 입력

        // for문을 이용해서 1부터 9까지 곱하기
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %2d \n", dan, i, dan * i);
        }

    }

    /**
     * 비밀번호 : "java1234"
     * 사용자가 올바른 비밀번호를 입력 할 떄 까지 입력 다음
     * 입력 횟수가 5회를 초가하면 "접숙 차단합니다" 메세지를 출력하고 종료
     * do-while 문 활용 while(true) 조건 입력횟수가 5회를 초과했을 경우 break 활용
     * 시도횟수(0/5) 비밀번호를 입력하세요 :
     *
     * if(input.equals(cheeckPassword)){}
     *
     * 변수 이름 : String CheckPassword = "java1234"
     * String input = "" // 비밀번호 입력하고 입력된 비밀번호 데ㅐ이터 저장하는 변수 이름
     * int attempts = 0; // 시도횟수 데이터 저장하는 변수 이름
     * mathod8()
     */

    public void method8() {
        String checkPassword = "java1234"; // 올바른 비밀번호
        String input = "";                 // 사용자 입력값
        int attempts = 0;                  // 시도 횟수

        do {
            if (input.equals(checkPassword)) {
                System.out.println("로그인 성공!");
                break;
            } else {
                System.out.println("비밀번호가 올바르지 않습니다.");
            }

            if (attempts >= 5) {
                System.out.println("접속 차단합니다.");
                break;
            }

            System.out.printf("시도횟수(%d/5) 비밀번호를 입력하세요: ", attempts + 1);
           input = sc.nextLine();
            attempts++;

        } while (true);


    }
}







