package adapter;

public class CelsiusToFahrenheitAdapter implements FahrenheitTemp{
    private CelsiusTemp celsiusTemp;
    public CelsiusToFahrenheitAdapter(CelsiusTemp c){
        this.celsiusTemp = c;
    }

    @Override
    public double getTempInFahrenheit() {
        return (celsiusTemp.getTemperature() * 9 / 5) + 32;
    }
}
