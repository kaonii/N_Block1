package Calculate;

public class ZinsDemoForMethod {

    public static void main(String[] args) {

        double result = calcInterests(1000, 1.5, 10);
        System.out.println("result = " + result);
    }

    public static double calcInterests(double startCapital, double rates, int years) {
        for (int i = 1; i <= years; i++) {
            double calc = startCapital * (1 + rates / 100.0);

            String niceValueStartCapital = String.format("%.2f", startCapital);
            String niceValueCalc = String.format("%.2f", calc);

            System.out.println("End of " + i + " year: " + niceValueStartCapital + " -> ");
            startCapital = calc;
        }
        return startCapital;
    }

}
