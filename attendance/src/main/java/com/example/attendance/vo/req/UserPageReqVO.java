package com.example.attendance.vo.req;

import lombok.Data;

@Data
public class UserPageReqVO {
    private Integer pageNum=1;
    private Integer pageSize=10;
}
