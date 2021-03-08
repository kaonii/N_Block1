public class FindFactorDemo {
    public static void main(String[] args) {

        /*
        write a method which finds out all possible numbers by which they are divisible.(=> without mod% 1 result)
        10 = 1, 2, 5, 10
        What is the aim of the method? => name => findFactors()
        What does the method need to fulfill its requirement => parameters => int number
        What does the method need to return to the caller? => return value => void with print function
        */

        // int resultOfMethod = findFactor(21);
        findFactor(21);
        findFactor(10);
        findFactor(30);

    }


    public static void findFactor(int number) {

        System.out.println("factors for " + number);
        int counter = 1;

        while (counter <= number) {
            if (number % counter == 0) {
                System.out.println(counter + ",");
            }
            counter++;
        }

    }

}
