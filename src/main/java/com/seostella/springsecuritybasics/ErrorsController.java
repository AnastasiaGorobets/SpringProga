package com.seostella.springsecuritybasics;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ErrorsController {
    @RequestMapping(value = "/errors/page-not-found.jsp",method = RequestMethod.GET)
    public String handle404() {
        return "/page-not-found";
    }

    @RequestMapping(value = "/errors/403.jsp",method = RequestMethod.GET)
    public String handle403() {
        return "/403";
    }



    @RequestMapping(value = "/main/",method = RequestMethod.GET)
    public String after404() {
        return "main";
    }


}
