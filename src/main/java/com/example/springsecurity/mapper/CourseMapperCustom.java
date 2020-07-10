package com.example.springsecurity.mapper;


import com.example.springsecurity.pojo.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapperCustom {

    public List<Course> selectCourse();

}