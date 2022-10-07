public class UAI {
    private static UAI uai = new UAI();
    private UAI() {}

    public static UAI getInstancia() {
        return uai;
    }

    public String receberRequisicaoRG() {
        return "A UAI recebeu sua requisição e encaminhou para o setor responsável\n"+
                "Setor de RG: >> " + SetorDeRG.getInstancia().receberRequisicao();
    }

    public String receberRequisicaoCTPS() {
        return "A UAI recebeu sua requisição e encaminhou para o setor responsável\n"+
                "Setor de Direitos Trabalhistas: >> " + SetorDeDireitosTrabalhistas.getInstancia().receberRequisicao();
    }
}