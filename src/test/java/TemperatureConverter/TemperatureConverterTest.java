package TemperatureConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testFahrenheitToCelsius() {
        double celsius = converter.fahrenheitToCelsius(70);
        System.out.println("67 Fahrenheit in Celsius: " + celsius);
        double celsiusIsZero = converter.fahrenheitToCelsius(32);
        System.out.println("32 Fahrenheit in Celsius: " + celsiusIsZero);
        double celsiusIsNegative = converter.fahrenheitToCelsius(-40);
        System.out.println("-40 Fahrenheit in Celsius: " + celsiusIsNegative);

        assertEquals(21.11, converter.fahrenheitToCelsius(70), 0.01);
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        double fahrenheit = converter.celsiusToFahrenheit(21.11);
        System.out.println("21.11 Celsius in Fahrenheit: " + fahrenheit);
        double fahrenheitIsZero = converter.celsiusToFahrenheit(0);
        System.out.println("0 Celsius in Fahrenheit: " + fahrenheitIsZero);
        double fahrenheitIsNegative = converter.celsiusToFahrenheit(-40);
        System.out.println("-40 Celsius in Fahrenheit: " + fahrenheitIsNegative);

        assertEquals(70, converter.celsiusToFahrenheit(21.11), 0.01);
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
    }

    @Test
    public void testIsExtremeTemperature() {
        boolean isExtremeLow = converter.isExtremeTemperature(-50);
        System.out.println("-50 Celsius is extreme: " + isExtremeLow);
        boolean isNotExtreme = converter.isExtremeTemperature(20);
        System.out.println("20 Celsius is extreme: " + isNotExtreme);
        boolean isExtremeHigh = converter.isExtremeTemperature(60);
        System.out.println("60 Celsius is extreme: " + isExtremeHigh);

        assertTrue(converter.isExtremeTemperature(-50));
        assertFalse(converter.isExtremeTemperature(20));
        assertTrue(converter.isExtremeTemperature(60));
    }

    @Test
    public void testGetExtremeMax() {
        assertEquals(50, converter.getExtremeMax(), 0.01);
    }

    @Test
    public void testGetExtremeMin() {
        assertEquals(-40, converter.getExtremeMin(), 0.01);
    }

}