package com.example.attendance.pojo;


public class Teacherattendance {
    private Integer id;

    private String attenceNo;

    private String courseNo;

    private String teacherNo;


    private String attenceTime;

    public String getAttenceTime() {
        return attenceTime;
    }

    public void setAttenceTime(String attenceTime) {
        this.attenceTime = attenceTime;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttenceNo() {
        return attenceNo;
    }

    public void setAttenceNo(String attenceNo) {
        this.attenceNo = attenceNo == null ? null : attenceNo.trim();
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo == null ? null : courseNo.trim();
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo == null ? null : teacherNo.trim();
    }


}