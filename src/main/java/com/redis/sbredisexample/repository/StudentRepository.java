
package com.redis.sbredisexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redis.sbredisexample.model.Student;

//@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>  
{  
	
} 
 