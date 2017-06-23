package myMethods;

public class MergeSort {

    public static void sort(int inputArray[]) {
        sort(inputArray, 0, inputArray.length - 1);
    }

    public static void sort(int inputArray[], int start, int end) {
        if (end <= start) {
            return; //done looking through array
        }

        int mid = (start + end) / 2; //get middle position of array
        sort(inputArray, start, mid); //sort left side
        sort(inputArray, mid + 1, end); //sort right side
        merge(inputArray, start, mid, end); //merge sorted results
    }

    public static void merge(int inputArray[], int start, int mid, int end) {
        int tempArray[] = new int[end - start + 1];

        //index counter for left side
        int leftSlot = start;
        //index counter for right side
        int rightSlot = mid + 1;

        int k = 0;
        while (leftSlot <= mid && rightSlot <= end) {
            if (inputArray[leftSlot] < inputArray[rightSlot]) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
            } else {
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
            }
            k++;
        }
        //right and left side of sub-array are sorted
        if (leftSlot <= mid) {
            //consider right side done
            while (leftSlot <= mid) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
                k++;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
                k++;
            }
        }

        //copy temp into slots of inputArray
        for (int i = 0; i < tempArray.length; i++) {
            inputArray[start + i] = tempArray[i];
        }
    }
}
