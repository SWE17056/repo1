package com.example.attendance.controller;

import com.example.attendance.pojo.Attendance;
import com.example.attendance.service.attendanceService;
import com.example.attendance.utils.layuiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller

public class addStudentController {


    @Autowired
    private attendanceService attendanceService;
    String getmsg;
    String getattenceTime;


    @RequestMapping("/postlist")
    public String jump(HttpServletRequest request)
    {
        String date=request.getParameter("date");
        String bg_id=request.getParameter("bg_id");
        String attenceNo=request.getParameter("attenceNo");
        Object username;
        HttpSession session = request.getSession();
        session.setAttribute("date",date);
        session.setAttribute("bg_id",bg_id);
        username=session.getAttribute("username");
        session.setAttribute("attenceNo",attenceNo);
        attendanceService.addStudent(bg_id,username.toString());
        attendanceService.addOther(attenceNo,date);
        attendanceService.addHistorical(attenceNo,bg_id,username.toString(),date);
        return "History";
    }

    @PostMapping("/attenctHistory")
    @ResponseBody
    public void History(String msg,String attenceTime)
    {
       this.getmsg=msg;
       this.getattenceTime=attenceTime;
    }

    @RequestMapping("/getattenctHistory")
    @ResponseBody
    public layuiResult<Attendance>getHistory()
    {
        layuiResult<Attendance>result=new layuiResult<>();
        List<Attendance>list =attendanceService.attendHistory(getmsg,getattenceTime);
        result.setData(list);
        return result;
    }


    @RequestMapping("/updatesit0")
    @ResponseBody
    public void updatesit0(String attence_no,String time,String stuname)
    {
        attendanceService.updatesit0(attence_no,time,stuname);
    }


    @RequestMapping("/updatesit1")
    @ResponseBody
    public void updatesit1(String attence_no1,String time1,String stuname1)
    {
        attendanceService.updatesit1(attence_no1,time1,stuname1);
    }

    @RequestMapping("/updatesit2")
    @ResponseBody
    public void updatesit2(String attence_no2,String time2,String stuname2)
    {
        attendanceService.updatesit2(attence_no2,time2,stuname2);
    }

    @RequestMapping("/updatesit3")
    @ResponseBody
    public void updatesit3(String attence_no3,String time3,String stuname3)
    {
        attendanceService.updatesit3(attence_no3,time3,stuname3);
    }


}
