package Euler;


import java.util.Arrays;

public class BasicMathArrays {
    public static void main(String[] args) {

        System.out.println("psvm");
        System.out.println();

        System.out.println("*** String arrays ***");
        String[] learningGroup = new String[]{"Stef", "Magdalena", "Caro"}; // String called learningGroup containing Stef, Magdalena & Caro

        System.out.println(learningGroup); //prints learningGroup array content in unreadable form
        System.out.println(Arrays.toString(learningGroup)); // prints learningGroup array content in "long" String form
        System.out.println("learningGroup = " + Arrays.toString(learningGroup)); // prints learningGroup array in "long" String form
        System.out.println("__________");

        System.out.println("*** Int arrays ***");

        int[] intArray1 = new int[]{1, 2, 3, 4, 5};

        System.out.println(intArray1); // prints array in unreadable characters
        System.out.println(Arrays.toString(intArray1)); // prints array in ints list

        int sumIntArray1 = 0;
        for (int i = 0; i < intArray1.length; i++) {
            sumIntArray1 = sumIntArray1 + intArray1[i];
        }

        System.out.println("Sum of all elements in intArray1: " + sumIntArray1); // prints sum of all numbers in intArray

        int avgIntArray1 = sumIntArray1 / intArray1.length;
        System.out.println("Average of intArray1 = " + avgIntArray1);

        System.out.println("__________");

        System.out.println("*** Double arrays ***");

        double[] doubleArray1 = new double[]{6.0, 7.2, 8.3, 9.4};
        System.out.println(Arrays.toString(doubleArray1));

        double sumDoubleArray1 = 0.0;
        for (int i = 0; i < doubleArray1.length; i++) {
            sumDoubleArray1 = sumDoubleArray1 + doubleArray1[i];
        }

        System.out.println("Sum of all elements in doubleArray1: " + sumDoubleArray1); // prints sum of all numbers in doubleArray

        double avgDoubleArray1 = sumDoubleArray1 / doubleArray1.length;

        System.out.println("Average of DoubleArray1 = " + avgDoubleArray1);

        System.out.println("__________");

        System.out.println("__________");

        System.out.println();
        System.out.println("/ psvm");
        System.out.println();

        System.out.println("*** methods ***");
        System.out.println();

        int[] intArray2 = new int[]{7, 8, 4, 5, 6};

        System.out.println("Sum of Array intArray2 using method calcSumOfIntArray -> " + calcSumOfIntArray(intArray2));
        System.out.println("Average of intArray 2 using method calcAvgOfIntArray -> " + calcAvgOfIntArray(intArray2));
        System.out.println("Sum & Avg of intArray2 -> " + calcSumAndAvgOfIntArray(intArray2));


        double[] doubleArray2 = new double[]{3.4, 4.4, 5.5, 6.5};
        System.out.println("Sum of Array doubleArray2 using method calcSumOfDoubleArray -> " +
                "" + calcSumOfDoubleArray(doubleArray2));
        System.out.println("Avg of doubleArray2 - > " + calcAvgOfDoubleArray(doubleArray2));
        System.out.println("/method");


    } //psvm


    public static int calcSumOfIntArray(int[] intArray) {
        int sumIntArray = 0;
        for (int i = 0; i < intArray.length; i++) {
            sumIntArray = sumIntArray + intArray[i];
        }
        return sumIntArray;
    }

    public static int calcAvgOfIntArray(int[] intArray) {
        int avgOfIntArray = 0;
        for (int i = 0; i < intArray.length; i++) {
            avgOfIntArray = calcSumOfIntArray(intArray) / intArray.length;
        }
        return avgOfIntArray;
    }

    public static int calcSumAndAvgOfIntArray(int[] intArray) {
        int sumIntArray = 0;
        int avgOfIntArray = 0;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("array length: " + intArray.length);
            avgOfIntArray = (sumIntArray = sumIntArray + intArray[i]) / intArray.length;
            System.out.print("[i]" + i + " - sum: " + sumIntArray + ", ");
        }
        System.out.println("Sum of IntArray = " + sumIntArray);
        return avgOfIntArray;

    }

    public static double calcSumOfDoubleArray(double[] doubleArray) {
        double sumDoubleArray = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            sumDoubleArray = sumDoubleArray + doubleArray[i];
        }
        return sumDoubleArray;
    }

    public static double calcAvgOfDoubleArray(double[] doubleArray) {
        double avgDoubleArray = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            avgDoubleArray = calcSumOfDoubleArray(doubleArray) / doubleArray.length;
        }
        return avgDoubleArray;
    }

} // pc
