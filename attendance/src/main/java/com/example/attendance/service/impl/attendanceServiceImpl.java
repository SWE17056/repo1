package com.example.attendance.service.impl;

import com.example.attendance.mapper.AttendanceMapper;
import com.example.attendance.mapper.TeacherattendanceMapper;
import com.example.attendance.pojo.Attendance;
import com.example.attendance.service.attendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class attendanceServiceImpl implements attendanceService
{
    @Autowired
    private AttendanceMapper attendanceMapper;

    @Autowired
    private TeacherattendanceMapper teacherattendanceMapper;

    @Override
    public void addStudent(String bg_id, String username) {
      this.attendanceMapper.Addstudent(bg_id,username);
    }

    @Override
    public void addOther( String attenceNo,String date) {
        this.attendanceMapper.Addother(attenceNo,date);
    }

    @Override
    public void addHistorical(String attence_no, String course_no, String teacher_no, String attence_time) {
        this.teacherattendanceMapper.addHistorical(attence_no,course_no,teacher_no,attence_time);
    }

    @Override
    public List<Attendance> attendHistory(String msg, String attenceTime) {
        return this.attendanceMapper.attenceHistory(msg,attenceTime);
    }

    @Override
    public void updatesit0(String attence_no, String time, String stuname) {
        this.attendanceMapper.updatesit0(attence_no,time,stuname);
    }

    @Override
    public void updatesit1(String attence_no1, String time1, String stuname1) {
        this.attendanceMapper.updatesit1(attence_no1,time1,stuname1);
    }

    @Override
    public void updatesit2(String attence_no2, String time2, String stuname2) {
        this.attendanceMapper.updatesit2(attence_no2,time2,stuname2);
    }

    @Override
    public void updatesit3(String attence_no3, String time3, String stuname3) {
        this.attendanceMapper.updatesit3(attence_no3,time3,stuname3);
    }
}
