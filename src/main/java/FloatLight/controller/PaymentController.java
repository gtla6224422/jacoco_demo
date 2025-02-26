package com.example.demo.controller;

import com.example.demo.model.PaymentRequest;
import com.example.demo.model.PaymentResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @PostMapping("/check-payment")
    public PaymentResponse checkPayment(@RequestBody PaymentRequest request) {
        // 模拟返回固定数据 {"pay_status":"1"}
        return new PaymentResponse("1");
    }
}