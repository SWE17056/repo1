package com.example.attendance.controller;


import com.example.attendance.pojo.Teacherattendance;
import com.example.attendance.service.teacherAttendService;
import com.example.attendance.utils.layuiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class teacherAttendController {
    @Autowired
    private teacherAttendService teacherAttendService;

    @RequestMapping("/attendhistory")
    @ResponseBody
   public layuiResult<Teacherattendance> showshtdenthistory(HttpServletRequest request){
        Object username;
        HttpSession session = request.getSession();
        username=session.getAttribute("username");
        layuiResult<Teacherattendance>result=new layuiResult<>();
        List<Teacherattendance> list=teacherAttendService.findhistory(username.toString());
        result.setData(list);
        return result;
    }



}
