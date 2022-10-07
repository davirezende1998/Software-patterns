import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class houseBuilderTest {
    @Test
    void deveRetornarExcecaoParaProprietarioSemNome() {
        try {
            houseBuilder houseBuilder = new houseBuilder();
            house house = houseBuilder
                    .setNomeDoProprietario("")
                    .setCpfProprietario("1111111")
                    .setTelefoneProprietario("1234565")
                    .setCodigo(1)
                    .setPreco(20)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProprietarioSemCPF() {
        try {
            houseBuilder houseBuilder = new houseBuilder();
            house house = houseBuilder
                    .setNomeDoProprietario("Davi Rezende")
                    .setCpfProprietario("")
                    .setTelefoneProprietario("1234565")
                    .setCodigo(1)
                    .setPreco(20)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProprietarioSemTelefone() {
        try {
            houseBuilder houseBuilder = new houseBuilder();
            house house = houseBuilder
                    .setNomeDoProprietario("Davi Rezende")
                    .setCpfProprietario("111111")
                    .setTelefoneProprietario("")
                    .setCodigo(1)
                    .setPreco(20)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Telefone inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCodigoInvalido() {
        try {
            houseBuilder houseBuilder = new houseBuilder();
            house house = houseBuilder
                    .setNomeDoProprietario("Davi Rezende")
                    .setCpfProprietario("111111")
                    .setTelefoneProprietario("123456")
                    .setCodigo(-1)
                    .setPreco(20)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPrecoInvalido() {
        try {
            houseBuilder houseBuilder = new houseBuilder();
            house house = houseBuilder
                    .setNomeDoProprietario("Davi Rezende")
                    .setCpfProprietario("111111")
                    .setTelefoneProprietario("123456")
                    .setCodigo(1)
                    .setPreco(0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCriacaoValidaDeImovel() {
            houseBuilder houseBuilder = new houseBuilder();
            house house = houseBuilder
                    .setNomeDoProprietario("Davi Rezende")
                    .setCpfProprietario("111111")
                    .setTelefoneProprietario("123456")
                    .setCodigo(1)
                    .setPreco(10)
                    .build();
        assertNotNull(house);
    }
}