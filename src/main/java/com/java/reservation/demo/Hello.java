package com.java.reservation.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
@RequestMapping("/hello")
    public String sayHello(@RequestParam(value="firstName") String firstName){
    return "Hello "+firstName;
}

}
