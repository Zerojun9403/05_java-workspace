package edu.practice.day3;

public class Practice2 {



    /*
    *
    *
    * 스마트폰의 기본 기능을 구현하는 `SmartPhone` 클래스를 작성하세요.
        **요구사항**:

        - SmartPhone 클래스에 다음 속성을 private로 선언
        - `String model` (모델명)
        - `int batteryLevel` (배터리 잔량, 100)
        - `boolean isPowerOn` (전원 상태, 기본값 false)
        - 생성자 2개 작성
        - 필수 생성자 (model, batteryLevel)
        - getter/setter 메서드 작성
        - `useBattery()`: 배터리가 0 이하가 되면 자동으로 `powerOff()` 호출
        - `charge()`: 배터리가 100을 초과하지 않도록 제한
    *
    *
    *
    * */

        private  String model;
        private  int batteryLevel;
        private boolean isPowerOn;

    public Practice2() {
    }

    public Practice2(String model, int batteryLevel, boolean isPowerOn) {
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.isPowerOn = isPowerOn;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    /* ===== 기능 메서드들 ===== */

    // 전원 켜기
    public void powerOn() {
        if (!isPowerOn) {
            isPowerOn = true;
            System.out.println(model + "의 전원이 켜졌습니다.");
        } else {
            System.out.println(model + "은(는) 이미 켜져 있습니다.");
        }
    }

    // 전원 끄기
    public void powerOff() {
        if (isPowerOn) {
            isPowerOn = false;
            System.out.println(model + "의 전원이 꺼졌습니다.");
        } else {
            System.out.println(model + "은(는) 이미 꺼져 있습니다.");
        }
    }

    // 배터리 사용
    public void useBattery(int amount) {
        if (!isPowerOn) {
            System.out.println("전원이 꺼져있어 배터리를 사용할 수 없습니다.");
            return;
        }

        if (batteryLevel > amount) {
            batteryLevel -= amount;
            System.out.println("배터리를 " + amount + "% 사용했습니다.");
        } else {
            batteryLevel = 0;
            isPowerOn = false;
            System.out.println("배터리가 모두 소모되어 전원이 꺼집니다.");
        }
    }

    // 배터리 충전
    public void chargeBattery(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) batteryLevel = 100;
        System.out.println(amount + "% 충전되었습니다.");
    }
    public void displayStatus() {
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델: " + model);
        System.out.println("배터리: " + batteryLevel + "%");
        System.out.println("전원 상태: " + (isPowerOn ? "ON" : "OFF"));
        System.out.println();
    }

    public void method2(){
        System.out.println(model  + "의 전원이 켜졌습니다.");
        System.out.println( model+ "의 전원이 꺼졌습니다.");
        System.out.println("배터리를 " + batteryLevel  + "% 사용했습니다.");
        System.out.println("배터리가 모두 소모되어 전원이 꺼집니다.");
        System.out.println("전원이 꺼져있어 배터리를 사용할 수 없습니다.");
        System.out.println( batteryLevel + "% 충전되었습니다.");
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델: " + model);
        System.out.println("배터리: " +batteryLevel+"%" );
        System.out.println("전원 상태: " + (isPowerOn ? "ON" : "OFF"));
    }
}

