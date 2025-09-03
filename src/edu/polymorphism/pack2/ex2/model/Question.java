package edu.polymorphism.pack2.ex2.model;

public class Question extends  Post{
    private  int answerConunt;

    public Question() {
    }

    public Question(String postId, String title, String author, String content) {
        super(postId, title, author, content);
        this.answerConunt = 0 ;  // answerConunt 응답개수의 경우 소비자한테 전달 받는 것이 아닌 개발자가 첫 응답 개수를
    }


    public int getAnswerConunt() {
        return answerConunt;
    }

    public void setAnswerConunt(int answerConunt) {
        this.answerConunt = answerConunt;
    }

    @Override
    public void displayPost() {
        System.out.println("[공지사항] { "+ getTitle()+"} 작성자 : {"+getAuthor()+"} 답변개수 : {"+getAnswerConunt()+ "}" + getContent());
    }
}
