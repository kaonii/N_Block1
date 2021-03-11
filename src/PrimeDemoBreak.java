public class PrimeDemoBreak {

         /*
        1. write a program and a method ("isPrime"), which checks whether a number is prime of not, and gives result to caller
        2. return all prime number between 2 and 1234
     */

    public static void main(String[] args) {


        System.out.println("isPrime(31) " + isPrime(31));
        System.out.println("isPrime(42) " + isPrime(42));
        System.out.println("isPrime(99961) " + isPrime(99961));
        System.out.println("isPrime(906847) " + isPrime(906847));
        System.out.println("isPrime(500) " + isPrime(500));


        int checkNumbers = 2;
        while (checkNumbers <= 1234){
            if (isPrime(checkNumbers)) {
                System.out.println(checkNumbers + ", ");
            }
            checkNumbers++;
        }

    }

    public static boolean isPrime(int number) {

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


}

