package com.example.attendance.controller;

import com.example.attendance.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class updateController {

@Autowired
private UploadService uploadService;




    @RequestMapping(value = "/excel",method = RequestMethod.POST)
    public String upload(MultipartFile file, Model model) throws Exception {

        boolean flag = uploadService.getExcel(file);

        if(flag){
            model.addAttribute("Message", "上传成功");
        }else{
            model.addAttribute("Message", "上传失败");
        }
        return "upload";

    }

}
