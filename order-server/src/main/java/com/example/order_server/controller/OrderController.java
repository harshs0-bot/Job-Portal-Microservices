package com.example.order_server.controller;

import com.example.order_server.client.UserClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final UserClient userClient;

    public OrderController(UserClient userClient){
        this.userClient = userClient;
    }

    @GetMapping("/{id}")
    public String getOrder(@PathVariable String id){
        return "Order " + id + " placed by -> " + userClient.getUser("101");
    }
}
