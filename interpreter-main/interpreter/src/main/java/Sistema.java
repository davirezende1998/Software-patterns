public class Sistema {
    public static String formula = "1.8 * temp + 32"; //converte celsius para fahrenheit
    //public static String formula = "temp - 32 / 1.8";//converte fahrenheit para celsius
    //public static String formula = "temp + 273";//converte celsius para kelvin
    //public static String formula = "temp - 273";//converte kelvin para celsius

    public static double converterTemperatura(double temp) {
        String expressao;
        expressao = formula.replace("temp", Double.toString(temp));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}