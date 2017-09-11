package com.github.juanmougan.springreactauth0.repository;

import com.github.juanmougan.springreactauth0.model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Employee repository.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
