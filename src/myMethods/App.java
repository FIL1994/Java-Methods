package myMethods;

import java.util.Arrays;

/**
 *
 * @author Philip
 */
public class App {

    public static void main(String[] args) {
        int myIntArray[] = {30, 20, 5, 12, 55};
        Arrays.sort(myIntArray);

        Boolean exists55 = BinarySearch.exists(myIntArray, 55);
        System.out.println("55 Exists: " + exists55);

        Boolean exists0 = BinarySearch.exists(myIntArray, 0);
        System.out.println("0 Exists: " + exists0);

        int indexOf12 = BinarySearch.search(myIntArray, 12);
        System.out.println("Index of 12: " + indexOf12);

        System.out.println("\n");
        int arrayTwo[] = {132, 4123, 5321, 4231, 90, 11, 2310};
        int indexOf11 = Search.recursiveLinearSearch(myIntArray, 0, 11);
        System.out.println("Index of 11: " + indexOf11);

        Arrays.sort(arrayTwo);
        System.out.println(
                Search.recursiveBinarySearch(arrayTwo, 0, arrayTwo.length - 1,
                        2310)
        );

        System.out.println("\n");
        int arrayThree[] = Sort.insertionSort(
                new int[]{12, 474, 32, 1232, 123, 28, 342});
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.println(arrayThree[i]);
        }
        
        System.out.println("\n");
        int[] inputArray = {12, 21, 1234, 23, 19, 2103};
        MergeSort sorter = new MergeSort();
        sorter.sort(inputArray);
        
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
        
        System.out.println("\n");
        int[] inputArray2 = {12, 2134, 342, 13, 23478};
        QuickSort.quickSort(inputArray2, 0, inputArray2.length - 1);
        System.out.println(Arrays.toString(inputArray2));
    }

}
