package TemperatureConverter;

public class TemperatureConverter {
    private final double extremeMin = -40;
    private final double extremeMax = 50;


    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
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
}
