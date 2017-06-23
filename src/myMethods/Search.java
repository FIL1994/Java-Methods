package myMethods;

/**
 *
 * @author Philip
 */
public class Search {

    public static int recursiveLinearSearch(int[] array, int i, int key) {
        if (i > array.length - 1) {
            //was not found in array
            return -1;
        } else if (array[i] == key) {
            return i;
        } else {
            System.out.println("index at: " + i);
            return recursiveLinearSearch(array, i + 1, key);
        }
    }

    public static int recursiveBinarySearch(
            int[] array, int low, int high, int key
    ) {
        if (low > high) {
            return -1;
        } else {
            int q = (low + high) / 2;
            if (array[q] == key) {
                return q;
            } else if (array[q] > key) {
                return recursiveBinarySearch(array, low, q - 1, key);
            } else {
                return recursiveBinarySearch(array, q + 1, high, key);
            }
        }
    }
}
