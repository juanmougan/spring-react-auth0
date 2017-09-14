package com.github.juanmougan.springreactauth0.repository;

import com.github.juanmougan.springreactauth0.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Employee repository.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
