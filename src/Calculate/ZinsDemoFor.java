package Calculate;

import java.text.DecimalFormat;

public class ZinsDemoFor {

    static private DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {

        double startCapital = 1000;
        double interests = 1.5;


        for (int year = 1; year <= 10; year++) {
            startCapital = startCapital + (startCapital * interests / 100);
            System.out.println("End of year " + year + " = € " + df.format (startCapital));
        }



    }


}
