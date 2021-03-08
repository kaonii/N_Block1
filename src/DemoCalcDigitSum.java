public class DemoCalcDigitSum {
    public static void main(String[] args) {

        // 54321 => 15
        // 9876543 = 42
        // 12 = 3

        System.out.println(calcDigitSum(54321));
        System.out.println(calcDigitSum(9876543));
        System.out.println(calcDigitSum(12));

    }

    public static int calcDigitSum(int value) {

        int digitsum = 0;

        while (value > 0) {
            digitsum = digitsum + (value % 10);
            value = value / 10;
        }
        return digitsum;
    }
}

