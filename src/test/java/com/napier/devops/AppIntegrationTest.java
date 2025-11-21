package com.napier.devops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest {

    static App app;

    @BeforeAll
    static void init() {
        app = new App();
        app.connect("localhost:33060", 30000);
    }

    // -------------------------------------------------------------
    // 1. getEmployee() tests
    // -------------------------------------------------------------
    @Test
    void testGetEmployeeValid() {
        Employee emp = app.getEmployee(255530);
        assertNotNull(emp);
        assertEquals(255530, emp.emp_no);
        assertEquals("Ronghao", emp.first_name);
        assertEquals("Garigliano", emp.last_name);
    }

    @Test
    void testGetEmployeeInvalid() {
        Employee emp = app.getEmployee(99999999);
        assertNull(emp);
    }

    // -------------------------------------------------------------
    // 2. getDepartment() tests
    // -------------------------------------------------------------
    @Test
    void testGetDepartmentValid() {
        Department dept = app.getDepartment("Sales");
        assertNotNull(dept);
        assertEquals("Sales", dept.dept_name);
        assertEquals("d007", dept.dept_no);  // Sales is always d007
    }

    @Test
    void testGetDepartmentInvalid() {
        Department dept = app.getDepartment("NotARealDepartment");
        assertNull(dept);
    }

    // -------------------------------------------------------------
    // 3. getSalariesByDepartment() tests
    // -------------------------------------------------------------
    @Test
    void testGetSalariesByDepartmentValid() {
        Department dept = app.getDepartment("Development");
        ArrayList<Employee> employees = app.getSalariesByDepartment(dept);

        assertNotNull(employees);
        assertTrue(employees.size() > 0);
    }

    @Test
    void testGetSalariesByDepartmentInvalidDept() {
        Department dept = new Department();
        dept.dept_no = "d999";  // does not exist

        ArrayList<Employee> employees = app.getSalariesByDepartment(dept);

        // Should return empty list (never null unless exception)
        assertNotNull(employees);
        assertEquals(0, employees.size());
    }

    @Test
    void testGetSalariesByDepartmentNull() {
        ArrayList<Employee> employees = app.getSalariesByDepartment(null);
        assertNull(employees);
    }

    // -------------------------------------------------------------
    // 4. getAllSalaries() test
    // -------------------------------------------------------------
    @Test
    void testGetAllSalaries() {
        ArrayList<Employee> employees = app.getAllSalaries();

        assertNotNull(employees);
        assertEquals(240124, employees.size());
    }

    @Test
    void testAddEmployee()
    {
        Employee emp = new Employee();
        emp.emp_no = 500000;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        app.addEmployee(emp);
        emp = app.getEmployee(500000);
        assertEquals(emp.emp_no, 500000);
        assertEquals(emp.first_name, "Kevin");
        assertEquals(emp.last_name, "Chalmers");
    }
}