public class Pessoa {
    public String requisitarRG() {
        return UAI.getInstancia().receberRequisicaoRG();
    }

    public String requisitarCTPS() {
        return UAI.getInstancia().receberRequisicaoCTPS();
    }
}