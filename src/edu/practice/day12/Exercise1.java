package edu.practice.day12;

import java.io.IOException;
import java.nio.file.*;

public class Exercise1 {

    //**practice** 폴더를 만들고 그 안에 인사말 파일을 생성하는 프로그램을 작성하세요.
    //
    //**요구사항**:
    //
    //- `practice` 폴더 생성
    //- `hello.txt` 파일 생성
    //- "안녕하세요! 자바 파일 처리 연습중입니다." 내용 작성
    //- 성공 시 "hello.txt 파일 생성 완료" 출력

    public void solution1(String dirName,String fileName ) {
        Path folderPath = Path.of(dirName);                 // 폴더 경로
        Path filePath = Path.of(dirName, fileName);      // 파일 경로
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

    public void solution2(String dirName,String fileName) {
        Path filePath = Path.of(dirName, fileName);
        String content;
        if (!Files.exists(filePath)) {
            System.out.println("파일을 찾을수 없습니다.");
            return;
        }
        try {
            content = Files.readString(filePath);
            System.out.println("파일내용" + content);
        } catch (IOException e) {
            System.out.println("파일읽기중 오류가 발생하였습니다.");
        }
    }

    public void solution3(String dirName,String fileName) {
        Path filePath = Path.of("practice", "menu.txt");
        String content = "오늘의 메뉴\n1. 김치찌개\n2. 불고기\n3. 비빔밥";

    }

    public void solution4() {
        Path filePath = Path.of("practice", "menu.txt");
        String content = "임시파일입니다";
        // 파일 생성 + 생성된 파일에 내용 작성하기
        try {
            Files.writeString(filePath, content);
            if (Files.exists(filePath)) {
                System.out.println(filePath + " 파일이 존재합니다.");

                Files.delete(filePath);
                System.out.println("tmp.txt 파일 삭제완료되었습니다.");
                System.out.println("삭제확인" + Files.exists(filePath));
            }
        } catch (IOException e) {
            System.out.println("파일 처리중 오류발생");
        }

    }

    public void solution5(String 폴더1 ,String 폴더2 ,String 폴더3 ) {
        Path dirPath = Path.of(폴더1, 폴더2, 폴더3);
        try {
            Files.createDirectories(dirPath);
            Path note1Path = Path.of(폴더1, 폴더2, 폴더3, "note1.txt");
            Path note2Path = Path.of(폴더1, 폴더2, 폴더3, "note2.txt");
            Files.createDirectories(note1Path);
            Files.createDirectories(note2Path);

            String note1Content = "자바 기초 공부중";
            String note2Content = "파일 처리 배우는 중";

            Files.writeString(note1Path,note1Content);
            Files.writeString(note2Path,note2Content);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}


