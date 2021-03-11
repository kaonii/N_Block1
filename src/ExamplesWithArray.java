import java.util.Arrays;

public class ExamplesWithArray {
    public static void main(String[] args) {
        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8};

        System.out.println("arr.length = " + arr.length);

        System.out.println("Smallest number: " + findSmallestNumber(arr));
        System.out.println("Smallest number: " + findSmallestNumberForeach(arr));
        System.out.println(findSmallestNumberStream(arr));
        System.out.println("Largest number: " + findLargestNumber(arr));
        System.out.println("Sum: " + calcSumWhile(arr));
        System.out.println("Sum: " + calcSumFor(arr));
        System.out.println("Sum: " + calcSumForeach(arr));
        System.out.println("Avg: " + calcAvg(arr));
        System.out.println("Duplicates " + returnDuplicates(arr));
        System.out.println(Arrays.toString(returnDuplicates(arr)));

        //Error case
//        findSmallestNumber(new int[0]);

    }

    // TODO 1: Write a method, finding and returning the smallest number

    /**
     * @return int smallest number, or throws IllegalArgumentException on empty array
     */
    public static int findSmallestNumber(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("empty array given"); //b
        }

        int ret = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ret) {
                ret = arr[i];
            }
        }

        return ret;
    }

    public static int findSmallestNumberForeach(int[] arr) {
        int ret = Integer.MAX_VALUE; //because you want to compare the numbers with the highest possible int value ~2 billions

        for (int j : arr) {
            if (j < ret) {
                ret = j;
            }
        }

        return ret;
    }

    public static int findSmallestNumberStream(int[] arr) {
        return Arrays.stream(arr)
                .min()
                .orElse(0);
    }


    // TODO 2: Write a method, finding and returning the biggest number

    public static int findLargestNumber(int[] arr) {
        int keep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > keep) {
                keep = arr[i];
            }
        }

        return keep;
    }

    // TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop

    public void a() {
        int sum1 = 0;

        while(sum1 < 100) {
            sum1  = sum1 + 1;
        }


        int sum2 = 0;
        for(; sum2 < 100;) {
            sum2 = sum2+1;
        }
    }

//    public void b() {
//        for(int i = 1; ; i++) {
//
//            //viel Code
//            if(Montag) return;
//
//
//
//        }
//
//        int j = 1;
//        while(true) {
//
//            //viel Code
//            if(Montag) return;
//
//            j++;
//        }
//
//
//    }
//
//    public void calc() {
//        long start = System.currentTimeMillis();
//        while(true) {
//            //heavy calc for ret
//
//            long now = System.currentTimeMillis();
//            if(now - start > 1_000_000_000) {
//                return;
//            }
//        }
//    }

    public static void c() {
        int i = 0;
        while(i < 10) {

            i++;
        }

        int j = 0;
        do {
             j++;
        }while(j < 10);
    }


    public static int calcSumWhile(int[] arr) {
        int sum = 0;
        int i = 0;

        while (i < arr.length) {
            sum = sum + arr[i];
            i++;
        }

        return sum;
    }

    public static int calcSumFor(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static int calcSumForeach(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum = sum + j;
        }

        return sum;
    }

    // TODO 4: Write a method, calculating and returning the average over all numbers

    public static int calcAvg(int[] arr) {
        int avg = calcSumFor(arr) / arr.length;
        return avg;
    }


    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)

    public static int[] returnDuplicates(int[] arr) {
        int counter = 0;
        for (int j = 0; j < arr.length; j++) {

            for (int i = 1 + j; i < arr.length - 1; i++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }

        }

        int[] keep = new int[counter];
        counter = 0;
        for (int j = 0; j < arr.length; j++) {

            for (int i = 1 + j; i < arr.length - 1; i++) {
                if (arr[i] == arr[j]) {
                    keep[counter] = arr[i];
                    counter++;
                }
            }

        }
        return keep;
    }

//    public static int returnDuplicates2(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]);
//
//            }
//
//        }
//        return arr[];
//    }

} //pc