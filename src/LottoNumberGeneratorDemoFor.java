import java.util.Random;

public class LottoNumberGeneratorDemoFor {

    public static void main(String[] args) {

        System.out.println("Our Quicktipps");

/*
        System.out.println(random.nextInt()); // gives me random number
        System.out.println(random.nextInt() % 45 +1); // gives me random number smaller than 45
*/

        System.out.println(generateOneNumber(45));

        for (int tipps = 0; tipps < 3; tipps++) {
            System.out.print("Nr. " + tipps + ": ");
            createOneTipp();
        }

    }


    public static void createOneTipp() {

        for (int i = 0; i < 6; i++) {
            System.out.print(generateOneNumber(45) + ", ");
        }
        System.out.println();
    }

    public static int generateOneNumber(int range) {
        Random random = new Random(); // initialization with new. random is a data type. Random is a class.
        int randValue = random.nextInt();
        if (randValue < 0) {
            randValue = randValue * -1;
        }
        int value = (randValue % range) + 1;
        return value;
    }

}

/* x = -46 % 45 = -1 = 0 */