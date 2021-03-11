package Calculate;

public class ZinsDemo {
    public static void main(String[] args) {

        double bankBalance = 1000;
        double interests = 2.25;

        double bankBalance2 = 2000;
        double interests2 = 10;

        double bankBalance3 = 2000;
        double interests3 = 20;

        System.out.println(interests * bankBalance / 100);
        System.out.println(interests2 * bankBalance2 / 100);
        System.out.println(calculateInterests(1000,2.25));
        System.out.println(calculateInterests(1000,2.25));
        System.out.println(calculateBalanceWithInterests(1000,2.25));
        System.out.println(calculateBalanceWithInterests(bankBalance3,interests3));

    }

    public static double calculateInterests(final double balance, double interest) {
        return interest * balance /100;
    }

    public static double calculateBalanceWithInterests(final double balance, double interest) {
        return balance + (interest * balance /100);
    }

}
