import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Usuario usuario = new Usuario();

        //PRIMEIRA FORMULA: CELSIUS -> FAHRENHEIT
        usuario.setTemp(10.0);
        assertEquals(50.0, usuario.converter());

        //SEGUNDA FORMULA: FAHRENHEIT -> CELSIUS
        //usuario.setTemp(32.0);
        //assertEquals(0.0, usuario.converter());

        //TERCEIRA FORMULA: CELSIUS -> KELVIN
        //usuario.setTemp(0.0);
        //assertEquals(273.0, usuario.converter());

        //QUARTA FORMULA: KELVIN -> CELSIUS
        //usuario.setTemp(273.0);
        //assertEquals(0.0, usuario.converter());
    }
}