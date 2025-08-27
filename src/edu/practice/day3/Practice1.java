package edu.practice.day3;

public class Practice1 {
    /* ****** 필드  = 속성   ***** */
    private  String title ;
    private  String author;
    private  int price;
    private  boolean isAvailable = true;


    /* ****** 메서드  = 기능   ***** */
    // 기본 생성자

    public Practice1() {
    }


    // 매개변수 생성자 에서 isAvailable  제외하고 만들기

    public Practice1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Setter

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Getter


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    /* 도서 대출 */
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + "이(가) 대출되었습니다.");
        } else {
            System.out.println(title + "은(는) 이미 대출 중입니다.");
        }
    }

    /* 도서 반납 */
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + "이(가) 반납되었습니다.");
        } else {
            System.out.println(title + "은(는) 이미 반납된 상태입니다.");
        }
    }

    /* 도서 정보 출력 */
    public void displayInfo() {
        System.out.println("=== 도서 정보 ===");
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
        System.out.println("대출 가능: " + (isAvailable ? "가능" : "불가능"));
    }
    }



