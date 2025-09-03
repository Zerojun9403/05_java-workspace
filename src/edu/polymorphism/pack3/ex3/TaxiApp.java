package edu.polymorphism.pack3.ex3;

public  class TaxiApp implements TaxiInterface{
    protected String appName;
    protected String userName;
    protected String currentLocation;

    public TaxiApp(String appName, String userName) {
        this.appName = appName;
        this.userName = userName;
        this.currentLocation = "서울역";
    }

    // 공통 메서드 (이미 구현됨)
    public void showUserInfo() {
        System.out.println("📱 [" + appName + "] " + userName + "님, 안녕하세요!");
    }

    public void setLocation(String location) {
        this.currentLocation = location;
        System.out.println("📍 현재 위치: " + location);
    }

    public void payFare(int amount) {
        System.out.println("💳 " + amount + "원 결제가 완료되었습니다.");
    }


    @Override
    public void callTaxi() {

    }

    @Override
    public int calculateFare(int distance) {
        return 0;
    }

    @Override
    public void showDriverInfo() {

    }
}
