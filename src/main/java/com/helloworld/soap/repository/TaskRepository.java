package com.helloworld.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helloworld.soap.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	
	

}
