package edu.polymorphism.pack2.ex2.model;

public class Review extends Post{

    private int rating;

    public Review() {
    }

    public Review(String postId, String title, String author, String content, int rating) {
        super(postId, title, author, content);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void displayPost() {
        System.out.println("[공지사항] { "+ getTitle()+"} 작성자 : {"+getAuthor()+"} 답변개수 : {"+(getRating())+ "}" + getContent());
    }
}
