package com.example.demo.getcomu;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// comu 는 커뮤니케이션이라는뜻

@RestController
public class GetComuController {

    @GetMapping(value = "first-test")
    public String firstGetComu(){

        return "hi test method";
    }

    @GetMapping(value = "second-test")
    public String secondGetComu(){



        return "success";
    }



}
