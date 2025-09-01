package edu.inheritance.ex2;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String color;


    //메서드
    // 기본생성자
    public Vehicle(){

    }

    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setColor(String color) { this.color = color; }




    @Override
    public  void accelerate(){

    }

    @Override
    public  void  brake(){

    }
    // 추후 재사용할 메서드들 -> 만약 재사용할 때 변경될 사항이 없으면
    // 자식 메서드에서 작성하지 않고 사용할 수 있음
    public void start() {
        System.out.println(brand + " " + model + "이(가) 시동을 겁니다.");
    }

    public void stop() {
        System.out.println(brand + " " + model + "이(가) 정지합니다.");
    }



}
