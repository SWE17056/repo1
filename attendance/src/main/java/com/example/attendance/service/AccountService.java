package com.example.attendance.service;

import com.example.attendance.pojo.Account;
import com.example.attendance.vo.req.UserPageReqVO;
import com.github.pagehelper.PageInfo;

public interface AccountService {
    public Account login(String username, String password);

    PageInfo<Account> pageInfo(UserPageReqVO vo);

}
