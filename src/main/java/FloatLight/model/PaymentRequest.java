package com.example.demo.model;

public class PaymentRequest {
    private String wid;
    private String order_id;

    // Getter 和 Setter
    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}