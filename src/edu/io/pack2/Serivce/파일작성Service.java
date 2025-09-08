package edu.io.pack2.Serivce;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class 파일작성Service {

    /*
    Files.writeString() : Java11 부터 도입되 기능으로
                          간단히 문자열을 파일에 쓰는 방법


   파일을 작성할떄
   파일을 열고, 파일 내부에 글자를 작성하다 표기하고,
   try-catch 를 이용해서 파일 생성하는데 문제가 없는지 확인하면서 진행
   영어, 숫자 이외 글자들은 컴퓨터에서 글자깨짐 없이 작성될 수 있도록
   인코딩하는 설정 또한 알아서 처리해주는 문서

   자바 개발자들이 만든 Class문서 파일들
    File : 가장 처음에 만들어진 파일에 관련된 기능들이 작성되어 있는 문서
           java.io

    Files : Java 7 부터 도입된 문서
            파일 및 디렉터리를 처리(생성,복시,이동,쓰기,읽기 등)을 편리하고
            문제없이 사용할수 있도록 개선된 기능들이 모아놓은 File 업그레이드 버전
            - writeString() : java11 에서 추가된 기능
            문자열을 파일에 작성하는 기능을 전담

    path  : 주소 경로에 대한 정보를 기능적으로 작성해놓은 인터페이스

    paths : Path 기능들을 활용해서 만든 문서 파일
            ->  이 두가지를 사용하지 않아도 경로를 Files.getPath() 와 같은 기능으로 파일의 경로를 가져올수 있지만....
                경로에 대한 기능들만 중심적으로 작성해 놓은 문서를 만들어놓은 이유는
                File 문서는 파일처리만 진행하자...
                Paths 문서를 이용해서 경로에 해당하는건 이 문서를 통해서 이용하자
                역할에 따른 명확한 분리가 필요하다 여겨 Path가 생성된 것이지만
                Files.getPath() 를 이용해도 큰 문제는 없다...

                마치 math.random() 이 존재하고 Random.random() 존재하는 것과 같은 개념
                수학 - 랜덤기능                  랜덤기능자체를 분리해서 사용

                Files         .                                writeString    (Paths.get(filename), 파일내용);
                파일2버전문서를 활용해서 내부에 존재하는       문자열작성기능 (문서가위치한경로,    문서에 들어갈 내용
    */



    public void method1(){
        String filename = "파일1.txt";
        String 파일내용 = "파일 1 내부에 글자를 작성할 것입니다.";

        try {
            Files.writeString(Paths.get(filename),파일내용);
            System.out.println(filename + "파일 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 현재 java_basic 폴더에서 files라는 폴더를 생성
    // files 라는 폴더 내부에 파일2.txt 만들고,
    // 파일내용 ; 안녕하세요.
    //    반갑습니다.
    //            오늘점심은 어떻게 되나요
    // String content = "안녕하세요. 반값습니다. 오늘 점심은 어떻게 되나요."
    // 를 활용해서 파일2.txt 내부에 작성하기
    // File 와 Files 만 활용
    // Paths 대신 File.getPath() 이용하거나 File 객체이용
    // path filename content fPath fFliename

    public void method2() {
        String folderName = "files";         // 상대 경로 폴더
        String filename = "파일2.txt";        // 파일명
        String content = "안녕하세요.\n반갑습니다.\n오늘 점심은 어떻게 되나요."; // 줄바꿈 포함

        // File 객체를 이용한 상대 경로 설정
        File folder = new File(folderName);
        File file = new File(folder, filename); // files/파일2.txt

        try {
            // 폴더 없으면 생성
            if (!folder.exists()) {
                if (folder.mkdirs()) {
                    System.out.println(folder.getPath() + " 폴더 생성 완료.");
                }
            }

            // Files.writeString 사용하여 파일 쓰기 (File → Path 변환)
            Files.writeString(file.toPath(), content, StandardCharsets.UTF_8);
            System.out.println(filename + " 파일 저장 완료.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }


}