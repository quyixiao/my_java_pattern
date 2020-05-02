package com.design.pattern.template.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import org.apache.log4j.Logger;

public class Test {
    private static Logger log = Logger.getLogger(Test.class);

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://192.168.161.129:3306/test";
    private static final String USER = "root";
    private static final String PSWD = "12345678";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER).newInstance();
            conn = DriverManager.getConnection(DB_URL, USER, PSWD);

            stmt = conn.createStatement();
            String sql = "select id,name,age,cdate from emp order by id limit 10";
            ResultSet rs = stmt.executeQuery(sql);

            int index = 0;
            while (rs.next()) {
                index++;

                String id = rs.getString("id");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String cdate = rs.getString("cdate");

                String raw = "#{0},{1},{2},{3},{4}";
                Object[] arr = { index, id, name, age, cdate };
                String outStr = MessageFormat.format(raw, arr);
                log.info(outStr);
            }
        } catch (Exception e) {
            System.out.print("DB/SQL ERROR:" + e.getMessage());
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                System.out.print("Can't close stmt/conn because of " + e.getMessage());
            }
            
        }
    }
}