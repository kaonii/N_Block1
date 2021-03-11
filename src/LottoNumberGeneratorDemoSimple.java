import java.util.Random;

public class LottoNumberGeneratorDemoSimple {
    public static void main(String[] args) {

        System.out.println("Our Quicktipps");

/*
        System.out.println(random.nextInt()); // gives me random number
        System.out.println(random.nextInt() % 45 +1); // gives me random number smaller than 45
*/

        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());
        System.out.println(generateOneNumber());

    }

    public static int generateOneNumber(){
        Random random = new Random(); // initialization with new. random is a data type. Random is a class.
    int value = (random.nextInt() % 45) +1;
        if (value <0) {
            value = value * -1;
        }
        return value;
    }
}
