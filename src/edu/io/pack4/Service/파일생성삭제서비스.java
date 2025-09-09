package edu.io.pack4.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class 파일생성삭제서비스 {

    // (A) 폴더 생성: 기본 경로는 "file/store"
    public void createFolder() {
        createFolder("file/store");
    }

    // (A-확장) 재사용 가능한 폴더 생성 유틸
    public void createFolder(String folderPath) {
        Path path = Path.of(folderPath);
        try {
            if (!Files.exists(path)) {
                Files.createDirectories(path);
                System.out.println("폴더 생성 완료: " + path.toAbsolutePath());
            } else {
                System.out.println("이미 존재하는 폴더: " + path.toAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("폴더 생성 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /*
     * (B) 파일 생성
     * - file/store 폴더가 존재하는지 확인
     * - 없으면 자동 생성 후 진행(실무 안전성 향상)
     * - Book.txt 생성 후 "더조은책방 - 책 리스트" 한 줄 추가
     */
    public void createFile(String filePath) {
        Path path = Path.of(filePath);
        Path parent = path.getParent(); // 기대: file/store

        try {
            // 1) 부모 폴더 확인(없으면 생성)
            if (parent != null && !Files.exists(parent)) {
                System.out.println("부모 폴더가 없어 생성합니다: " + parent.toAbsolutePath());
                Files.createDirectories(parent);
            }

            // 2) 파일 생성
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("파일 생성 완료: " + path.toAbsolutePath());

                // 3) 내용 한 줄 추가
                Files.writeString(path, "더조은책방 - 책 리스트\n", StandardOpenOption.APPEND);
                System.out.println("책 리스트 한 줄 추가 완료");
            } else {
                System.out.println("이미 존재하는 파일: " + path.toAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("파일 생성/쓰기 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }
}