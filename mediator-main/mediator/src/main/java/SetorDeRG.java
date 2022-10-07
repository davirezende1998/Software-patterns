public class SetorDeRG implements Area{
    private static SetorDeRG setorRG = new SetorDeRG();
    private SetorDeRG() {}

    public static SetorDeRG getInstancia() {
        return setorRG;
    }

    public String receberRequisicao() {
        return "Requisição para Carteira de Identidade";
    }
}