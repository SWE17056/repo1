package com.example.attendance.service.impl;

import com.example.attendance.mapper.TeacherattendanceMapper;
import com.example.attendance.pojo.Teacherattendance;
import com.example.attendance.service.teacherAttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class teacherAttendImpl implements teacherAttendService {

@Autowired
private TeacherattendanceMapper teacherattendanceMapper;


    @Override
    public List<Teacherattendance> findhistory(String username) {
        return this.teacherattendanceMapper.showHistory(username);
    }
}
