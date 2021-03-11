public class FizzBuzz {

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


    public static void printFizzBuzz(final String[] blub) {
        for (String s : blub) {
            System.out.println(s);
        }
    }


    public static String[] fizzBuzz100() {
        String[] results = new String[100];
        int counter = 1;

        while (counter <= 100) {
            String phrase = fizzBuzz(counter);
            results[counter - 1] = phrase;
            counter++;
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
