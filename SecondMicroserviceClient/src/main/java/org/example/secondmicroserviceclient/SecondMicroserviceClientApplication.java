package org.example.secondmicroserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SecondMicroserviceClientApplication {

    @Primary
    @Bean
    public RestTemplate restTemplate(){
       return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SecondMicroserviceClientApplication.class, args);
    }

}
