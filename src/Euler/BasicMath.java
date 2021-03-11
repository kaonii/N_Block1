package Euler;

public class BasicMath {
    public static void main(String[] args) {

        System.out.println("psvm");
        System.out.println();
        double num1 = 3;
        double num2 = 6;
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;


        System.out.println("Sum         -> " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Difference  -> " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Product     -> " + num1 + " * " + num2 + " = " + product);
        System.out.println("Quotient     -> " + num1 + " / " + num2 + " = " + quotient);

        int numb3 = 987;
        System.out.println("digitSum = " + calcDigitSum(numb3));
        
        System.out.println();
        System.out.println("/ psvm");
        System.out.println();

        System.out.println("method");

        System.out.println();
        System.out.println(addNumbers(num1, num2));
        System.out.println(substractNumbers(num1, num2));
        System.out.println(multiplyNumbers(num1, num2));
        System.out.println(divideNumbers(num1, num2));
        System.out.println();

        System.out.println("/method");

    }

    public static double addNumbers(double augend, double addend) {
        double sum;
        sum = augend + addend;
        System.out.println("Sum       -> augend + addend = ");
        System.out.print("Sum       -> " + augend + " + " + addend + " = ");
        return sum;
    }



    public static double substractNumbers(double substrahend, double minuend) {
        double difference;
        difference = substrahend - minuend;
        System.out.println("Difference -> substrahend - minuend =");
        System.out.print("Difference -> " + substrahend + " - " + minuend + " = ");
        return difference;
    }

    public static double multiplyNumbers(double multiplicand, double multiplier) {
        double product;
        product = multiplicand * multiplier;
        System.out.println("Product   -> " + "multiplicant * multiplier = ");
        System.out.print("Product   -> " + multiplicand + " * " + multiplier + " = ");
        return product;
    }

    public static double divideNumbers(double dividend, double divisor) {
        double quotient;
        quotient = dividend / divisor;
        System.out.println("Quotient   -> " + "dividend / divisor = ");
        System.out.print("Quotient   -> " + dividend + " / " + divisor + " = ");
        return quotient;
    }
    
    public static int calcDigitSum(int value) {
        int digitSum = 0;

        while (value > 0) {
            digitSum = digitSum + (value % 10);
            value = value / 10;
        }

        return digitSum;
    }


}
