import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CidadaoTest {
    @Test
    void deveRequisitarRG() {
        Cidadao cidadao = new Cidadao();
        assertEquals("A UAI recebeu sua requisição e encaminhou para o setor responsável\n"+
                "Setor de RG: >> " + SetorDeRG.getInstancia().receberRequisicao(), cidadao.requisitarRG());
    }

    @Test
    void deveRequisitarCTPS() {
        Cidadao cidadao = new Cidadao();
        assertEquals("A UAI recebeu sua requisição e encaminhou para o setor responsável\n"+
                "Setor de Direitos Trabalhistas: >> " + SetorDeDireitosTrabalhistas.getInstancia().receberRequisicao(), cidadao.requisitarCTPS());
    }
}