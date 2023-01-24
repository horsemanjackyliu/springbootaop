package com.sap.tomaop2.controller;
import com.sap.tomaop2.model.Employee;
import com.sap.tomaop2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

  @Autowired
  private  EmployeeService employeeService;

  @GetMapping(path = "/add/employee")
  public Employee createEmployee(@RequestParam("empId") String empId,@RequestParam("firstName") String firstName,@RequestParam("secondName") String secondName){
   return employeeService.createEmployee(empId,firstName,secondName);
  }
  @GetMapping(path = "/del/employee")
  public String deleteEmployee(@RequestParam("empId") String empId){
    employeeService.deleteEmployee(empId);
    return "The employe " + empId +" has been deleted";
  }


}
