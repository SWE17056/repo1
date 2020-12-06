package com.example.attendance.service;

import com.example.attendance.pojo.Teacherattendance;

import java.util.List;

public interface teacherAttendService {
  public List<Teacherattendance> findhistory(String username);
}
