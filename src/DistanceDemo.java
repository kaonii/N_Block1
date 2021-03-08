public class DistanceDemo {
    public static void main(String[] args) {

        int kilometerValue = 12;
        int mileValue = 7;

        double miles1 = kilometersToMiles(kilometerValue);
        double miles2 = kilometersToMiles(17);

        System.out.println(kilometerValue + " km = " + miles1 + " miles");
        System.out.println("17 km = " + miles2 + " miles");

        double km = milesToKilometers(mileValue);
        double km2 = milesToKilometers(10);

        System.out.println(mileValue + " miles = " + km + " km");
        System.out.println("10 miles = " + km2 + " km");

    }

    public static double kilometersToMiles(int kilometer) {
        double result = kilometer / 1.609;
        return result;
    }

    public static double milesToKilometers(int miles) {
        double result = miles * 1.609;
        return result;
    }

}
