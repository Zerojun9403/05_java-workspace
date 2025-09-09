package edu.io.pack3.Service;

import java.io.*;
import java.nio.file.Files;

public class FileService3 {

    public void 고전방식() {
        File file = new File("files/파일2.txt");
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
            return; // 파일이 존재하지 않기 때문에 기능 멈춤처리
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("읽을 수 있는 파일이 존재하지 않습니다. ");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제 발생했을때 로직 생성");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("파일이 다른데에서 사용중이기 때문에 닫을 수 없습니다.");
                }
            }
        }
    }


}
