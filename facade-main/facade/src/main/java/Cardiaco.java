public class Cardiaco extends DM{
    private static Cardiaco cardiaco = new Cardiaco();
    private Cardiaco() {};

    public static Cardiaco getInstancia() {
        return cardiaco;
    }
}