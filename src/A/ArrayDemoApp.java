package A;

public class ArrayDemoApp {
    public static void main(String[] args) {

        // int a, b, c, d, e || int z1, z2, z3, z4, z5:
        /* array begins with Index 0
        works with all data types
        = new Datatype[AMOUNT]
         */

        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 99;

        for (int i = 0; i < 5; i++) {
            System.out.print(intArray[i] + ", ");
        }


    }
}
