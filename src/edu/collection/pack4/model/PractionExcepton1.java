package edu.collection.pack4.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PractionExcepton1 {

        /*
        기능 명칭 : method1
         두 수 를 입력받아 눈 몫 구하기
         정수 입력 1 :
         정수 입력 2 :
         System.out.println(정수입력1 / 정수입력2);
         에 대해 수행하고 ,
         정수 입력2 : 를 0으로 입력했을때 발생하는 예외를
         catch 처리한 후
         sout 출력 문으로 0 으로 숫자를 나눌 수 없습니다.

         성공 실패 관계없이 프로그램 종료합니다.
         띄우기

     */

     /* 단축키 : 코드 블록을 드래그 한 후 Ctrl + alt +t 를 작성하면
         if 부터 try-catch while 등 코드블록에 대한 상황을 설정 을 할 수 있는
         블록들이 나옴
      */


    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두수를 입력 받아 나누 몫 구하기");
        System.out.print("정수입력 1: ");
        int input1 = sc.nextInt();
        System.out.print("정수입력 2: ");
        int input2 = sc.nextInt();
        try {
            // 모든  코드를 작성하기 보다는 문제가 발생할 것 같은 구문만 주로 작성
            System.out.println("나눈값의 결과 : " + input1 / input2);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            // 다른 방법을 시도하겠습니까 ?  +,/, 와 같은 행동을 유도할수 있다.
        }catch (InputMismatchException e){
            System.out.println("숫자 데이터만 가능합니다.");
        }
        catch (Exception e){
            System.out.println("개발자가 예기치 못한 문제가 발생했습니다.");
            System.out.println("회사에 문제를 보고 전달하기 YES / NO");
        }
        finally {
            System.out.println("프로그램을 종료합니다.");
        }


    }
}
