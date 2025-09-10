package edu.io.pack5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 프로필사진service {

    public  void createProfileFolder(){
        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성

        Path memberFolder1= Path.of("porfiles","member01");
        Path memberFolder2= Path.of("porfiles","member02");

        // 2.폴더생성
        try {
            Files.createDirectories(memberFolder1);
            Files.createDirectories(memberFolder2);

            //3.폴더 내에 프로필 사진 저장하기
            Path picture1 = Path.of("porfiles","member01","프로필사진01.txt");
            Path picture2 = Path.of("porfiles","member01","프로필사진02.txt");
//            Path picture1 = Path.of("porfiles","member01","프로필사진01.png");
//            Path picture2 = Path.of("porfiles","member01","프로필사진02.png");

            Files.writeString(picture1,"프로필 사진입니다.");
            Files.writeString(picture2,"프로필 사진입니다.");

            System.out.println("프로필 사진이 개별폴더로 저장이 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생 했을때 문제 해결");
            // 1. 메인서버가 끊기면 2번째 후보 서버로 저장 시작
            // 2. 이미지가 5MB 이상 초과되면 저장 못하게하고, 5MB 초과할 수 없음을 안내
        }
    }

}
