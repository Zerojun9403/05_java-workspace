package edu.collection.pack1.ex1;

import edu.collection.pack1.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {


    public static void problem1() {
        // 1. String 타입의 ArrayList를 생성하세요
        List<String> strList = new ArrayList<String>();
        // 2. 본인의 취미 3개를 추가하세요 (예: "게임", "독서", "요리")
        strList.add("게임");
        strList.add("독서");
        strList.add("요리");
        // 3. 리스트의 크기를 출력하세요
        System.out.println("리스트의 크기: " + strList.size());
        // 4. 모든 취미를 출력하세요 (반복문 사용)
        for (int i = 0; i < strList.size(); i++) {
            System.out.println("strList" + i + "번쨰" + strList.get(i)); // 와 같이 작성 가능
        }
    }

    public static void problem2() {
        // 1. Integer 타입의 ArrayList를 생성하세요
        List<Integer> ingerList = new ArrayList<Integer>();

        // 2. 시험 점수 5개를 추가하세요
        ingerList.add(85);
        ingerList.add(90);
        ingerList.add(78);
        ingerList.add(92);
        ingerList.add(88);

        // 3. 3번째 점수(인덱스 2)를 95로 수정하세요
        ingerList.set(2, 95);

        // 4. 수정 후 모든 점수를 출력하세요
        for (int i = 0; i < ingerList.size(); i++) {
            System.out.println("ingerList " + i + "번째: " + ingerList.get(i));
        }

        // 5. 가장 첫 번째 점수를 제거하고, 제거된 점수를 출력하세요
        int removedScore = ingerList.remove(0);
        System.out.println("제거된 점수: " + removedScore);

        // 제거 후 남은 점수 출력
        System.out.println("제거 후 리스트: " + ingerList);
    }


    public static void problem3() {
        // 1. 음식 메뉴 리스트를 만들고 메뉴 추가
        List<String> menuList = new ArrayList<String>();
        menuList.add("김치찌개");
        menuList.add("된장찌개");
        menuList.add("불고기");
        menuList.add("비빔밥");
        menuList.add("냉면");

        // 2. "불고기"가 몇 번째 인덱스에 있는지 출력
        int bulgogiIndex = menuList.indexOf("불고기");
        System.out.println("\"불고기\"의 인덱스: " + bulgogiIndex);

        // 3. "라면"이 메뉴에 있는지 확인 (true/false)
        boolean hasRamen = menuList.contains("라면");
        System.out.println("\"라면\"이 있는가? " + hasRamen);

        // 4. "김치찌개"가 메뉴에 있는지 확인
        boolean hasKimchi = menuList.contains("김치찌개");
        System.out.println("\"김치찌개\"가 있는가? " + hasKimchi);

        // 5. 마지막 메뉴("냉면")를 제거하고 결과 출력
        String removedMenu = menuList.remove(menuList.size() - 1);
        System.out.println("제거된 메뉴: " + removedMenu);

        // 제거 후 전체 메뉴 출력
        System.out.println("현재 메뉴 리스트: " + menuList);
    }


    public static void problem4() {
        // 1. 쇼핑 카트 리스트를 만드세요
        List<String> cart = new ArrayList<String>();

        // 2. "사과", "바나나", "우유" 를 추가하세요
        cart.add("사과");
        cart.add("바나나");
        cart.add("우유");

        // 3. 장바구니에 총 몇 개 상품이 있는지 출력하세요
        System.out.println("장바구니 상품 개수: " + cart.size());

        // 4. 2번째 상품(인덱스 1)을 "오렌지"로 바꾸세요
        cart.set(1, "오렌지");

        // 5. 모든 상품을 "상품: ..." 형태로 출력하세요
        for (String item : cart) {
            System.out.println("상품: " + item);
        }
    }



    public static void problem5() {
        // 1. 숫자 리스트를 만들고 값 추가
        List<Integer> numList = new ArrayList<Integer>();
        numList.add(1);
        numList.add(3);
        numList.add(5);
        numList.add(7);
        numList.add(9);
        numList.add(2);
        numList.add(4);
        numList.add(6);
        numList.add(8);
        numList.add(10);

        // 2. 짝수만 찾아서 출력
        System.out.println("짝수 목록:");
        for (int num : numList) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // 줄바꿈

        // 3. 5보다 큰 숫자의 개수 세기
        int count = 0;
        for (int num : numList) {
            if (num > 5) {
                count++;
            }
        }
        System.out.println("5보다 큰 숫자의 개수: " + count);

        // 4. 가장 큰 숫자 찾기
        int max = numList.get(0); // 첫 번째 값을 초기값으로 설정
        for (int num : numList) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("가장 큰 숫자: " + max);
    }

    /*
    *    List : 목록에 관련된 컬렉션
    *   Array List : 배열 형태의 리스트
    *                   장점: 검색이 빠름
    *                   단점: 중간 삽입, 제거가 느림
    *                   사용예시 : 학생 성적관리 (조회가 많은 경우)
    *                                    게시판 목록(순서대로 보기)
    *                                   설정 값들 저장( 가끔 수정)
    *                                   대부분의 일반적인 상황은 거의 사용
    *    LinkedList :  서로 연결된 링크 형태의 리스트 (기차 )
    *                   장점 : 중간삽입, 제거가 빠름
    *                   단점 : 검색이 느림
    *                   사용예시 : 음악 플레이리스트(중간에 곡  삽입 /삭제)
    *                                    실행 취소 기능( 앞, 뒤 로 이동)
    *                                     대기열 관린(앞에서 뺴고 뒤에서 넣기)
    *
    *
    *  대부분 의 경우 ArrayList 를 주로 사용
    *
    *
    *
    * LinkedList 경우에는 중간에 삽입 / 삭제가 정~~~~~~~~말 많을때만 사용
    *                                 확실한 이유가 있을 때만 사용
    *
    * */

    public  void bookManage(){
        // while 이용해서 도서 추가 , 전체조회, 동료

        List<Book> bookList = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        int input = 0;

        while (true){

        }

    }

}
