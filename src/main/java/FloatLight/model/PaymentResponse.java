package com.example.demo.model;

public class PaymentResponse {
    private String pay_status;

    public PaymentResponse(String pay_status) {
        this.pay_status = pay_status;
    }

    // Getter 和 Setter
    public String getPay_status() {
        return pay_status;
    }

    public void setPay_status(String pay_status) {
        this.pay_status = pay_status;
    }
}