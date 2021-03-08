public class GrossNet {
    public static void main(String[] args) {
        float netPrice = 120;
        int tax = 20; // Prozent
        int maxTax = 50; //€

        double calculatedTax = netPrice * 20 / 100.0;


        System.out.println("net = " + netPrice);
        System.out.println("tax = " + tax + "%");
        System.out.println("calculatedTax = " + calculatedTax);
        System.out.println("calculatedTax = " + (netPrice * tax / 100));
        System.out.println("grossPrice = net + calculatedTax = " + (netPrice + calculatedTax));


        boolean maxTaxExceeded = calculatedTax >= maxTax;
        System.out.println("maxTaxExceeded = " + maxTaxExceeded);

        if (maxTaxExceeded == true) {
            System.out.println("Maximum tax reached : " + calculatedTax + " >= " + maxTax);
        } else {
            System.out.println("Maximum tax not reached. Amount available : " + (maxTax - calculatedTax));
        }

        double grossPrice = netPrice + calculatedTax;
        System.out.println("grossPrice = " + grossPrice);

        int tax_class = 1;

        if (tax_class == 1) {
            tax = 20;
        } else if (tax_class == 2) {
            tax = 16;
        } else if (tax_class == 3) {
            tax = 8;
        } else {
            tax = 0;
            System.out.println("Tax Class unknown");
        }

        int schoolGrade = 4;
        int language = 1; //1 == Deutsch //2 == Englisch



    }
}
