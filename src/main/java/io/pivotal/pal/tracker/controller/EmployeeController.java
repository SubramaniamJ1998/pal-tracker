package io.pivotal.pal.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.pivotal.pal.tracker.sevices.EmployeeService;

import java.util.Map;
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public Map<String,String> getEmployeeList()
    {
        Map<String,String> employeeList=employeeService.getEmployeeList();
        return employeeList;

    }


}
