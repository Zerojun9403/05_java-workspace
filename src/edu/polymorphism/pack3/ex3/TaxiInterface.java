package edu.polymorphism.pack3.ex3;

public interface TaxiInterface {


    // 추상 클래스 내부에 작성된 추상메서드르 interface 로 추상 메서드 기능만 분리하여 작성하고
    // 추상메서드가 피료한 클래스에 interface TaxiInterface 를 구현하겠다 추가하여 문제없이
    // 동작하도록 수정


    void callTaxi();
    int calculateFare(int distance);
    void showDriverInfo();
}
