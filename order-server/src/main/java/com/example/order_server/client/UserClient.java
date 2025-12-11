package com.example.order_server.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-server")
public interface UserClient {
    @GetMapping("/users/{id}")
    String getUser(@PathVariable String id);
}
