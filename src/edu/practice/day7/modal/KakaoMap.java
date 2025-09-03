package edu.practice.day7.modal;

public class KakaoMap extends KakaoService {
    private String currentLocation;
    private boolean isGPSEnabled;

    public KakaoMap() {
        this.currentLocation = "위치 정보 없음";
        this.isGPSEnabled = false;
    }

    public KakaoMap(String serviceName, String userId, String userNickname, String currentLocation, boolean isGPSEnabled) {
        super(serviceName, userId, userNickname);
        this.currentLocation = currentLocation;
        this.isGPSEnabled = false;
    }

    @Override
    public void startService() {
        System.out.println("카카오맵을 시작합니다...");
    }

    @Override
    public void stopService() {
        System.out.println("카카오맵을 종료합니다...");
    }

    @Override
    public String getServiceType() {
        return "NAVIGATION";
    }

    @Override
    public void performSpecialAction() {
        System.out.println("길찾기를 실행합니다.");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오맵 알림] " + message);
    }

    public void searchLocation(String location) {
        System.out.println("'" + location + "'을(를) 검색합니다.");
    }

    public void findRoute(String start, String end) {
        System.out.println(start + "에서 " + end + "까지 경로를 탐색합니다.");
    }

    public void enableGPS() {
        this.isGPSEnabled = true;
        System.out.println("GPS를 활성화했습니다.");
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("위치를 '" + newLocation + "'으로 업데이트했습니다.");
    }
}
