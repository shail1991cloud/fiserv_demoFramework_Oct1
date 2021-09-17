package com.helperUtilities;

import java.sql.*;

public class Database_Connections {

    /**
     * used to create JDBC connection using JDBC URL, username and password
     */
    public static Connection createJDBCConnection(String JDBCURL, String username, String password) {
        Connection c = null;
        String driver = "";

        if (JDBCURL.contains("mariadb") || JDBCURL.contains("mysql"))
            driver = "org.mariadb.jdbc.Driver";
        else if (JDBCURL.contains("postgresql"))
            driver = "org.postgresql.Driver";

        try {
            Class.forName(driver);
            c = DriverManager.getConnection(JDBCURL, username, password);
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return c;
        }
    }

    /**
     * used to execute SQL with given connection instance
     */
    public static ResultSet executeSQL(String sql, Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery(sql);

        int count = 1;

        if (res.next() == false) {
            return null;
        } else {
            return res;
        }

    }

}
