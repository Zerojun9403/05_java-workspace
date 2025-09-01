package edu.inheritance.ex2;

// 오토바이 클래스
public class Motorcycle extends Vehicle {


    private int engineSize;
    private  boolean hasHelmet;



    public Motorcycle(){
        super();
    }

    public Motorcycle(String brand, String model, int year, String color, int engineSize, boolean hasHelmet) {
        super(brand, model, year, color);
        this.engineSize = engineSize;
        this.hasHelmet = hasHelmet;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }



    @Override
    public void accelerate() {
        System.out.println("오토바이가 스로틀을 돌려 가속합니다.");
    }
    @Override
    public void brake() {
        System.out.println("오토바이가 브레이크 레버를 당겨 감속합니다.");
    }



    public void putOnHelmet(){

    }
    public  void  wheelie(){

    }

}

