package edu.inheritance.ex2;

// 자전거 클래스
public class Bicycle extends Vehicle {


    private int gearCount;
    private boolean isElectric;




    public Bicycle(String brand, String model, int year, String color, int gearCount, boolean isElectric) {
        super(brand, model, year, color);
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    public Bicycle() {
        super();
    }
    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
    @Override
    public void accelerate() {
        System.out.println("자전거가 페달을 밟아 가속합니다.");
    }
    @Override
    public void brake() {
        System.out.println("자전거가 브레이크를 잡아 감속합니다.");
    }

    public  void ringBell(){

    }

    public void pedal(){

    }


}