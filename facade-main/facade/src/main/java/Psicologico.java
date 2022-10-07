public class Psicologico extends DM{
    private static Psicologico psicologico = new Psicologico();
    private Psicologico() {};

    public static Psicologico getInstancia() {
        return psicologico;
    }
}