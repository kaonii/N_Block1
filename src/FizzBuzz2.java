public class FizzBuzz2 {

    // numbers from 1 to 100
    // if divisible by 3 -> Fizz
    // if divisible by 5 -> Buzz
    // if divisible by 3 and 5 -> FizzBuzz
    // else - > number

    //

    public static void main(String[] args) {

        String[] results = fizzBuzz100();
        printFizzBuzz(results);

    }


    public static void printFizzBuzz(final String[] stringArray) {

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }


    public static String[] fizzBuzz100() {
        String[] results = new String[100];

        for (int counter = 1; counter <= 100; counter++) {
            String phrase = fizzBuzz(counter);
            results[counter - 1] = phrase;
        }

        return results;
    }




    private static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }


} // pc
