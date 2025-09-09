package edu.io.pack4.Run;

import edu.io.pack4.Service.파일생성삭제서비스;

public class 파일생성삭제실행 {

    public static void main(String[] args) {

        파일생성삭제서비스 svc = new 파일생성삭제서비스();
        svc.createFolder();                       // "file/store" 생성
        svc.createFile("file/store/Book.txt");    // 파일 생성 + 한 줄 추가

    }
}
