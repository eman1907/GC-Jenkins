import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversorTemperaturaTest {

    ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    void testeFahrenheitParaCelsius212() {
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212), 0.001);
    }

    @Test
    void testeFahrenheitParaCelsius32() {
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32), 0.001);
    }

    @Test
    void testeCelsiusParaFahrenheit100() {
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100), 0.001);
    }

    @Test
    void testeCelsiusParaFahrenheitMenos40() {
        assertEquals(-40.0, conversor.celsiusParaFahrenheit(-40), 0.001);
    }
}