package edu.io.pack5;

import edu.io.pack5.프로필사진service;
import edu.polymorphism.pack3.ex4.SamsungCard;

import java.util.Scanner;

public class 프로필사진run {
    public static void main(String[] args) {
        프로필사진service service = new 프로필사진service();

        //   service.createProfileFolder("member03","프로필사진2.png");
        //    service.createProfileFolder("member04","프로필사진2.png");

        String imgurl = "https://cdn.dailysecu.com/news/photo/202104/123449_145665_1147.png";

        //  service.saveImg(imgurl);


        // 인터넷에서 이미지 주소를 복사한 후
        // 원하는 이미지를
        Scanner sc = new Scanner(System.in);
        System.out.println("저장할 이미지주소를 작성하세요");
        String imgUrl3 = sc.nextLine();
        System.out.println("저장할 폴더명 작성하세요");
        String folder= sc.nextLine();

        System.out.println("저장할 이미지 명칭을 작성하세요");
        String name = sc.nextLine();

        String imgName = name+".png";

        //service.saveImg4(imgName);
        service.saveImg4(folder,imgName,imgUrl3);
    }
}