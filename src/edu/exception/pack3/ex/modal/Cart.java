package edu.exception.pack3.ex.modal;

import java.time.LocalDate;

/*
장바구니 모델
*/
public class Cart {

    private  String userId;
    private LocalDate createTime;

    public Cart(String userId) {
        this.userId = userId;
        this.createTime = LocalDate.now(); // 장바구 생성된 시간은 개발자가 설정!
        // 현재 시간을 작성
    }
    public String getUserId() {
        return userId;
    }
    public LocalDate getCreateTime() {
        return createTime;
    }
    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
