package com.example.attendance.controller;

import com.example.attendance.pojo.Course;
import com.example.attendance.service.CourseService;
import com.example.attendance.utils.layuiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class showController {
    @Autowired
    private CourseService courseService;





    @RequestMapping("/showinfo")
    @ResponseBody
    public layuiResult showinformation(HttpServletRequest request){
        Object username;
        HttpSession session = request.getSession();
        username=session.getAttribute("username");
        layuiResult<Course> result = new layuiResult<>();
        List<Course> list=courseService.showinformation(username.toString());
        result.setData(list);
        return result;
    }


}
