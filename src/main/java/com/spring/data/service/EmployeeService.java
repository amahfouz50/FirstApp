package com.spring.data.service;

import com.spring.data.model.Employee;
import com.spring.data.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PrePersist;
import java.util.List;


@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(long id){
        return employeeRepo.findById(id).get();
    }
    public void deleteEmployeeById(long id){
        employeeRepo.deleteById(id);

    }

    public Employee saveEmployee(Employee employee){

        return employeeRepo.save(employee);
    }




}
