package edu.oop.basic;

/* Nation 클래스를 활용한 객체 생성 및 조작 실습 */

public class NationRun {

    public static void main(String[] args) {

        Nation n1 = new Nation("홍길동",25,'남',"901010-1100000","010-134-569","서울특별시 강남구");
        /* 속성(값)
        public String name; //이름
        public int age; // 나이
        public char gender; // 성별
        public String juminNumber; // 주민등록번호
        public String tel; // 전화번호
        public String address; //주소

        자료형 앞에 private이 아닌 public 으로 작성했을 경우 아래와 같은  구분 수행 가능
        은행 예시로 들었을떄 창고에 직접 들어가서 돈을 저장

        n1.name = "홍길동";
        n1.age = 25;
        n1.gender ='남';
        System.out.printf("이름은 %s이고,%d세 %c성 입니다.\n",n1.name,n1.age,n1.gender);

        n1.name = ("홍길동");
        n1.age = (25);
        n1.gender =('남');
        System.out.printf ("이름은 %s이고,%d세 %c성 입니다.\n",n1.name(),n1.age(),n1.gender());
        형태로 출력 가능
        */

//        System.out.println(n1.getName());
//        System.out.println(n1.getAge());
//        System.out.println(n1.getGender());
//        System.out.println(n1.getJuminNumber());
//        System.out.println(n1.getTel());
//        System.out.println(n1.getAddress());


        // =====  문제 2 : 필수 생성자 활용 =====

        Nation n2 = new Nation("이영희",17,'여',"070312-4567890","010-9876-5432","부산광역시 해운대구");


        // == 문제 3 : 필수 생성자 ==
        /*
        *  객체 n3 생성후 setter 를 사용하여 다름 정보를 설정하시오
        * 이름: 박민수
        * 나이 : 42
        * 성별: 남
        * 주민등록번호 : 820525-1987654
        * 전화번호 : 010-5555-7777
        *  주소 : 대구광역시 중구
        *
        * */
        Nation n3 = new Nation("박민수",42,'남',"820525-1987654","010-5555-7777","대구광역시 중구");

        // ===== 자기소개 기능 활요ㅕ앻서 모든 국민들의 자기소개 확인
        // ===== 납세의 의무 확인 하여 결과 출력;
        // ===== 한국어 능력 및 복지
        // 1. n1 국민부터 n3 국민까지 각각 한국어 능력 및 복지 혜택 확인


        n1.introduce();
        n1.납세의의무();
        n1.welfare();
        n1.seakKorean();

        n2.introduce();
        n2.납세의의무();
        n2.welfare();
        n2.seakKorean();

        n3.introduce();
        n3.납세의의무();
        n3.welfare();
        n3.seakKorean();




    }

}
