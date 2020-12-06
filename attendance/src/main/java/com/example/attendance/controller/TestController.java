package com.example.attendance.controller;

import com.example.attendance.pojo.Account;
import com.example.attendance.service.AccountService;
import com.example.attendance.utils.DataResult;
import com.example.attendance.vo.req.UserPageReqVO;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/test/data")
    @ResponseBody
    public DataResult<String> test()
    {
        Account account=new Account();
        account.setAccountNo("ST001");
        account.setPassword("aa111");
        DataResult result=DataResult.success(account);
        return  result;
    }

    @PostMapping("/account")
    public DataResult<PageInfo<Account>>pageInfo(@RequestBody UserPageReqVO vo)
    {
        DataResult result=DataResult.success();
        result.setData(accountService.pageInfo(vo));
        return result;
    }
}
