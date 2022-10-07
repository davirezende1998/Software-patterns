public class ClinicaGeral extends DM{
    private static ClinicaGeral clinicaGeral = new ClinicaGeral();
    private ClinicaGeral() {};

    public static ClinicaGeral getInstancia() {
        return clinicaGeral;
    }
}