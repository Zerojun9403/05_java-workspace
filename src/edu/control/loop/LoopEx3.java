package edu.control.loop;
/**
 * 루프 기능용 클래스
 * 문자열 /  while 문
 *
 */
import java.util.Scanner;
public class LoopEx3 {

    Scanner sc = new Scanner(System.in);

    public void  method1(){
        // 문자열.charAt(인덱스)  : 인덱스 번째 문자 하나를 얻어와 반환
        // 문자열.length() : 문자열의 길이(메서드)
        String str = "Hello World";


        //  str 문자열의 총길이를 length() 메서드를 활용하여 가져오고
        //  문자열의 문자를 하나씩 charAt으로 출력하는 기능
        //  문자열 = 문자+나열 = String
        for(int i=0; i<str.length(); i++){
            System.out.println("i의 값"+i);
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
    public void  method2(){

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

}
