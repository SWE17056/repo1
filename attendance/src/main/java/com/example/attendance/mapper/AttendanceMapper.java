package com.example.attendance.mapper;

import com.example.attendance.pojo.Attendance;
import com.example.attendance.pojo.AttendanceExample;
import java.util.List;

import com.example.attendance.pojo.Course;
import org.apache.ibatis.annotations.Param;

public interface AttendanceMapper {
    long countByExample(AttendanceExample example);

    int deleteByExample(AttendanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    List<Attendance> selectByExample(AttendanceExample example);

    Attendance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByExample(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);

    public void Addstudent(@Param("bg_id") String bg_id,@Param("username") String username);

    public void Addother(@Param("attenceNo") String attenceNo,@Param("date") String date);

    List<Attendance> attenceHistory(@Param("msg") String msg,@Param("attenceTime") String attenceTime);

    public void updatesit0(@Param("attence_no") String attence_no,@Param("time") String time,@Param("stuname") String stuname);

    public void updatesit1(@Param("attence_no1") String attence_no1,@Param("time1") String time1,@Param("stuname1") String stuname1);

    public void updatesit2(@Param("attence_no2") String attence_no2,@Param("time2") String time2,@Param("stuname2") String stuname2);

    public void updatesit3(@Param("attence_no3") String attence_no3,@Param("time3") String time3,@Param("stuname3") String stuname3);

}