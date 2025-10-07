package TemperatureConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(21.11, converter.fahrenheitToCelsius(70), 0.01);
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(70, converter.celsiusToFahrenheit(21.11), 0.01);
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(26.85, converter.kelvinToCelsius(300), 0.01);
        assertEquals(0, converter.kelvinToCelsius(273.15), 0.01);
        assertEquals(-40, converter.kelvinToCelsius(233.15), 0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(300, converter.celsiusToKelvin(26.85), 0.01);
        assertEquals(273.15, converter.celsiusToKelvin(0), 0.01);
        assertEquals(233.15, converter.celsiusToKelvin(-40), 0.01);
    }

    @Test
    public void testIsExtremeTemperature() {

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