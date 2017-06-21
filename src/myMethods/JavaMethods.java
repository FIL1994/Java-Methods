package myMethods;

import java.util.Arrays;

/**
 *
 * @author Philip
 */
public class JavaMethods {

    public static void main(String[] args) {
        int myIntArray[] = {30, 20, 5, 12, 55};
        Arrays.sort(myIntArray);
        
        Boolean exists55 = BinarySearch.exists(myIntArray, 55);
        System.out.println("55 Exists: " + exists55);
        
        Boolean exists0 = BinarySearch.exists(myIntArray, 0);
        System.out.println("0 Exists: " + exists0);
        
        int indexOf12 = BinarySearch.search(myIntArray, 12);
        System.out.println("Index of 12: "  + indexOf12);
    }
    
}
