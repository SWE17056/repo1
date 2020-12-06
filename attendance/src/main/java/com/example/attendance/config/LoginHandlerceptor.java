package com.example.attendance.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object username = request.getSession().getAttribute("username");

        if(username==null){
            request.setAttribute("msg","没有登录,请先登录");
            request.getRequestDispatcher("/login.html").forward(request,response);
            return false;
        }else {return true;}


    }


}
