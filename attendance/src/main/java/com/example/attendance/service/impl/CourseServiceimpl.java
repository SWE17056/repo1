package com.example.attendance.service.impl;

import com.example.attendance.mapper.CourseMapper;
import com.example.attendance.pojo.Course;
import com.example.attendance.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceimpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;


    @Override
    public List<Course> showinformation(String username) {
        return this.courseMapper.showinformation(username);
    }
}
