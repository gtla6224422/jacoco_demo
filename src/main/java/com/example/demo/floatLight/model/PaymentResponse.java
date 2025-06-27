package com.example.demo.floatLight.model;

public class PaymentResponse {
    private String wid;
    private String order_id;

    public PaymentResponse(String wid, String order_id) {
        this.wid = wid;
        this.order_id = order_id;
    }

    // Getter 和 Setter

    public String getWid() {
        return wid;
    }

    public String getOrder_id() {
        return order_id;
    }
}