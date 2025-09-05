package edu.exception.pack3;


/*
    Checked Exception / UnChecked Exception

    Check : 확인하다
    Checked Exception  : 반드시 확인해야 하는 예외
      -> 예외 처리 구문(try-catch, throw) 반드시 작성해야하는 예외
    UnChecked Exception  : 반드시 확인해야 하는 예외
      -> 예외 처리 구문(try-catch, throw) 써도 그만 안써도 그만인 예외
 */


import java.io.IOException;

public class ExceptionEx3 {
    // Check / UnCheck 구분하기

    public  void method1(){
        int result = 1;
        if(result == 1){
            throw  new RuntimeException(); //빨간줄이 안뜸

            //throw  new IOException(); //빨간줄 뜸
            // -> try catch 를 통해 예외처리를 필수로 진행해야함
        }
    }


    public void method2(){
        int result = 101;

        if(result > 100){
            throw  new 개발자Exception(); // -> try-catch 필수 아님
        }
    }

}
