package edu.practice.day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise1 {

    //**practice** 폴더를 만들고 그 안에 인사말 파일을 생성하는 프로그램을 작성하세요.
    //
    //**요구사항**:
    //
    //- `practice` 폴더 생성
    //- `hello.txt` 파일 생성
    //- "안녕하세요! 자바 파일 처리 연습중입니다." 내용 작성
    //- 성공 시 "hello.txt 파일 생성 완료" 출력

    public void practice(){
        Path folderPath = Path.of("practice");                 // 폴더 경로
        Path filePath = Path.of("practice", "hello.txt");      // 파일 경로
        String content = "안녕하세요 자바 파일 처리 연습중입니다.";

        try {
            // 1. practice 폴더 생성 (이미 있으면 무시됨)
            Files.createDirectories(folderPath);

            // 2. hello.txt 파일에 문자열 쓰기 (기존 파일이 있으면 덮어씀)
            Files.writeString(filePath, content);

            System.out.println("파일 생성 및 쓰기 완료: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
