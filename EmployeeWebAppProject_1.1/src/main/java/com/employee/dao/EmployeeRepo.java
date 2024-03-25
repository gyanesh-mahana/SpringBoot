package com.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
