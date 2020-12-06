package com.example.attendance.controller;

import com.example.attendance.pojo.Account;
import com.example.attendance.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class indexController {
    @Autowired
private AccountService accountService;




    @PostMapping("/denglu/login")
    public String login(HttpServletRequest request, Account account, Model model){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        account=accountService.login(username,password);

        System.out.println(username+" "+password);
        if(account!=null){
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            return"index";
        }
        else
        {
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }

    }

    @RequestMapping("/quit")
    public String quit()
    {
        return "login";
    }

    @RequestMapping("/index")
    @GetMapping("/404")
    public String error404()
    {
        return "error/404";
    }



    @RequestMapping("/show")
    public String shouinformation()
    {
        return "showinformation";
    }



    @RequestMapping("/postattance")
    public String attence()
    {
        return "PostAttendance";
    }

    @RequestMapping("/history")
    public String history()
    {
        return "History";
    }

    @RequestMapping("/selectmsg")
    public String Checkattendance()
    {
        return "Checkattendance";
    }


    @RequestMapping("/up")
    public String goUpload() {
        //跳转到 templates 中tools目录下的 upload.html
        return "upload";
    }


}
