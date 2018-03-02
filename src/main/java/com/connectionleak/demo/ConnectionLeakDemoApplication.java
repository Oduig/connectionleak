package com.connectionleak.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionLeakDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConnectionLeakDemoApplication.class, args);
  }
}