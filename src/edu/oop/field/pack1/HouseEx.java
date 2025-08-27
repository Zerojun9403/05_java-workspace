package edu.oop.field.pack1;

/*
 *  실생활 로 비유하는 접근 제한자
 * */
public class HouseEx {
    // public - 집 주소 (누구나 알 수 있음)
    // 사용자 닉네임
    public String address = "서울시 종로구 ";

    // protected - 가족비밀(가족이나 친적만 알 수 있는 정도)
    // 게임 레벨 레벨업 기능
    protected String familySecret = "나의 아버지가 학력이 어디까지인가";

    //default - 동네 이야기(같은 폴더 위치 동네 사람들만 알 수 있음)
    // 내부적으로만 사용하는 코드
    String neighborNews = "옆 집에 새 가족이 이사왔음";


    //private - 개인비밀(본인 만 알수 있음)
    // 계좌 잔액, 비밀번호 외부에서 함부로 건드리면 안되는 중요한 정보
    private  String mySecret = "다이어리 비밀번호";
}
