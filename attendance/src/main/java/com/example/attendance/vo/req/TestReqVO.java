package com.example.attendance.vo.req;

import lombok.Data;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class TestReqVO {
    @NotEmpty(message = "list 数据不能为空")
    private List<String> list;
}
