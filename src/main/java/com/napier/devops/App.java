package com.napier.devops;

import java.sql.*;

public class App {
    // Connection to MySQL database
    private Connection con = null;

    // Connect to the MySQL database
    public void connect() {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                Thread.sleep(5000);

                // Determine host: use DB_HOST environment variable if available
                String host = System.getenv("DB_HOST");
                if (host == null) host = "127.0.0.1"; // default to localhost

                con = DriverManager.getConnection(
                        "jdbc:mysql://" + host + ":33060/employees?allowPublicKeyRetrieval=true&useSSL=false",
                        "root",
                        "example"
                );

                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect attempt " + i + ": " + sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    // Disconnect from the MySQL database
    public void disconnect() {
        if (con != null) {
            try {
                con.close();
                System.out.println("Disconnected from database");
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }

    public Employee getEmployee(int ID) {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();

            // Create SQL query
            String strSelect =
                    "SELECT emp_no, first_name, last_name "
                            + "FROM employees "
                            + "WHERE emp_no = " + ID;

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);

            // If a result was found
            if (rset.next()) {
                Employee emp = new Employee();
                emp.emp_no = rset.getInt("emp_no");
                emp.first_name = rset.getString("first_name");
                emp.last_name = rset.getString("last_name");
                return emp;
            } else
                return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }


    public static void main(String[] args) {
        App a = new App();

        // Connect to the database
        a.connect();

        // Get an employee by ID
        Employee emp = a.getEmployee(10001); // you can change ID if needed

        // Display basic info for now
        if (emp != null) {
            System.out.println("Employee Found:");
            System.out.println(emp.emp_no + " - " + emp.first_name + " " + emp.last_name);
        } else {
            System.out.println("No employee found.");
        }

        // Disconnect
        a.disconnect();
    }
}