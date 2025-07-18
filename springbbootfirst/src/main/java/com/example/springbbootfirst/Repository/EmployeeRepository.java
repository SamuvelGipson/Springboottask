package com.example.springbbootfirst.Repository;

import com.example.springbbootfirst.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByJob(String job);
}
