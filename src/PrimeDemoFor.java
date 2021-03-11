public class PrimeDemoFor {

         /*
        1. write a program and a method ("isPrime"), which checks whether a number is prime of not, and gives result to caller
        2. return all prime number between 2 and 1234
     */

    public static void main(String[] args) {


        System.out.println("start");
        System.out.println("isPrim(1991999992) = " + isPrime(1991999992));
        System.out.println("isPrim(1991999993) = " + isPrime(1991999993));


        int checkNumbers = 2;
        while (checkNumbers <= 1234) {
            if (isPrime(checkNumbers)) {
                System.out.print(checkNumbers + ", ");
            }
            checkNumbers++;
        }

        int counter = 1;                // Initialisierung, Startwert festlegen
        while (counter < 1000) {        // Abbruchbedingung
            // some code begin
            // interessiert uns wirklich
            // some code nd
            counter++;                  // Increment (Erhöhung)
        }


    }


    public static boolean isPrime(int number) {
        for (int checkValue = 2; checkValue < number / 2; checkValue++)

            if (number % checkValue == 0) {
                return false;
            }
        return true;
    }

}

