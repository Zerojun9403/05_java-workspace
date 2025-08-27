package edu.oop.field.pack1;

public class FildEx {

    //필드(Field)
    // - 객체의 속성을 나타냄

    // - 필드 == 맴버 변수

    // * 작성법 *
    // [접근제한자] [예악어] 자료형 변수 [=초기값];

    // 접근 제한자별 필드 선언

    public        int publicValue = 10;
    protected     int protectedValue = 10;
    /* default */ int defaultValue = 10;
                  int publicValueTwo = 10;
    /* default 는 생략
       제어자 'default'은(는) 허용되지 않습니다
       defaultint int publicValueThree = 10;
    */
    private       int privateValue = 10;


    // 모든 접근 제한자가 같은 클래스 내부에 접그 가능하기 때문에 오류 없음

    public  void method1 (){
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(defaultValue);
        System.out.println(privateValue);
    }
}
