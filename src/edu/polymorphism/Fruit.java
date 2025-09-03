package edu.polymorphism;


// 문서 인데
// Fruit 를 상속받는 자식 클래스가 강제로 작성해야 하는 기능이 존재할수 있다.
public abstract class Fruit {

    protected String fruitName;

    // 생성자
    public Fruit() {
    }

    // 게터 $ 세터

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }


    // 과일마다 먹을 떄 맛이 다름 다른 맛을 자식 클래스에서 과일이름에 맞게 재설정
    // 메서드 작성 방법 :
    //                      접근 제어자 Void/자료형 가능명칭(){};

    // 접근제어자와   void/자료형 사이에 abstract 가 존재하면 {}  를 생략
    // abstract 메서드 작성 방법 :
    //               접근제어자 abstract void / 자료형 기능명칭();
    public void taste(/* 매개변수가 없어도 작성*/){

    };

    public void info() {
        System.out.println("FruiltName" + fruitName);
    }
}
