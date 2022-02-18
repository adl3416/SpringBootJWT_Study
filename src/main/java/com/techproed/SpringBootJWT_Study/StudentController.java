package com.techproed.SpringBootJWT_Study;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(path="/students")
    public String  getStudent(String student){
        return "kursat Turgut beye hayırlı offerler";
    }

}
