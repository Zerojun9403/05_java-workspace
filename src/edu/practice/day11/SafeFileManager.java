package edu.practice.day11;

import java.io.*;
import java.util.*;

public class SafeFileManager {

    public void method1() {
        Scanner sc = new Scanner(System.in);
        File file;

        Map<String, String> fileMap = new HashMap<>(); // 파일명 : 파일경로
        Map<String, Long> fileSizeMap = new HashMap<>(); // 파일명 : 파일크기
        BufferedReader br = null;

        // 초기 데이터
        fileMap.put("config", "config.txt");
        fileMap.put("log", "system.log");
        fileMap.put("data", "data.csv");

        // "config.txt" 파일을 읽어서 내용 출력
        // FileNotFoundException, IOException 처리
        // Map에서 파일 정보 조회 시 null 체크
        // finally에서 파일 스트림 닫기 및 "파일 관리 작업 완료" 메시지


        String fm = fileMap.get("config"); // config 탭에 존재하는 config.txt 가져오기

        // 파일 읽는 방법
        try {
            br = new BufferedReader(new FileReader(fm)); // 파일쓰기. 파일생성, 파일읽는 모구 try - catch로 시도
        } catch (FileNotFoundException e) {
            // 만약에 파일이 존재하지 않을경우
            System.out.println("존재하지 않은 파일입니다.");
            System.out.print("파일을 생성하시겠습니까? :");
            String 대답 = sc.nextLine();

            if ("yes".equals("대답")) {
                file = new File(fm);
                try {
                    file.createNewFile();
                    System.out.println("파일생성이 완료되었습니다.");
                } catch (IOException ex) {
                    // 파일 생성 실패 했을대 문제 추가하기
                }
            } else {
                System.out.println("파일생성을 취소합니다. ");
            }
        } finally {
            System.out.println("파일실행을 종료합니다.");
        }

    }

}


