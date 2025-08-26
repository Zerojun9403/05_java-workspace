package edu.practice.day1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        /*
    * ```
        첫 번째 정수 입력: 10
        두 번째 정수 입력: 3

        === 계산 결과 ===
        10 + 3 = 13
        10 - 3 = 7
        10 * 3 = 30
        10 / 3 = 3.33
    *
    *   - `Scanner sc = new Scanner(System.in)`
        - `int num1, num2` (입력받을 정수들)
        - `int add, sub, mul` (덧셈, 뺄셈, 곱셈 결과)
        - `double div` (나눗셈 결과)
        - 나눗셈 계산 시 `(double) num1 / num2` 강제 형변환 활용
        - printf에서 `%.2f` 사용
    *
    * */

        Scanner sc = new Scanner(System.in);
        System.out.println("월을 입력하세요  : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int add = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        double div = (double) num1 / num2;

    }




}
