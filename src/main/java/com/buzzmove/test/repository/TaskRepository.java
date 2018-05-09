package com.buzzmove.test.repository;

import com.buzzmove.test.data.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface task repository.
 * 
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}