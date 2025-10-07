package TemperatureConverter;

import java.sql.*;
import javafx.scene.control.Label;

public class Database {

    private static final String URL = "jdbc:mysql://localhost:3306/temperature_converter";
    private static final String USER = "admin";
    private static final String PASSWORD = "admin";

    public static void saveTemperature(double celsius, double fahrenheit, Label statusLabel) {
        String sql = "INSERT INTO temperature_log (celsius, fahrenheit) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, celsius);
            stmt.setDouble(2, fahrenheit);
            stmt.executeUpdate();
            statusLabel.setText("Saved to database!");

        } catch (SQLException e) {
            statusLabel.setText("DB Error: " + e.getMessage());
        }
    }
}