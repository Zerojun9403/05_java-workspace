package edu.exception.pack3.ex3;

import java.io.File;
import java.io.IOException;

public class NewFileServiceRun {
    // 월요일 IO 입출력
    public static void main(String[] args) {
        // File 이라는 자바 개발자들이 만든 문서를 활용해서
        // 파일을 생성하기
        File file = new File("생성된.txt");
        if (!file.exists()) {//생성된.txt가 존재하지 않는게 사실이라면
            try {
                file.createNewFile();
                System.out.println("file 생성이 완료되었습니다.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
