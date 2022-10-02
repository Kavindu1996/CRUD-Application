package com.project.sprintbootcrudoperation.repository;

import com.project.sprintbootcrudoperation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
