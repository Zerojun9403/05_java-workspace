package pracitce.exception.ex;

import java.util.Scanner;

public class ExceptionService {

    public void method1(){
        int a = 10;
        int b = 0;
        try { //문제가 발생할 수 있는 코드 구문 시작과 종료를 작성
            System.out.println("a/b" + (a/b));
        } catch (ArithmeticException e) {
            System.out.println("0 으로 나눌수 없습니다.");
            // 이러한 돌발생동을 진행했을떄
            // 개발자는 프로젝트 취지에 맞도록 클라이언트의 행동을 유도
        } catch (Exception e) {
            System.out.println("개발자가 생각치 못한 문제가 발생했습니다.");
        }
    }


    public void method2(){
        int [] arr ={1,2,3};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("현재 목록은" + arr.length +"개 존재합니다.");
            System.out.println("확인하고자 하는 목록의 번호를 다시 입력하세요.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }


    public void method3(){

        String file = " 파일이름txt";
        // 파일이름 확인 확장자 확인
        // 확장자 표기인 . 이 존재하지 않으면 예외 발생

        int dotIndex = file.lastIndexOf("."); //. 이 파일명에서 어디에 있는가 찾기?
        try {
            String 파일이름 = file.substring(0,dotIndex);
            String 확장자이름 = file.substring(dotIndex);
            System.out.println("파일이름 확인: " + 파일이름);
            System.out.println("확장자명 확인: " + 확장자이름);
            System.out.println("파일이름과 확장자명 확인 검사를 성공했습니다.");
        } catch (StringIndexOutOfBoundsException e) {
            // 파일이름txt에서 .이 존재하지 않아 dotIndex가 -1로
            // . index 번호를 찾을수 없음을 표기
            System.out.println("file 이름 내 . 이 존재하지 않습니다. 확정자를 다시 확인해주세요");
        }

    }

    public void method4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("파일이름: ");
        String file = sc.nextLine();
        // 파일이름 확인 확장자 확인
        // 확장자 표기인 . 이 존재하지 않으면 예외 발생

        int dotIndex = file.lastIndexOf("."); //. 이 파일명에서 어디에 있는가 찾기?
        System.out.println("doIndex 위치 : "+dotIndex);
        try {
            //dot Index에서 .뒤에 확장자가 명칭이 존재하지 않으면
            // throw new IllegalArgumentException("존재하는 확장자 명칭이 없습니다")
            // 를 if문 / catch문을 활용해서 출력할 수 있도록 설정


                if(dotIndex == -1 || dotIndex == file.length() - 1){
                    throw new IllegalArgumentException("존재하는 확장자 명칭이 없습니다");

            }

            String 파일이름 = file.substring(0,dotIndex);
            String 확장자이름 = file.substring(dotIndex);
            System.out.println("파일이름 확인: " + 파일이름);
            System.out.println("확장자명 확인: " + 확장자이름);
            System.out.println("파일이름과 확장자명 확인 검사를 성공했습니다.");
        } catch (StringIndexOutOfBoundsException e) {
            // 파일이름txt에서 .이 존재하지 않아 dotIndex가 -1로
            // . index 번호를 찾을수 없음을 표기
            System.out.println("file 이름 내 . 이 존재하지 않습니다. 확정자를 다시 확인해주세요");
        }catch (IllegalArgumentException e) {
            System.out.println("존재하는 확장자 명칭이 없습니다");
        } catch (Exception e) {
            System.out.println("개발자가 생각치 못한 오류 기록후 추후 catch문 추가");
        } finally {
            sc.close();
        }

    }

    // 일주일 내 풀어볼 숙제
    // 스캐너로 ArrayList 이용해서 숫자값 입력받고, 입력받은 숫자값의 총길이나
    // 계산을 구하는 프로그램
    // 상황에 맞는 예외처리 추가


}




