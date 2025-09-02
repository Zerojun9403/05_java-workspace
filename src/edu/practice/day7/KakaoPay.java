package edu.practice.day7;

public class KakaoPay extends KakaoService {
    private int balance;
    private String bankAccount;

    public KakaoPay() {}

    public KakaoPay(String serviceName, String userId, String userNickname, int balance, String bankAccount) {
        super(serviceName, userId, userNickname);
        this.balance = balance;
        this.bankAccount = bankAccount;
    }

    @Override
    public void startService() {
        System.out.println("카카오페이를 시작합니다...");
    }

    @Override
    public void stopService() {
        System.out.println("카카오페이를 종료합니다...");
    }

    @Override
    public String getServiceType() {
        return "PAYMENT";
    }

    @Override
    public void performSpecialAction() {
        System.out.println("결제를 처리합니다.");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오페이 알림] " + message);
    }

    public void chargeBalance(int amount) {
        balance += amount;
        System.out.println(amount + "원 충전되었습니다. 현재 잔액: " + balance + "원");
    }

    public void processPayment(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 결제 완료. 남은 잔액: " + balance + "원");
        } else {
            System.out.println("잔액 부족. 결제 실패.");
        }
    }

    public void transferMoney(String recipient, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(recipient + "에게 " + amount + "원 송금 완료. 남은 잔액: " + balance + "원");
        } else {
            System.out.println("잔액 부족. 송금 실패.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
