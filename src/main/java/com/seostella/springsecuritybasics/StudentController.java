package com.seostella.springsecuritybasics;


import DBConnection.Connect;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

Connect connect=new Connect();
    @RequestMapping(value = "/addNewStudent/")
    public String addNewStudent(){

       return "addNewStudent";

    }

  @RequestMapping(value = "/student/newStudent", method = RequestMethod.POST)
  public String newStudent(HttpServletRequest request){
  String name=request.getParameter("name");
  String sername=request.getParameter("sername");
  String group=request.getParameter("groups");

      connect.addStudent(name,sername,group);

        System.out.println(name);
        return  "main";

    }

}
