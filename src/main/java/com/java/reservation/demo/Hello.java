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
// so your url will look like this: ...../hello?firstName=Rim
// but if you want it to look like this instead : /hello/Rim then you ought to do like this:
    // @RequestMapping("/hello/{fistName}")
    //public String sayHello(@PathVariable("firstName") String firstName) {..}
    
}
