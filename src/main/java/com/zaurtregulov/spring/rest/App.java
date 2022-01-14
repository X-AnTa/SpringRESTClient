package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        //Все работники
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        //Получение одного работника
//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);

        //Обновление или добавление работника
//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1569);
//        emp.setId(14);
//        communication.saveEmployee(emp);

        //Удаление работника
        communication.deleteEmployee(14);


    }
}
