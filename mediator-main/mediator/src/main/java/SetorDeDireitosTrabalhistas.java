public class SetorDeDireitosTrabalhistas implements Area{
    private static SetorDeDireitosTrabalhistas setorTrabalhista = new SetorDeDireitosTrabalhistas();
    private SetorDeDireitosTrabalhistas() {}

    public static SetorDeDireitosTrabalhistas getInstancia() {
        return setorTrabalhista;
    }

    public String receberRequisicao() {
        return "O Setor de Direitos Trabalhistas recebeu sua requisição para CTPS";
    }
}