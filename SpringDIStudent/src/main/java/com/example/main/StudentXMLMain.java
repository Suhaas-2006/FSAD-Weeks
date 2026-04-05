package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Student;

public class StudentXMLMain {

    public static void main(String[] args) {

        // Load Spring configuration file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get bean from container
        Student student = (Student) context.getBean("student");

        // Call method
        student.display();
    }
}
