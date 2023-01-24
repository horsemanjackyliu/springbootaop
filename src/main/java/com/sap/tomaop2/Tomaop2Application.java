package com.sap.tomaop2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Tomaop2Application {

  public static void main(String[] args) {
    SpringApplication.run(Tomaop2Application.class, args);
  }

}
