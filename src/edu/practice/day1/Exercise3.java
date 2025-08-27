package edu.practice.day1;

import java.util.Scanner;

public class Exercise3 {


    public void method1() {
        /*
        * - Scanner로 섭씨온도(실수) 입력받기
          - 화씨온도 변환 공식: `화씨 = 섭씨 * 9 / 5 + 32`
          - 결과를 소수점 첫째 자리까지 출력
          - `Scanner sc = new Scanner(System.in)`
          - `double celsius` (섭씨온도)
          - `double fahrenheit` (화씨온도)
          - 변환 공식: `fahrenheit = celsius * 9 / 5 + 32`
        * - 상수(`final`)를 사용하여 변환 계수들을 정의해보세요
                - `final double RATIO = 9.0 / 5.0`
                - `final int OFFSET = 32`
        *
        * */

        // 상수 정의
        final double RATIO = 9.0 / 5.0;
        final int OFFSET = 32;

        Scanner sc = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하세요: ");   // 메시지 수정
        double celsius = sc.nextDouble();              // 섭씨 입력

        // 변환 공식
        double fahrenheit = celsius * RATIO + OFFSET;

        // 출력 (소수점 첫째 자리까지)
        System.out.printf("섭씨: %.1f°C → 화씨: %.1f°F\n", celsius, fahrenheit);
    }


}

