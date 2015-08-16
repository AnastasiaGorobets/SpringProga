package com.seostella.springsecuritybasics;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/testPrint")
    public String test(){


        return "test";
    }


}
