package edu.collection.pack1.service;

import java.util.ArrayList;
import java.util.List;

// service.ListService 폴더와 클래스 한 번에 만들기
public class ListService {

    // List : 자료를 순차적으로 나열한 자료구저 (배열 비슷)
    // - 인덱스가 존재
    // -> 인덱스로 순서가 구분되기 떄문에 중복 데이터 저장 가능
    // 인덱스란 ?  0번부터 순차적스오 변수 명칭이나 데이터들에 자리번호 를 생성하는것
    // for문 작성할때 사용하는 i = index 의 악쟈로 많이 사용됨


    /*
    * List 사용해 보기 -> Array 보다 편리함
    * */


    public  void method1(){

        int [] a = {1,2,3}; // int 이기 떄문에 숫자 형태만 가능

        String[] b ={"1","2","3"}; // String 문자열이기 때문에 "" 로 감싸진 데이터 이외 모두 불가

        // 위와 같이 목록 데이터 형태를 만들 떄, 자료의 제약을 해결하기 위해 만들어진 컬렉션
        // List list = new  ArrayList(E);
        //                            E =  element 요소로 숫자, 문자, 노리형 등 값을 가리지 않고 모든 자료형이 들어갈수 있음



        // List 객체 생성
        // - List (인터페이스) : 특정 기능을 기준으로 만들어진 클래스 파일을 이용할 예정
        //          -> 인터페이스 이기 때문에 객체 생성 불가 -> 다형성 이용해서 사용
        // - ArrayList(클래스 문서가 존재) List의 후손 클래스
       List list = new  ArrayList(); // ArrayList 는 고무줄 처럼 공간이 늘었다 줄었다 하기 때문에
       // 처음부터 몇 칸인지 설덩 안해줘도 됨




       // 1. add(E,e); 목록에[서 마지막에 e 에 해당하는 데이터를 추가
        //   add  를 작성하는 만큼 무제한으로 추가됨
       list.add(1);
       list.add("아무거나 작성합시다.");

        System.out.println("list : " + list);



        // 2. E get(int index) : List 에서 index 번째 요소 반환 받기
        // 3. int size() : List에 저장된 요소(객체)의 개수를 변환  length 대신 사용
        System.out.println("list 변수이름에 저장된 데이터의 개수 " + list.size());

        // List에서 ArrayList 는 언제 사용하는가?
        // -> 회원 목록 조회 , 검색한 데이터를 모두 가져올떄 , 상품리스트 모두 조회등
        //  데이터를 DB에서 2개이상 가지고 온 후, 사용자가 보여주어야 할 때 사용



    }

    /**
     *
     *  컬렉션 List + 제너릭(타입 제한)
     *
     *  ArrayList 형태인데, 목록에 들어올  수 있는 자료형을 개발자가 제한한 목록 리스트
     *
     *
     */
    public  void method2(){

        // String 데이터만 무제한으로 담고, 무제한으로 목록을 제거할 수 있는 리스트
        // ↓<> 필수로 String 형태만 담을 수 있도록 설정 ↓<>에 String 을 작성해도되고, 안해도 됨
        List<String> stringList = new ArrayList<String>();

         stringList.add("닭갈비");
         stringList.add("치킨");
         stringList.add("보쌈");
        //  stringList.add(123); // 필요한 타입:  String  제공된 타입: int
        //                      strList에서 필요한 타임은 String 인데 int 타입이 제공되어 발생하는 무제


        System.out.println("strList 0 번 쨰 "+ stringList.get(0));
        System.out.println("strList 1 번 쨰 "+ stringList.get(1));
        System.out.println("strList 2 번 쨰 "+ stringList.get(2));
        // System.out.println("strList 3 번 쨰 "+ stringList.get(3)); ArrayList 데이터가 3개만 있기에 문제 발생
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        System.out.println("=".repeat(20)+ "for문을 활용하여 출력하기" + "=".repeat(20));
        // get 처럼 반복형태의 경우는 for문을 활용해서 한번에 출력 가능

        for(int i=0; i< stringList.size(); i++ ){
            System.out.println("strList" + i + "번쨰"+stringList.get(i)); // 와 같이 작성 가능
        }



        // 3. void add(int index E e): index 번 째에 중간에 삽입가능
        stringList.add(1,"막국수");


        // 4. String toString() : List 인터페이스를 만들면서 toString 을 추가로 작성하는것이 번거로움을 느낌
        System.out.println(stringList); // strList.toString() 마치 작성한 것 처럼 리스트 내부의 값을 전체 조회 가능



        // 5. E set(int index, E e);
        //   index 번 째 요소를 e로 수정
        //    ->  수정 전 요소가 반환된 다음 수정됨
        // 수정전str 변수이름에는 치킨에서 양념치킨으로 데이터가 수정되기 전의 데이터 상태로 저장됨
        // 그리고 나서 strList 2번째 index의 데이터가 변화됨.
        String 수정전str =  stringList.set(2,"양념치킨");
        System.out.println("수정전 str :" + 수정전str);
        System.out.println("수정전 str :" + stringList.get(2));
        System.out.println(stringList);


        // 6. int indexOf(E e) :
        // List 내부에 e와 같은 요소가 있으면 해당 인덱스 값을 반환, 없으면 무조건 -1 값을 반환
        System.out.println(stringList.indexOf("보쌈"));   //  3번째 자리에 위치
        System.out.println(stringList.indexOf("막국수")); //  1번째 자리에 위치
        System.out.println(stringList.indexOf("콩국수")); // -1 strList 존재 하지 않음


        // 7. boolean contains(E e) ;
        // List 내부에 e와 같은 요소가 있으면 true , 없으면 false 요소 존재 유뮤
        System.out.println(stringList.contains("막국수")); // true
        System.out.println(stringList.contains("콩국수")); // false


        // 8. E remove(int index)
        // index 번쨰 요소를 제거
        // -> 제거된 요소가 반환됨
        String target = stringList.remove(0);// 0 번쨰 인텍스 요소를 제거하겠다.
        // target 에는 strList 에서 제거되기 전에 제거될 데이터의 값이 담겨진후 strList 에서 해당 데이터가 제거됨

        System.out.println("제거된 요소 : "+target);
        System.out.println(stringList);
    }

}
