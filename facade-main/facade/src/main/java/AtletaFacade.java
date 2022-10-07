public class AtletaFacade {
    public static boolean verificarExamesMedicos(Atleta atleta) {
        if (Cardiaco.getInstancia().verificarAtletaReprovado(atleta)) {
            return false;
        }
        if (ClinicaGeral.getInstancia().verificarAtletaReprovado(atleta)) {
            return false;
        }
        if (Fisiologico.getInstancia().verificarAtletaReprovado(atleta)) {
            return false;
        }
        if (Psicologico.getInstancia().verificarAtletaReprovado(atleta)) {
            return false;
        }
        return true;
    }
}