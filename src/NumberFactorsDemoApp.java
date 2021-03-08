public class NumberFactorsDemoApp {

    public static void main(String[] args) {

        int resultofMethod = findDivisors(501);

        System.out.println("\nresultofMethod = " + resultofMethod);
        System.out.println("Anzahl Teiler: " + findDivisors(42));
        System.out.println("Anzahl Teiler: " + findDivisors(74));
        System.out.println("Anzahl Teiler: " + findDivisors(123456));
        System.out.println("Anzahl Teiler: " + findDivisors(31));
    }



    // Methode soll alle möglichen Teiler zu einer Zahl ausgeben, und die Anzahl der Teiler retournieren

        public static int findDivisors(int number) {

            int counter = 1;
            int countPossibleDivisors = 0;
            while (counter <= number){
                if (number % counter == 0){
                    System.out.println(counter + ", ");
                    countPossibleDivisors++;
                }
                counter++;
            }
            return countPossibleDivisors;
        }

}
