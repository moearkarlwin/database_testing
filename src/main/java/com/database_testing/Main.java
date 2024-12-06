package com.database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private Connection conn;

    public void get_Connection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/world_population?" +
                    "user=root&password=");
            System.out.println("Successful Connection");
        }
        catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("SQLState: " + sqle.getSQLState());
            System.out.println("VendorError: " + sqle.getErrorCode());
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.get_Connection();

    }
}