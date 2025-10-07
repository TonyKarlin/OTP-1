package TemperatureConverter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TemperatureConverter extends Application {
    private final double extremeMin = -40;
    private final double extremeMax = 50;
    private double fahrenheit;

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < extremeMin || celsius > extremeMax;
    }

    public double getExtremeMax() {
        return extremeMax;
    }

    public double getExtremeMin() {
        return extremeMin;
    }

    @Override
    public void start(Stage stage) {
        TextField celsiusField = new TextField();
        celsiusField.setPromptText("Enter Celsius");
        Label resultLabel = new Label();

        Button convertButton = new Button("Convert");
        convertButton.setOnAction(e -> {
            try {
                double celsius = Double.parseDouble(celsiusField.getText());
                fahrenheit = celsiusToFahrenheit(celsius);
                resultLabel.setText(String.format("Fahrenheit: %.2f", fahrenheit));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        Button saveButton = new Button("Save to DB");
        saveButton.setOnAction(e -> Database.saveTemperature(
                Double.parseDouble(celsiusField.getText()), fahrenheit, resultLabel));

        VBox root = new VBox(10, celsiusField, convertButton, resultLabel, saveButton);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Celsius to Fahrenheit");
        stage.setScene(scene);
        stage.show();
    }
}
