package edu.practice.day6;

public class NaverService {
    protected String serviceName;
    protected String userId;
    protected String userNickname;
    protected int userLevel;

    public NaverService() {}

    public NaverService(String serviceName, String userId, String userNickname, int userLevel) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.userLevel = userLevel;
    }

    public void login() {
        System.out.println(userNickname + "님이 " + serviceName + "에 로그인했습니다.");
    }

    public void logout() {
        System.out.println(userNickname + "님이 " + serviceName + "에서 로그아웃했습니다.");
    }

    public void showUserInfo() {
        System.out.println("[서비스 정보] " + serviceName + " | ID: " + userId + " | 닉네임: " + userNickname + " | 레벨: " + userLevel);
    }

    // 오버라이딩 대상
    public void search() {
        System.out.println(serviceName + "에서 콘텐츠를 검색합니다.");
    }

    public void writeContent() {
        System.out.println(serviceName + "에 콘텐츠를 작성합니다.");
    }

    // Getter/Setter
    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getUserNickname() { return userNickname; }
    public void setUserNickname(String userNickname) { this.userNickname = userNickname; }

    public int getUserLevel() { return userLevel; }
    public void setUserLevel(int userLevel) { this.userLevel = userLevel; }
}
