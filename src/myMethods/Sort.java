package myMethods;

/**
 *
 * @author Philip
 */
public class Sort {
    public static int[] selectionSort(int a[]){
        for(int i=0; i < a.length; i++){
            int min = i;
            for(int j = i+1; j<a.length; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
    
    public static int[] insertionSort(int[] a){
        for(int i = 1; i < a.length; i++){
            int element = a[i]; //bring to sorted part
            int j = i - 1; //index of last value in sorted
            
            while(j >= 0 && a[j] > element){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }
        return a;
    }
}
