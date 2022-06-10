package me.protik.springbootapi.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "Hello World, I'm the first born of all the upcoming SpringBoot";
    }
}
