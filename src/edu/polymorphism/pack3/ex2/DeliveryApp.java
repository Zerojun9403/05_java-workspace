package edu.polymorphism.pack3.ex2;

/*
 *  추상없는 부모 클래스 공통된 필드 + 공통된 메서드
 *
 * */
public class DeliveryApp {

    protected String appName;
    protected String userName;

    public DeliveryApp() {
    }

    public DeliveryApp(String appName, String userName) {
        this.appName = appName;
        this.userName = userName;
    }


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    // 공통메서드

    public void showAccount() {
        System.out.println("[" + getAppName() + "]" + getUserName() + "님의 계정입니다.");
    }

    public void payMoney(int amount) {
        System.out.println("[" + getAppName() + "]" + amount + "원을 결제했습니다.");
    }
}
