package edu.inheritance.ex3;

public class YouTube extends GoogleService{

    // YouTube 는 상속 받을 자식이 때문에 Private
    // YouTube 에서 작서한 필드를 상속할 자식이 현재는 존재하지 않기 때문
    private int 구독자수;
    private boolean isPremium;


    public YouTube() { //setter로 super() 를 작성했으니
        super();       // 부모 클래스인 GoogleService 필드 까지 Youtube 객체를 활용하여
    }                  //                                         데이터 저장이 가능


    public YouTube(String userEmail, String userName, String accountType, int 구독자수, boolean isPremium) {
        super(userEmail, userName, accountType);
        this.구독자수 = 구독자수;
        this.isPremium = isPremium;
    }


    @Override
    public void search() {
        System.out.println( " YouTube 에서 동영상을 검색합니다.");
    }

    @Override
    public void share() {
        System.out.println("YouTube 에서 동영상 링크 를  전달합니다. ");
    }



    public void uploadVideo(){
        System.out.println(userName+"님이 동영상을 업로드 합니다. ");
    }
    public void subscribe(){
        System.out.println(userName+"님이 채널을 구독합니다. ");
    }

    public int get구독자수() {
        return 구독자수;
    }

    public void set구독자수(int 구독자수) {
        this.구독자수 = 구독자수;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public void watchAd(){
        if(!isPremium){
            System.out.println("광고를 재생합니다.");
        }else {
            System.out.println("프리미엄 서비스");
        }

    }



    }



