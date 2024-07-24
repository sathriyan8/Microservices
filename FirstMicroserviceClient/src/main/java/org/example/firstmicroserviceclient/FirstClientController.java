package org.example.firstmicroserviceclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstClientController {

    @GetMapping("/first")
  public String getMessage(){

return "First Microservices Client is calling";

    }
}
