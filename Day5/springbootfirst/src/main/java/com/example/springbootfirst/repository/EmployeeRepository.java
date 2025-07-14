<<<<<<< HEAD
package com.example.springbootfirst.repository;

import com.example.springbootfirst.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


    List<Employee> findByJob(String job);
    List<Employee> findByName(String name);

}
=======
package com.example.springbootfirst.repository;

import com.example.springbootfirst.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


    List<Employee> findByJob(String job);
    List<Employee> findByName(String name);

}
>>>>>>> 40feae9bd2da3f8fa53d9991dcfbddb2d36d8f89
