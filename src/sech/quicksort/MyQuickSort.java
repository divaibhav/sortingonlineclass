/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 17-Apr-20
 *  Time: 10:37 AM
 */
package sech.quicksort;

import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] arr = {25, 2, 8, 60, 3};
        System.out.println("Unsorted--> " + Arrays.toString(arr));
        MyQuickSort object = new MyQuickSort();
        int lower = 0;
        int upper = arr.length - 1;
        object.quickSort(arr, lower, upper);
        System.out.println("Sorted--> " + Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int lower, int upper) {
        //step 1
        if (lower >= upper) {
            return;
        }
        //step 2
        int pivotIndex = partition(arr, lower, upper);
        //step 3
        quickSort(arr, lower, pivotIndex - 1);
        //step 4
        quickSort(arr, pivotIndex + 1, upper);
    }

    private int partition(int[] arr, int lower, int upper) {
        //step 1
        int pivot = arr[lower];
        //step 2
        int down = lower;
        //step 3
        int up = upper;
        //step 4
        while (down < up) {
            //step 4(a)
            while (arr[down] <= pivot) {
                 if(down==arr.length-1){
                    break;
                 }
                down = down + 1;
            }
            //step 4(b)
            while (arr[up] > pivot) {
                up = up - 1;
            }
            //step 4(c)
            if (down < up) {
                //swap the elements referred by down and up references
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        //step 5
        arr[lower] = arr[up];
        arr[up] = pivot;
        //step 6
        return up;
    }
}
