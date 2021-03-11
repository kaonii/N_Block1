package Sort;

import java.util.Arrays;

public class ArrangeOrderDemo {
    public static int[] data = {8, 5, 1, 9, 0, 4};

    public static void main(String[] args) {

        // sort array from left to right in ascending order
        // compare each number with its neighbour
        // bubble sort
        // if element is bigger than neighbour on left, swap both
        // repeat until there's nothing left to swap


        System.out.println("order from left to right: " + Arrays.toString(sortData(data)));


    }

    public static int[] sortData(int[] arr) {
        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    //Swap
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;

                    swapped = true;
                }
            }
        } while (swapped);

        return arr;
    }
}
