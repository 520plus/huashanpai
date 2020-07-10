package com.example.springsecurity.Conroller;

import com.example.springsecurity.mapper.CourseMapperCustom;
import com.example.springsecurity.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private CourseMapperCustom mapperCustom;

    @RequestMapping(value = "/login")
    public String login(String username, String password) {
        List<Course> course = mapperCustom.selectCourse();
        System.out.println(course.get(0));

        return "login";

    }
}
