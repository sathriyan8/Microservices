package org.example.secondmicroserviceclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SecondClientController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/second")
    public String get(){

        String str = restTemplate.getForObject("http://localhost:9091/first", String.class);

        return str + "Second Microservice is calling";
    }
}
