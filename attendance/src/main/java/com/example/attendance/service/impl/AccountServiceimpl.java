package com.example.attendance.service.impl;

import com.example.attendance.mapper.AccountMapper;
import com.example.attendance.pojo.Account;
import com.example.attendance.pojo.AccountExample;
import com.example.attendance.service.AccountService;
import com.example.attendance.vo.req.UserPageReqVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountServiceimpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;


    @Override
    public Account login(String username, String password) {

        return accountMapper.login(username,password);
    }

    @Override
    public PageInfo<Account> pageInfo(UserPageReqVO vo) {
        AccountExample example=new AccountExample();
        PageHelper.startPage(vo.getPageNum(),vo.getPageSize());
        List<Account> accounts = accountMapper.selectByExample(example);
        PageInfo<Account> pageInfo =new PageInfo<>(accounts);
        return pageInfo;
    }
}
