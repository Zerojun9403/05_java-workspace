package edu.exception.pack3.ex.Run;

import edu.exception.pack3.ex.Service.CartService;
import edu.exception.pack3.ex.modal.Cart;

import java.util.Scanner;

public class CartRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String createUserId = sc.nextLine();

        Cart cart = new Cart(createUserId);


        CartService cartService = new CartService();
        // CartService.장바구니시간체크기능(createUserId);
        // 둘다 유저아이디를 가져오는것 -> html  대신 작성한 것으므로 나중에는 사용 불가한 방법
        //CartService.장바구니시간체크기능(cart.getUserId());
        // 나중에 html  에서 가져온 데이터를 활용할 방법
        //        --> 지금은 createUserID가 되지만 html을 사용하면 데이터를 받아오는
        //         추후에는 art.getUserId() 만 사용 가능할것


    }

}
