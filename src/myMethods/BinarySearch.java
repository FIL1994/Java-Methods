package myMethods;

import java.util.Arrays;

/**
 *
 * @author Philip
 */
public class BinarySearch {
    
    public BinarySearch(){
        
    }
    
    public static int search(int[] intArray, int key){
        int low = 0;
        int high = intArray.length - 1;
        
        while(low <= high){
            int middle = (low+high)/2;
            if(key < intArray[middle])
                high = middle-1;
            else if(key > intArray[middle])
                low = middle + 1;
            else
                return middle;
        }
        return -1;
    }
    
    public static boolean exists(int[] intArray, int key){
        Arrays.sort(intArray);
        int low = 0; //beginning of list to search
        int high = intArray.length; //end of list to search
        
        while(high >= low){
            //get the middle of the list
            int middle = (int) Math.floor((low+high) / 2);
            if(intArray[middle] == key){
                return true;
            }
            //if the value in the middle is less then the key
            //increase the lowest point of the list to search
            else if(intArray[middle] < key){
                low = middle + 1;
            }
            //if the value in the middle is more then the key
            //decrease the highest point of the list to search
            else if(intArray[middle] > key){
                high = middle - 1;
            }
        }
        return false;
    }
    
    public static boolean exists(double[] intArray, double key){
        Arrays.sort(intArray);
        int low = 0; //beginning of list to search
        int high = intArray.length; //end of list to search
        
        while(high >= low){
            //get the middle of the list
            int middle = (int) Math.floor((low+high) / 2);
            if(intArray[middle] == key){
                return true;
            }
            //if the value in the middle is less then the key
            //increase the lowest point of the list to search
            else if(intArray[middle] < key){
                low = middle + 1;
            }
            //if the value in the middle is more then the key
            //decrease the highest point of the list to search
            else if(intArray[middle] > key){
                high = middle - 1;
            }
        }
        return false;
    }
}
