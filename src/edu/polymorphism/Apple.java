package edu.polymorphism;


/*
*  부모 클래스 Fruit 상속을 받으려면
*  extends 부모 클래스 이름
* */


public class Apple extends Fruit {

     // 추가적으로 작성해야할 필드가 존재한다면 작성

    private String 품종;

    public Apple() {
    }


    public Apple(String 품종) {
        this.품종 = 품종;
    }

    public String get품종() {
        return 품종;
    }

    public void set품종(String 품종) {
        this.품종 = 품종;
    }

    @Override
    public void taste(){
        System.out.println(get품종() + "품종의 " +getFruitName() + "맛은 알 수 없습니다.");
        // ㅇㅇ  품종의 사과의 맛은 알수 없습니다.
        // 사과의 맛은 ㅇㅇ품종에 따라 다릅니다.
    }
}
