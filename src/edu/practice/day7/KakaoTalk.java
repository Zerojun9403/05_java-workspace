package edu.practice.day7;

public class KakaoTalk extends KakaoService {
    private int friendCount;
    private boolean isOnline;

    public KakaoTalk() {}

    public KakaoTalk(String serviceName, String userId, String userNickname, int friendCount, boolean isOnline) {
        super(serviceName, userId, userNickname);
        this.friendCount = friendCount;
        this.isOnline = isOnline;
    }

    @Override
    public void startService() {
        System.out.println("카카오톡을 시작합니다...");
    }

    @Override
    public void stopService() {
        System.out.println("카카오톡을 종료합니다...");
    }

    @Override
    public String getServiceType() {
        return "MESSENGER";
    }

    @Override
    public void performSpecialAction() {
        System.out.println("메시지를 전송합니다.");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오톡 알림] " + message);
    }

    public void sendMessage(String friendName, String message) {
        System.out.println(friendName + "에게 메시지 전송: " + message);
    }

    public void addFriend(String friendName) {
        friendCount++;
        System.out.println(friendName + "님을 친구로 추가했습니다. 현재 친구 수: " + friendCount);
    }

    public void changeStatus(boolean online) {
        this.isOnline = online;
        System.out.println("상태 변경: " + (online ? "온라인" : "오프라인"));
    }
}
