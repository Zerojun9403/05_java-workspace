package pracitce.exception.ex;

public class InvalidPasswordException extends Exception {

    public InvalidPasswordException(){
        super(  "일치하는 비밀번호가 아닙니다.");
        // super 나 system 이나 문자열 출력익 떄문에 크게 문제된 않지만 super로 작성해주는것이 좋음
    }


    // 회사에서 기본적으로 예외상황에 대한 출력문을 작성해놓은 것을
    // 특수한 환경에서 수정하여 사용해야할 경우 ↓ 생성자를 활용해서 작성
    public InvalidPasswordException(String message) {
        super(message);
    }
}
