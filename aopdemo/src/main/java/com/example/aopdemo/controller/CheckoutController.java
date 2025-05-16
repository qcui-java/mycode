package com.example.aopdemo.controller;

import com.example.aopdemo.service.CheckoutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @GetMapping("/checkout")
    public String checkout(@RequestParam String user) {
        checkoutService.processCheckout(user);
        return "Checkout initiated for " + user;
    }
}

