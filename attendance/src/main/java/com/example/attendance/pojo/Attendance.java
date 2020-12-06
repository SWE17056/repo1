package com.example.attendance.pojo;

import java.util.Date;

public class Attendance {
    private Integer id;

    private String studentName;

    private String studentNo;

    private String attenceNo;

    public String getAttenceTime() {
        return attenceTime;
    }

    public void setAttenceTime(String attenceTime) {
        this.attenceTime = attenceTime;
    }

    private String attenceTime;

    private Integer attenceSit;

    private String address;

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo == null ? null : studentNo.trim();
    }

    public String getAttenceNo() {
        return attenceNo;
    }

    public void setAttenceNo(String attenceNo) {
        this.attenceNo = attenceNo == null ? null : attenceNo.trim();
    }



    public Integer getAttenceSit() {
        return attenceSit;
    }

    public void setAttenceSit(Integer attenceSit) {
        this.attenceSit = attenceSit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}