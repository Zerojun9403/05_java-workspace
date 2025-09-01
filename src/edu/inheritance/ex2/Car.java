package edu.inheritance.ex2;

import javax.swing.plaf.PanelUI;

public class Car extends Vehicle {

    private  String fuelType;
    private  int doors;

    // 기본 생성자


    public Car(){
        super();
    }
    public Car(String brand, String model, int year, String color, String fuelType, int doors) {
        super(brand, model, year, color);
        this.fuelType = fuelType;
        this.doors = doors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


    @Override
    public void accelerate() {
        System.out.println("자동차가 액셀러레이터를 밟아 가속합니다.");
    }
    @Override
    public void brake() {
        System.out.println("자동차가 브레이크를 밟아 감속합니다.");
    }


    public  void honk(){

    }

    public  void openTrunk(){

    }


}
