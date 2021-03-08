public class PrimeDemo {

         /*
        1. write a program and a method ("isPrime"), which checks whether a number is prime of not, and gives result to caller
        2. return all prime number between 2 and 1234
     */

    public static void main(String[] args) {


        System.out.println("isPrime(31) " + isPrimeBreak(31));
        System.out.println("isPrime(42) " + isPrimeBreak(42));
        System.out.println("isPrime(99961) " + isPrimeReturnFalse(99961));
        System.out.println("isPrime(906847) " + isPrimeReturnFalse(906847));
        System.out.println("isPrime(500) " + isPrimeReturnFalse(500));

    }

    public static boolean isPrimeBreak(int number) {

        int checkValue = 2;
        boolean checkIsPrime = true;
        while (checkValue < number) {
            if (number % checkValue == 0) {
                // no prime because modulo returns 0
                checkIsPrime = false;
                // you can stop method here already
                break; // break; of return false;
            }
            checkValue++;
        }
        return checkIsPrime;
    }

    public static boolean isPrimeReturnFalse(int number) {

        int checkValue = 2;

        while (checkValue < number) {
            if (number % checkValue == 0) {
                // no prime because modulo returns 0

                // you can stop method here already
                return false;
            }
            checkValue++;
        }
        return false;
    }

}

