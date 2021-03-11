package Sort;

import java.util.Arrays;

public class SortDemoApp {
    public static void main(String[] args) {

        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3};


        arrangeOrder(arr);

        System.out.println(Arrays.toString(arr));

        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

         */
    }







    public static void arrangeOrder(int[] numbers) {

        System.out.println("length = " + numbers.length);
        boolean hasChanged = true;

        while (hasChanged == true) {

            hasChanged = false;

            // 1. Array von links nach rechts durchlaufen => for
            for (int i = 0; i < numbers.length - 1; i++) {
                // 2. arr[i] mit arr[i+1] => austauschen
                if (numbers[i] > numbers[i + 1]) {
                    hasChanged = true;
                    // swapping cards
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    // swapping cards
                }

            }
        }

    }
}
