public class Fisiologico extends DM{
    private static Fisiologico fisiologico = new Fisiologico();
    private Fisiologico() {};

    public static Fisiologico getInstancia() {
        return fisiologico;
    }
}