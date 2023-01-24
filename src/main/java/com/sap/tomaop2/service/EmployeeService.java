package com.sap.tomaop2.service;

import com.sap.tomaop2.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

  public Employee createEmployee(String empId, String firstName, String secondName){
    Employee emp = new Employee();
    emp.setEmpId(empId);
    emp.setFirstName(firstName);
    emp.setSecondName(secondName);
    return emp;

  }
  public void deleteEmployee(String empId){

  }

}
