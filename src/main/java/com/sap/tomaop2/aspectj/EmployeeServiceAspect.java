package com.sap.tomaop2.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class EmployeeServiceAspect {
  @Before(value = "execution(* com.sap.tomaop2.service.EmployeeService.*(..)) && args(empId,firstName,secondName)")
  public void beforeAdvice(JoinPoint joinPoint,String empId,String firstName, String secondName){
    System.out.print("before method "+joinPoint.getSignature());
    System.out.print("created employee ID is"+ empId+" Name is "+firstName+" last name is "+secondName  );

  }
}
