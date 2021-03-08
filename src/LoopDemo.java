public class LoopDemo {
    public static void main(String[] args) {

        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");

        // genau 10 Mal ausgeben
        int counter = 10;
        while (counter > 0) {
            counter--; // counter = counter - 1;
            System.out.println(counter + ": Der Pinguin schlug die Zeitung auf, da stand:");
        }

        /* write a while loop which counts from 1 to 100
         * it should print the number and
         * odd => "ping"
         * even => "pong"
         */

        int counter2 = 1;
        while (counter2 <= 100) {
            System.out.print(counter2);
            if (counter2 % 2 == 0) {
                System.out.println(" pong");
            } else {
                System.out.println(" ping");
            }
            counter2++;
        }

        /* write a while loop which displays all number between 1 and 5 000
         * which are divisible by 3 5 7
         *
         */

        int counter3 = 1;
        while (counter3 <= 500) {
            if (counter3 % 3 == 0) {
                System.out.println(counter3 + " divisible by 3");
            } else if (counter3 % 5 == 0) {
                System.out.println(counter3 + " divisible by 5");
            } else if (counter3 % 7 == 0) {
                System.out.println(counter3 + " divisible by 7");
            }
            counter3++;
        }

        int counter4 = 1;
        while (counter4 <= 500) {
            if (counter4 % 3 == 0 || counter4 % 5 == 0 || counter4 % 7 == 0) {
                System.out.println(counter4 + " divisible by 3, 5 or 7");
            }
            counter4++;
        }

        int counter5 = 500;
        while (counter5 < 100) {
            System.out.println("do counter < 100");
        }

        do {
            System.out.println("do counter < 100");
        } while (counter4 < 100);

        // while executes condition at beginning
        // do executes condition at the end, so we enter the loop for at least 1 round

    }

}
