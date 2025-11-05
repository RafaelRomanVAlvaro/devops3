package com.napier.devops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    // Testing employee is null
    @Test
    void printSalariesTestNull()
    {
        app.printSalaries(null);
    }

    // Testing employees is empty
    @Test
    void PrintSalariesTestEmpty()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        app.printSalaries(employees);
    }

    // Testing employee contains null

    @Test
    void printSalariesTestContainsNull()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(null);
        app.printSalaries(employees);
    }

    // Testing employee contains all non-null values
    @Test
    void printSalaries()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }

    // Testing employee is null
    @Test
    void displayEmployeeIsNull()
    {
        app.displayEmployee(null);
    }

    // Testing valid employee
    @Test
    void displayValidEmployee()
    {
        Employee emp = new Employee();
        emp.emp_no = 10001;
        emp.first_name = "John";
        emp.last_name = "Doe";
        emp.title = "Engineer";
        emp.salary = 50000;
        emp.dept_name = "Development";

        app.displayEmployee(emp);
    }

    // Testing containing null element
    @Test
    void displayContainingNullElement()
    {
        Employee emp = new Employee();
        emp.emp_no = 10001;
        emp.first_name = null;
        emp.last_name = "Doe";
        emp.title = "Engineer";
        emp.salary = -50000;
        emp.dept_name = "Development";

        app.displayEmployee(emp);
    }


}