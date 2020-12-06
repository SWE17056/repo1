package com.example.attendance.service;

import com.example.attendance.pojo.Attendance;

import java.util.List;

public interface attendanceService {

    public void addStudent(String bg_id,String username);

    public void addOther(String attenceNo,String date);

    public void addHistorical(String attence_no,String course_no,String teacher_no,String attence_time);

    public List<Attendance> attendHistory(String msg,String attenceTime);

    public void updatesit0(String attence_no,String time,String stuname);

    public void updatesit1(String attence_no1,String time1,String stuname1);

    public void updatesit2(String attence_no2,String time2,String stuname2);

    public void updatesit3(String attence_no3,String time3,String stuname3);




}
