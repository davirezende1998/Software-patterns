import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ConexaoBDTest {

    @Test
    public void deveRetornarNomeDoBanco() {
        ConexaoBD.getInstance().setNomeDoBanco("MY SQL");
        assertEquals("MY SQL", ConexaoBD.getInstance().getNomeDoBanco());
    }

    @Test
    public void deveRetornarUrl() {
        ConexaoBD.getInstance().setUrl("mysql/davi");
        assertEquals("mysql/davi", ConexaoBD.getInstance().getUrl());
    }

    @Test
    public void deveRetornarNomeDoUsuario() {
        ConexaoBD.getInstance().setNomeDoUsuario("Davi");
        assertEquals("Davi", ConexaoBD.getInstance().getNomeDoUsuario());
    }

    @Test
    public void deveRetornarSenha() {
        ConexaoBD.getInstance().setSenha("abc123");
        assertEquals("abc123", ConexaoBD.getInstance().getSenha());
    }
}