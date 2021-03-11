import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ExamplesWithArray2 {
    public static void main(String[] args) {

        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8, 1, 1
        };

//      System.out.println("Duplicates :" + Arrays.toString(returnDuplicatedNumbers(arr)));
        System.out.println("Base :                          " + Arrays.toString(Arrays.stream(arr).sorted().toArray()));
        System.out.println("Duplicates :                    " + Arrays.toString(returnDuplicatedNumbers(arr)));
//      System.out.println("returnDuplicatedNumbersStream = " + Arrays.toString(returnDuplicatedNumbersStream(arr)));
    }


    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)

    public static int[] returnDuplicatedNumbers(int[] arr) {
        final int[] ret = new int[arr.length];
        int retIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int vi = arr[i];

            for (int j = 0; j < arr.length; j++) {
                int vj = arr[j];

                System.out.println("iteration: i=" + i + ", j=" + j);

                if (vi == vj && i != j) { // i != j so that i and j don't compare themselves when they have the same index. i < j so that duplicates don't come twice
                    if (!contains(ret, vi) && !contains(ret, vj)) {
                        System.out.println("found duplicate: i=" + i + ", j=" + j + ", vi=" + vi + " (vj=" + vj + "), retIndex = " + retIndex);
                        System.out.println(" -> writing into ret[" + retIndex + "]");

                        ret[retIndex] = vi;//write found duplicate into next free slot in ret
                        retIndex++;//increment retIndex
                    } else {
                        System.out.println("found duplicate, but already in ret");
                    }
                }
            }
        }

        final int[] retTrimmed = new int[retIndex];

        for (int i = 0; i < retTrimmed.length; i++) {
            retTrimmed[i] = ret[i];
        }

        return retTrimmed;
    }

    // checks if an array contains a certain number
    public static boolean contains(int[] array, int number) {
        for (int x = 0; x < array.length; x++) {
            int currentValue = array[x];
            if (currentValue == number) {
                return true;
            }
        }

        return false;
    }

} //pc