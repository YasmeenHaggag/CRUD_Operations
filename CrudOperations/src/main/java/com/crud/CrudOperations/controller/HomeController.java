package com.crud.CrudOperations.controller;

import com.crud.CrudOperations.model.Courses;
import com.crud.CrudOperations.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {
    @Autowired
    CourseService courseService;

    @PostMapping("/insertCourse")
    public Courses insertCourse(@RequestBody Courses course){
        return courseService.insert(course);
    }

    @GetMapping("/findAllCourses")
    public List<Courses> findAllCourses(){
        return courseService.findAllCourses();
    }

    @GetMapping("/findCourseByName")
    public List<Courses> findCourseByName(@RequestParam("courseName") String courseName){
        return courseService.findByName(courseName);
    }

    @GetMapping("/findCourseByid")
    public Optional<Courses> findCourseByid(@RequestParam("courseID") String courseID){
        return courseService.findByID(courseID);
    }

//    @DeleteMapping("/deleteByName")
//    public void deleteByName(@RequestParam("courseName") String courseName){
//         courseService.deleteByName(courseName);
//    }
//
    @DeleteMapping("/deleteByid")
    public void deleteByid(@RequestParam("courseID") String courseID){
        courseService.deleteByID(courseID);
    }

}
