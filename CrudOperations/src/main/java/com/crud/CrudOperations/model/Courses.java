package com.crud.CrudOperations.model;


import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coursesCollection")
@Setter
@Getter
public class Courses {

    @Id
    String id;

    String courseName;
    String courseLecturer;
    String coursePeriodOfTime;
    String courseStart;
}
