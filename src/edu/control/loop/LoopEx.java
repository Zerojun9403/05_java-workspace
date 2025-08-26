package edu.control.loop;

import java.util.Scanner;/*
     * 루프 기능 설정요 클래스
     *
     * */
public class LoopEx { //<HTML> 과 같이 페이지 내 코드 시작을 나타내는 구문

    /*
    *
    * 1부터 10까지 출력하기
    *
    * */

    public void method1(){
        /*
        *  초기식 최초 1회 변수 이름의 데이터를 설정하는 구문
        *  조건식 최초 1회 변수 이름의 데이터를 기반으로 참 / 거짓 인지 판별하는 구문
        *         참일 경우 중괄호 내에 존재하는 코드 구문 수행
        *         거짓일 경우 중괄호 탈출
        *  즘감식 중괄호 내에 존재하는 구문을 수행하고 조건식을 판별하기 전에
        *    변수이름의 데이터를 증가하거나 감수하는 구문
        * */
        for(int i =1; i<=10; i++){
            System.out.println(i);
        }

    }

    public void method2(){

        /*
        * 코드에 대한 설명 작성 사용하는 주석
        * 두 수를 입력 받아 1씩 증가하며 반복 출력하기
        * - 입력 받은 두 수중에서
        * 작은 값이 초기식 , 큰 값이 조건식에 사용되는 작성
        * 같은 경우 초기식 a 변수 이름 b  변수이름
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2가지를 입력하세요 : ");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        for(int i = input1; i<=input2; i++){
            System.out.println(i);
        }
    }


    public void method3() {

        /*
         * 코드에 대한 설명 작성 사용하는 주석
         * 두 수를 입력 받아 1씩 증가하며 반복 출력하기
         * - 입력 받은 두 수중에서
         * 작은 값이 초기식 , 큰 값이 조건식에 사용되는 작성
         * 같은 경우 초기식 a 변수 이름 b  변수이름
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2가지를 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a가 b와 같거나 b보다 작을경우
        if(a <= b){
            for(int i=a; i<=b; i++){
                System.out.println(i);
            }
        }else {
            for(int i=b; i<=a; i++){
                System.out.println(i);
            }
        }
    }

    /*
    * 최대, 최소갑 구하기(Math)
    * - Java API 활요한 방벙
    *
    * Math.min(a,b) =  수를 비교하여 최소값 찾는 기능
    * Math.max(a,b) =  수를 비교하여 최소값 찾는 기능
    *
    * 사용자로부터 두 수를 입력받고,
    *  입력 받은 수 중에서 작은 값과 큰 값을 변환
    *  최소값 부터 최대값 까지 for 문을 이용하여 추ㅡㄹ력
    *
    * 변수 이름 (int 최소 int 최대 int i)
    *
    * */

    public void method4() {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2가지를 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Math.min(a,b);

        // a가 b와 같거나 b보다 작을경우
        if(a <= max){
            for(int i = a; i<= max; i++){
                System.out.println(i);
            }
        }else {
            for(int i = max; i<=a; i++){
                System.out.println(i);
            }
        }
    }







} //<HTML> 과 같이 페이지 내 코드 조욜를 나타내는 구문

    /** 주의할 점
     * html 코드는 오류 최소화를 기반으로 작성하는 코드이기 때문에
     * html 코드를 벗어난 상태에서 태그를 작성하거나 텍스트를 작성하더라도
     * 문제가 발생하지 않음
     *
     * 하지만 자바는 코드 규칙을 준수하는 언어이기 때문에
     *
     * public class 파일 이름{
     *
     *
     *
     * }
     *
     * 의 중괄호를 벗어난 상태로 코드를 작성하면 에러발생!!!
     * 번드시 중괄호 내부에 코드 작성할 것
     */

