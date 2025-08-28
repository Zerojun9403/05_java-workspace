package edu.practice.day3;


public class BankAccount {

    /*
     * [캡슐화]
     * - 객체의 속성(필드) 직접 접근을 제한하는 것이 원칙
     *   (private : 현재 객체만 접근 가능한, 사적인, 개인적인)
     * - 속성에 직접 접근을 할 수 없으므로
     *   대신 간접 접근을 할 수 있는 기능을 작성해야함
     * */

    // 속성(값) - DB 컬럼명칭과 맞추어 상호작용하여 데이터를 주고 받을 명칭
    private String name; //이름(예금주)
    private String accountNumber; // 계좌번호
    private long balance; // 잔액
    private String password; //비밀 번호
    /* 과제 추가 사항 */
    private String accountHolder; //(예금주)
    private int transactionCount; // 거래 횟수, 기본값 0


    // 단축키 ALt+Insert 를 클릭하면 생성성자 getter setter를 만들어주는 기능 실행
    //메서드(기능) - 생성자

    //              생성자 - 기본
    //              생성자 - 필수

    // 메서드(기능)  - 기본생성자
    // c 형태로 되어 있는 edu.oop.basic.Account 를 선택해서 생성
    public BankAccount() {
    }

    // 메서드(기능) - 필수 생성자
    // c 형태 아래에 존재하는 f형태에서 필요한 속성 명칭을 선택해서 생성
    public BankAccount(String name, String accountNumber, long balance, String password) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
        this.accountHolder = accountNumber;
        this.transactionCount = 0;
    }

    // 매서드(기능) - setter : html 에서 사용자에게 전달받은 값을 자바의 변수이름 내부에 저장하는 역할

    /**
     *
     * setter 주의할점 아래와 같은 코드 절대 금지
     * <p>
     * if(계좌잔액 < 0){
     * // 잔액은 음수가 될 수 없습니다.
     * return; // 계좌  잔액에 일치하는 않는 데이터를 돌려보내기
     * }
     * <p>
     * setter 내부에서  if 문이나 조건을 통해 데이터를 저장하는 형태를 작성하는 것은 지양
     */

        /*
        *  private String name ;
        *
        *  public void setName(String html에서 데이터 전달받아올 변수이름 ) {
            this.name = name; =  html 에서 데이터 전달받아로 변수 이름;
           }
        *
        * setName 은 private String name 변수명칭에 데이터를 저장하기 위한 메서드
        * this.name = 위에서 작성한 private String name 가리킴
        * this.name = name 은 String name 에서 가져온 변수명칭을 가리킴
        *
        * (String name) 매개변수 내부에 존재하는 변수이름은 private 에서 작성한 변수이름과 다르게 작성해도
        * 상관없지만, private 으로 작성한 속성명칭이 많아지면 변수이름들을 관리하는데 문제가 발생할 수 있기 때문에
        * 속성명칭과 매개변수 내부에 작성한 변수명칭을 동일하게 작성해주는 것이 바람직 함
        *
        * public void setName(String name) {
            this.name = name;
           }
        *
        * 1*/
    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    // 매서드(기능) - getter : DB나 이메일 인증키와 같은 데이터를 사용자에게 전달하는 역할

    /*
     *
     * @return : 메서드 내부에서 작성한 특정 데이터나 setter 로 저장되어 있거나.
     *           리터럴 형태로 변수이름에 직접적으로 작성된 데이터를 전달할 떄 사용하는 매서드 \
     *           return 에서 작성되어 있는 변수 명칭을 자료형은 public 옆에 존재하는 위치에 작성
     *
     *           public 리턴할 변수이름의자료형 get변수이름(){
     *               return 데이터를 전달할 변수이름;
     *           }
     * */
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getTransactionCount() {
        return transactionCount;
    }


    //  생성자 기본, 필수, getter, setter 이외 개발가 필요로 할는 메서드 기능 작성

    /**
     * 비밀번호와 출금할 금액을 전달 받아와
     * 조건에 맞으면 잔액에서 차감 후 현재 잔액을 출력
     * <p>
     * 조건 1) 비밀번호가 일치하지 않으면 "비밀번호 불일치" 출력
     * 조건 2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
     *
     * @param amount : 클라이언트가 출금 요청한 숫자의 데이터를 가지고 있는 출금할 금액의 매겨변수 이름
     * @parem pw : 클라이언트가 작성한 비밀번호를 가지고 있는 매겨변수 이름
     *
     */


    public void withdraw(String pw, long amount) {

        // 자바에서
        // -  기본 자료형 비교는 ==
        // -  객체(참조형) 비교는 A.equals(B)
        // 대표적인 예 ) String 문자열에 비교할 경우 equals 사용

        // 현재 계좌 비밀번호 (password) 와
        // 전달 받은 비밀번호(pw) 가 같은 경우 true / 다르면 false

        if (!password.equals(pw)) {
            System.out.println("비밀번호 불일치");
            return;
        }

        // 출금할 금액이 잔액보다 큰경우

        if (amount > balance) {
            System.out.println("잔액이 부족합니다. ");
            return; //출금 못하도록 돌려보내기
        }


        // 보유잔액에서 출금할 금액 만큼 차금
        this.balance -= amount;


        System.out.printf("%s 계좌에서 %d원 출금 \n", accountNumber, amount);
        System.out.println(name + "의 현재 잔액 " + balance);
    }



    /*
     *  전달 받은 금액을 balance 에 누적한 후
     *  현재 잔액을 콘솔에 출력
     *  메서드 : 반환값 존재하지 않는 메서드
     *  메서드 명칭: deposit
     *  매개변수 : long amount
     *  기능    :  balance += amount; 형태의 이용하여 현재 잔액 추가
     *  기능    :  system.out.println(name+"의 현재 잔액 : "+ balance);
     * */

    public void deposit(long amount) {
        // 잔액에 누적
        this.balance += amount; //this. 생략 가능  this 이 클래스에서 변수속성에 어떤 값에 대입한다.
        //this. 생략가능하다.
        //this.balance = Account 클래스에서 balance 라는 변수 이름

        // 입금 안내 출력
        System.out.printf("%s 계좌에 %d원 입금%n", accountNumber, amount);
        System.out.println(name + "의 현재 잔액 : " + balance);
    }

    /**
     * 송금 (this -> targetAccount)
     */
    public void transfer(String pw, BankAccount targetAccount, long amount) {
        // 1) 검증
        if (!password.equals(pw)) {
            System.out.println("비밀번호 불일치");
            return;
        }
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        // 2) 출금(보낸 사람)
        balance -= amount;
        transactionCount++;

        // 3) 입금(받는 사람) — 콘솔에 따로 입금문구 찍지 않음(예시 출력 맞춤)
        targetAccount.balance += amount;
        targetAccount.transactionCount++;

        // 4) 안내 출력
        System.out.printf("%s님이 %s님께 %d원 송금했습니다.%n", this.name, targetAccount.name, amount);
        System.out.printf("%s님 현재 잔액: %d원%n", this.name, this.balance);
        System.out.printf("%s님 현재 잔액: %d원%n", targetAccount.name, targetAccount.balance);
    }

    /**
     * 계좌 정보 블록 출력
     */
    public void getAccountInfo() {
        System.out.printf("=== %s님 계좌 정보 ===%n", name);
        System.out.printf("계좌번호: %s%n", accountNumber);
        System.out.printf("잔액: %d원%n", balance);
        System.out.printf("총 거래 횟수: %d회%n%n", transactionCount);
    }

    ;
}