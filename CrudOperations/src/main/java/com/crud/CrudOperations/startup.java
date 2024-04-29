package com.crud.CrudOperations;

import com.crud.CrudOperations.Repository.CourseRepository;
import com.crud.CrudOperations.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class startup implements CommandLineRunner{

    @Autowired
    CourseRepository courseRepository;

    @Override
    public void run(String... args) throws Exception {
//        Courses course1=new Courses();
//        course1.setCourseName("Operating Systems");
//        course1.setCourseLecturer("Prof: Andro");
//        course1.setCourseStart("30 March 2024");
//        course1.setCoursePeriodOfTime("Three Months");
//
//        Courses course2=new Courses();
//        course2.setCourseName("Network");
//        course2.setCourseLecturer("Prof: Osama");
//        course2.setCourseStart("20 April 2024");
//        course2.setCoursePeriodOfTime("Three Months");
//
//
//        courseRepository.insert(Arrays.asList(course1,course2));
    }
}

