package com.napier.devops;

import java.sql.*;

public class App
{
    // Connection to MySQL database
    private Connection con = null;

    // Connect to the MySQL database
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
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
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect attempt " + i + ": " + sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    // Disconnect from the MySQL database
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                con.close();
                System.out.println("Disconnected from database");
            }
            catch (SQLException e)
            {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args)
    {
        // Create new application
        App app = new App();

        // Connect to database
        app.connect();

        // Disconnect from database
        app.disconnect();
    }
}