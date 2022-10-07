import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AtletaTest {
    @Test
    void deveRetornarReprovadoCardiaco() {
        Atleta atleta = new Atleta();
        Cardiaco.getInstancia().addAtletaReprovado(atleta);
        assertEquals(false, atleta.contratar());
    }

    @Test
    void deveRetornarReprovadoPsicologico() {
        Atleta atleta = new Atleta();
        Psicologico.getInstancia().addAtletaReprovado(atleta);
        assertEquals(false, atleta.contratar());
    }

    @Test
    void deveRetornarReprovadoFisiologico() {
        Atleta atleta = new Atleta();
        Fisiologico.getInstancia().addAtletaReprovado(atleta);
        assertEquals(false, atleta.contratar());
    }

    @Test
    void deveRetornarReprovadoClinicaGeral() {
        Atleta atleta = new Atleta();
        ClinicaGeral.getInstancia().addAtletaReprovado(atleta);
        assertEquals(false, atleta.contratar());
    }

    @Test
    void deveRetornarAtletaContratado() {
        Atleta atleta = new Atleta();
        assertEquals(true, atleta.contratar());
    }
}