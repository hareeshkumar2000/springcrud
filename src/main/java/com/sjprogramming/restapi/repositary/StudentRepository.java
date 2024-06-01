package com.sjprogramming.restapi.repositary;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjprogramming.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	

}
