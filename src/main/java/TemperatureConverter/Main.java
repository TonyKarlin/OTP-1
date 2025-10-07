package TemperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temp = sc.nextDouble();

        System.out.println("Converted to Fahrenheit: " + converter.celsiusToFahrenheit(temp));
        System.out.println("Converted to Kelvin: " + converter.celsiusToKelvin(temp));
        System.out.println("Is your temperature an extreme temperature: \n" +
                (converter.isExtremeTemperature(temp) ? "Yes" : "No"));
    }
}
