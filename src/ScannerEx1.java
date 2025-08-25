import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEx1 {

    public static  void  main   (String[] args){

        /*
        * scanner 클래스
        *
        * - 사용자로 부터 입력 받기 위한 Java에서 제공하는 클래스
        *
        * - java.util 패키지에 존재
        *  -> import 구문 작성 필요
        *  -> java.util 내부 폴더안에 만들어진 Scanner class 를 호출하여 사용
        *   외부 라이브러리 > 자바버전폴더 > java.base 내에 유틸 폴더 내 존재
        *
        * Scanner .next()   : 단어(String) 1개 입력
        *                                       공백 문자 입력시 입력 종료
        * Scanner .nextLine()   : 문자열(String) 1개 입력
        *                                       엔터(개행 문자) 입력 시 입력 종료
        * Scanner .nextInt()   :  int형 정수 1개 입력
        * Scanner .nextLong()   :  long형 정수 1개 입력
        * Scanner .nextDouble()   : 실수 1개 입력
        * */

         // scanner 사용하기
         // 1. 클래스 위에 import 하는 구문 작성
        //  2.  import 한 Scanner 클래스를 이용해서 Scanner 객체 생성
        //  * system. in: 인텔리제이 실행창이나 CLI(CMD= 명력 프롬포트) 창에서 키보드로 입려


        Scanner sc = new Scanner(System.in);

        System.out.println("정수입력 1 :");
        int num1 = sc.nextInt(); // 다음 입력된 정수를 얻어와 num1에 넣어주기
        // 컴퓨터에서는 num 이라는 변수 이름 내에는 사용자가 작성한 사용자가 작성한 작성한 숫자값이 들어있음

        System.out.println("정수입력 2 :");
        int num2 = sc.nextInt();


        System.out.println("실수입력 : ");
        double num3 = sc.nextDouble();


        System.out.println("단어 입력(2개) : ");
        String word1 = sc.next();
        String word2 = sc.next();

        //********************************
        //  - next() / -nextInt() / -nextDouble() 등을 작성한 이후에
        // nextLine()  을 작성해야 하는 상황이오면
        // nextLine()  을 미리 한번 작성하기

        sc.nextLine();

        /*
        *
        * 자바스크립트에서는 변수 내부에 문자열, 숫자, 불리언 값의 구분이 존재하지 않음
        * 자바에서는 각 변수마다 메모리 할당량을 측정하기 위해서
        * 변수이름 내부에 넣어줄 값의 종류가 무엇인지를 결정해주고 ,.
        * 종류에 해당하는 값만 작성를 해야함
        *
        * 그렇지 않으면 Mismatch 와 같은 Exception 예외 상황이 발생해쑈다는 알람이 발생
        * */

        System.out.println("문장입력 : ");
        String str1 = sc.nextLine();

        // 자바에서는 print 로 시작하는 명칭 내에는 +를 이용해서 출력 구문 작성

        //          printf 만 예외적으로 , 를 사용할 수 있음 !!!!!!!!!!!!!
        // System.out.println("num에 들어있는 숫자 : " , num);

        System.out.println("num에 들어있는 숫자 : " + num1);

        System.out.printf("%d, %d, %f, %s, %s, %s",num1,num2,num3,word1,word2,str1);
    }


}
