package edu.oop.cls.pack2;


import edu.oop.basic.Nation;

public class OtherClassTestRun {
    public static void main(String[] args) {

        // Nation 과 Account 는 public 이기 때문에 다른 폴더에서도 접근 가능
        Nation n = new Nation();
       // Account a = new Account();
        // 다른폴더에 존재하기 때문에 import 불가능
        // why? default 로 접근 범위를 pack1 폴더 내에서만 호출 할 수 있도록 제한 했기 때문
        // ClassTest1 = new ClassTest1();
    }

}
