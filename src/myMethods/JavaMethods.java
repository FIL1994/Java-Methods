package myMethods;

/**
 *
 * @author Philip
 */
public class JavaMethods {

    public static void main(String[] args) {
        int myIntArray[] = {30, 20, 5, 12, 55};
        
        Boolean exists55 = BinarySearch.exists(myIntArray, 55);
        System.out.println("55 Exists: " + exists55);
        
        Boolean exists0 = BinarySearch.exists(myIntArray, 0);
        System.out.println("0 Exists: " + exists0);
    }
    
}
