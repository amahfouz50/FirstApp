package com.spring.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.data.repo.EmployeeRepo;
import com.spring.data.service.EmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Hr_Employees")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;
    @Column(name = "emp_name")
    private String name;
    private double Salary;


    @PrePersist
    public void vPrePersist() {
// Make sure the balance is non-negative before persisting
        System.err.println("validateCreate...PrePersist........");
        if(getSalary() < 5000.0){
            throw new RuntimeException("salary less than 5000");
        }
    }

    @PostPersist
    public void vPostPersist() {
// Make sure the balance is non-negative before persisting
        System.err.println("validateCreate......vPostPersist.....");
    }

}
