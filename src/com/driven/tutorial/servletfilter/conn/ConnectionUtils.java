package com.driven.tutorial.servletfilter.conn;

import java.sql.Connection;

/**
 * Created by Jordan on 8/16/2017.
 */
public class ConnectionUtils {

    public static Connection getConnection() {

        // Create a Connection to database
        Connection conn = null;

        // .....

        return conn;
    }

    public static void closeQuietly(Connection conn) {
        try {
            conn.close();
        } catch (Exception e) {
        }
    }

    public static void rollbackQuietly(Connection conn) {
        try {
            conn.rollback();
        } catch (Exception e) {
        }
    }
}
