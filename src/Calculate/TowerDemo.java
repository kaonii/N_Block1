package Calculate;

public class TowerDemo {
    public static void main(String[] args) {

        calcTower(2);

    }

    public static void calcTower(final int number) {
        int multiplier = 2;
        int result = number;
        while (multiplier <= 9) {
            System.out.println(result + " * " + multiplier + " = " + result * multiplier);
            result = result * multiplier;
            multiplier++;
        }
        int divisor = 2;
        while (divisor <= 9) {
            System.out.println(result + " / " + divisor + " = " + result / divisor);
            result = result / divisor;
            divisor++;
        }
    }
}
