/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myMethods;

/**
 *
 * @author Philip
 */
public class QuickSort {
    public static void quickSort(int[] inputArray, int start, int end){
        if(start < end){
            //index of pivot position
            int partitionPoint = partition(inputArray, start, end);
            quickSort(inputArray, start, partitionPoint - 1); //sorts left half
            quickSort(inputArray, partitionPoint + 1, end); //sorts right half
        }
    }
    
    public static int partition(int[] inputArray, int start, int end){
        int pivot = inputArray[end];
        //i starts from -1
        int i = start - 1;
        for (int j = 0; j < end - 1; j++) {
            if(inputArray[j] <= pivot){
                i++;
                int iVal = inputArray[i];
                int jVal = inputArray[j];
                inputArray[i] = jVal;
                inputArray[j] = iVal;
            }
        }
        
        //put the pivot value in the correct slot
        int iVal = inputArray[i + 1];
        inputArray[end] = iVal;
        inputArray[i + 1] = pivot;
        return i + 1;
    }
}
