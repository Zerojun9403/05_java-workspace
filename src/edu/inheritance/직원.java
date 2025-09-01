package edu.inheritance;

public class 직원 {

    private  String eName;   //사원이름
    private  int eId;        //사원번호
    private double baseSalary;//기본급
    private String deparment;//부서

    //메서드 필드 이외에는 거의 다 기능 = 메서드 종류들
    // 생성자 매개변수 생성자


    public 직원(String eName, int eId, double baseSalary, String deparment) {
        this.eName = eName;
        this.eId = eId;
        this.baseSalary = baseSalary;
        this.deparment = deparment;
    }

    //공통기능
    public void info(){
        System.out.println("=== 직원정보 ===");
        System.out.println("이름 : " + eName);
        System.out.println("사번 : " + eId);
        System.out.println("부서 : " + deparment);
        System.out.println("기본급 : " + baseSalary + "원");

    }
}
