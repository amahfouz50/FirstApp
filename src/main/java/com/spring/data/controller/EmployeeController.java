package com.spring.data.controller;

import com.spring.data.model.Employee;
import com.spring.data.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequiredArgsConstructor
@RestController
@RequestMapping("/emp")
public class EmployeeController {
//fffdfdf
    @Autowired
    private EmployeeService employeeService ;

    private boolean chechNull(){
        if (employeeService == null)
            return false;
        return true;
    }
    @GetMapping("")
    public List<Employee> getAllEmp(){
         return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmp(@PathVariable long id){
         return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmp(@PathVariable long id){
          employeeService.deleteEmployeeById(id);
    }

    @PostMapping("")
    public Employee addEmp(@RequestBody Employee employee){

        return employeeService.saveEmployee(employee);
    }
    @PutMapping("/{id}")
    public Employee updateEmp(@RequestBody Employee employee){

        return employeeService.saveEmployee(employee);
    }

}
