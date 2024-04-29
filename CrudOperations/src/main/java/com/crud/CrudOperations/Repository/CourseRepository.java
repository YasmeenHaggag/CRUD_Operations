package com.crud.CrudOperations.Repository;

import com.crud.CrudOperations.model.Courses;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends MongoRepository<Courses, String> {

    @Query(value="{'courseName' : $0}", delete = true)
    public void deleteByName (String name);

    @Query("{courseName : ?0}")                                         // SQL Equivalent : SELECT * FROM BOOK where author = ?
    List<Courses> findByName(String city);
}
