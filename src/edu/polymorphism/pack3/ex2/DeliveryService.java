package edu.polymorphism.pack3.ex2;

public interface DeliveryService {

    void  orderFood();    // 음식을 주문하는 기능
    void  trackOrder(String orderId); // 주문ID에 따라 주문을 추척하는 기능
}
