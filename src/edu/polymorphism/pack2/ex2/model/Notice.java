package edu.polymorphism.pack2.ex2.model;

public class Notice extends Post{


    //### 추가 필드
    //
    //- [ ]  `priority` (String): 중요도
    //
    //### 생성자
    //
    //- [ ]  기본 생성자
    //- [ ]  모든 필드를 매개변수로 받는 생성자
    //



    private  String priority ;

    public Notice() {
    }



    public Notice(String postId, String title, String author, String content, String priority) {
        super(postId, title, author, content);
        this.priority = priority;
    }


    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    // post 클래스에서 강제로 작성해야 하는 메서드만 필히 작성하기!

    //### 메소드
    //
    //- [ ]  `priority` 필드의 getter/setter
    //- [ ]  `displayPost()` 메소드 구현:
    //
    //    ```
    //    [공지사항] {제목}작성자: {작성자}중요도: {중요도}내용: {내용}
    //
    //    ```
    @Override
    public void displayPost() {
        System.out.println("[공지사항] { "+ getTitle()+"} 작성자 : {"+getAuthor()+"} 중요도 : {"+getPriority()+"} 내용 {"+ getPriority()+"}");
    }


}
