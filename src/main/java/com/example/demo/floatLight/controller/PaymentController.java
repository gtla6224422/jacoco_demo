package com.example.demo.floatLight.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.floatLight.model.PaymentRequest;
import com.example.demo.floatLight.model.PaymentResponse;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @PostMapping("/check-payment")
    public PaymentResponse checkPayment(@RequestBody PaymentRequest request) {
        // 使用请求中的参数构造响应对象
        return new PaymentResponse(request.getWid(), request.getOrder_id());
    }

    @GetMapping("/check")
    public PaymentResponse check() {
        // 使用请求中的参数构造响应对象
        return new PaymentResponse("11","22");
    }
}