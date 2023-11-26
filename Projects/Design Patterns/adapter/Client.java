package adapter;

public class Client {
    public static void main(String[] args) {
        CelsiusTemp celsiusTemp = new CelsiusTemp(25);
        System.out.println("Temp in Celsius " + celsiusTemp.getTemperature());
        FahrenheitTemp fahrenheitTemp = new CelsiusToFahrenheitAdapter(celsiusTemp);
        System.out.println("Temp in Fahrenheit " + fahrenheitTemp.getTempInFahrenheit());
    }
}
