package edu.practice.day1;

import java.util.Scanner;

public class Exercise5 {


    public void method1() {
        /*
        - 출생년도를 입력받기 (2025년 기준으로 계산)
        - 현재 나이 계산
        - 10년 후 나이 계산
        - 성인 여부 판단 (20세 이상)
        - 결과를 표 형태로 깔끔하게 출력
        */
/*
        - `Scanner sc = new Scanner(System.in)`
        - `int birthYear` (출생년도)
                - `final int CURRENT_YEAR = 2025` (현재 년도 - 상수)
        - `int currentAge` (현재 나이)
        - `int futureAge` (10년 후 나이)
        - `boolean isAdult` (성인 여부)
        - 나이 계산: `currentAge = CURRENT_YEAR - birthYear`
        - 성인 판단: `isAdult = (currentAge >= 20)`

        **추가 기능**:
        - 띠 계산하기 (선택사항)
                - 나이를 12로 나눈 나머지로 띠 판별
                - `int zodiacIndex = currentAge % 12`
        - 0:원숭이, 1:닭, 2:개, 3:돼지, 4:쥐, 5:소, 6:호랑이, 7:토끼, 8:용, 9:뱀, 10:말, 11:양
*/
        Scanner sc = new Scanner(System.in);

        // 현재년도 상수
        final int CURRENT_YEAR = 2025;

        // 입력
        System.out.print("출생년도를 입력하세요: ");
        int birthYear = sc.nextInt();

        // 계산
        int currentAge = CURRENT_YEAR - birthYear;
        int futureAge = currentAge + 10;
        boolean isAdult = (currentAge >= 20);

        // 띠 계산 (선택)
        int zodiacIndex = birthYear % 12;  // 출생년도 기준으로 계산
        String[] zodiacs = {
                "원숭이", "닭", "개", "돼지", "쥐", "소",
                "호랑이", "토끼", "용", "뱀", "말", "양"
        };
        String zodiac = zodiacs[zodiacIndex];

        // 출력 (표 형태)
        System.out.println("\n===================================");
        System.out.println("출생년도\t현재나이\t10년후\t성인여부\t띠");
        System.out.println("------------------------------------");
        System.out.printf("%d\t\t%d\t\t%d\t\t%s\t\t%s\n",
                birthYear, currentAge, futureAge, isAdult ? "성인" : "미성년", zodiac);
        System.out.println("======================================");
    }

}

