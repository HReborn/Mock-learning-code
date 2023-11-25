package com.mock_learning_code.learningspringboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.mock_learning_code.learningspringboot.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
