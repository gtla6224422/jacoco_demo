package com.example.demo.floatLight.model;

public class PaymentResponse {
    private String wid;
    private String order_id;

    // 无参构造函数
    public PaymentResponse() {}


    public PaymentResponse(String wid, String order_id) {
        this.wid = wid;
        this.order_id = order_id;
    }

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