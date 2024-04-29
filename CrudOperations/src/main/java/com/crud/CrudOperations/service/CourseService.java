package com.crud.CrudOperations.service;

import com.crud.CrudOperations.Repository.CourseRepository;
import com.crud.CrudOperations.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Courses insert(Courses course){
//        course.setCourseName(course.getCourseName());
//        course.setCourseStart(course.getCourseStart());
//        course.setCourseLecturer(course.getCourseLecturer());
//        course.setCoursePeriodOfTime(course.getCoursePeriodOfTime());
        return courseRepository.insert(course);
    }

    //public Courses update()
    public void deleteByID(String courseID){
        courseRepository.deleteById(courseID);
    }

    public void deleteByName(String courseName){
        courseRepository.deleteByName(courseName);
    }

    public List<Courses> findAllCourses(){
        return courseRepository.findAll();
    }

    public List<Courses> findByName(String courseName ){
        return courseRepository.findByName(courseName);
    }

    public Optional<Courses> findByID(String courseID ){
        return courseRepository.findById(courseID);
    }
}
