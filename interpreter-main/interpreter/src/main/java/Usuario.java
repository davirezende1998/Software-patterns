public class Usuario {
    private double temp;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double converter() {
        return Sistema.converterTemperatura(this.temp);
    }
}