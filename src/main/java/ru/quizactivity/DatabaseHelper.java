package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper {
    private final String host = "localhost";
    private final String port = "5432";
    private final String dbName = "item_db";
    private final String tableName = "item";
    private final String login = "postgres";
    private final String password = "";


    private Connection dbcon;

    private Connection getDBConnection () throws ClassNotFoundException, SQLException {
        String path = "jdbc:postgresql://" + host + ":" + port + "/" + dbName;

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Драйвер PostgreSQL загружен");
        } catch (ClassNotFoundException e) {
            System.out.println("Предупреждение: Драйвер PostgreSQL не найден. " +
                    "Убедитесь, что он добавлен в зависимости проекта.");
        }

        dbcon = DriverManager.getConnection(path, login , password);
        return dbcon;

    }

    public void isConnection() throws ClassNotFoundException, SQLException {
        dbcon = getDBConnection();
        System.out.println(dbcon.isValid(1000));

    }



    public void addItem(String name, double amount) throws SQLException, ClassNotFoundException {

        String sql = "INSERT INTO " + tableName + " (name, amount) " +
                "VALUES ('" + name + "'," + amount +");";
        try {
            Statement statement = getDBConnection().createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("ошибка в addReceiptItem "+e);
        }
    }

    public List getItem () {
        return new ArrayList<>();
    }
}