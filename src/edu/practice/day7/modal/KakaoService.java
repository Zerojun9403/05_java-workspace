package edu.practice.day7.modal;

public abstract class KakaoService {
    protected String serviceName;
    protected String userId;
    protected String userNickname;
    protected boolean isLoggedIn;

    public KakaoService() {}

    public KakaoService(String serviceName, String userId, String userNickname) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.isLoggedIn = false;
    }

    public void login() {
        isLoggedIn = true;
        System.out.println(userNickname + "님이 " + serviceName + "에 로그인했습니다.");
    }

    public void logout() {
        isLoggedIn = false;
        System.out.println(userNickname + "님이 " + serviceName + "에서 로그아웃했습니다.");
    }

    public void showUserInfo() {
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스명: " + serviceName);
        System.out.println("아이디: " + userId);
        System.out.println("닉네임: " + userNickname);
        System.out.println("로그인 여부: " + (isLoggedIn ? "로그인됨" : "로그아웃됨"));
    }

    public abstract void startService();
    public abstract void stopService();
    public abstract String getServiceType();
    public abstract void performSpecialAction();
    public abstract void sendNotification(String message);

    // Getter/Setter 생략 가능 (필요시 추가)
}
