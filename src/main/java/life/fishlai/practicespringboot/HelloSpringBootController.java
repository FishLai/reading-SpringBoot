package life.fishlai.practicespringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {
    private String test;
    @RequestMapping("/hello")
    public String hello(){

        test = "test";
        return "Hello, My First Spring Boot Controller";

    }

}
