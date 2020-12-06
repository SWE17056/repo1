package com.example.attendance.mapper;

import com.example.attendance.pojo.Teacherattendance;
import com.example.attendance.pojo.TeacherattendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherattendanceMapper {
    long countByExample(TeacherattendanceExample example);

    int deleteByExample(TeacherattendanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teacherattendance record);

    int insertSelective(Teacherattendance record);

    List<Teacherattendance> selectByExample(TeacherattendanceExample example);

    Teacherattendance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teacherattendance record, @Param("example") TeacherattendanceExample example);

    int updateByExample(@Param("record") Teacherattendance record, @Param("example") TeacherattendanceExample example);

    int updateByPrimaryKeySelective(Teacherattendance record);

    int updateByPrimaryKey(Teacherattendance record);

    void addHistorical(@Param("attence_no")String attence_no,@Param("course_no")String course_no,@Param("teacher_no")String teacher_no,@Param("attence_time")String attence_time);

    List<Teacherattendance> showHistory(@Param("username")String username);
}