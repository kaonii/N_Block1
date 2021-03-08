import java.text.DecimalFormat;

public class TemperatureDemo {

    static private DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {

        final double temperatureCelsiusCampus = 11.8;
        final double fahrenheitCampus = celsiusToFahrenheit(temperatureCelsiusCampus);

        System.out.println("°C on Campus = " + temperatureCelsiusCampus + " °C");
        System.out.println(temperatureCelsiusCampus + "°C = " + fahrenheitCampus + " °F");

        final double temperatureFahrenheitCampus = 53;
        final double celsiusCampus = fahrenheitToCelsius(temperatureFahrenheitCampus);

        System.out.println("°F Campus = " + df.format( temperatureFahrenheitCampus) + " °F");
        System.out.println(temperatureFahrenheitCampus + " °F = " + df.format(celsiusCampus) + " °C");

    }

    public static double celsiusToFahrenheit (final double celsius) {
        return (celsius * 9/5.0) + 32;

    }

    public static double fahrenheitToCelsius (final double fahrenheit) {
        double result = (fahrenheit -32) * 5/9;
        return result;
    }


}
