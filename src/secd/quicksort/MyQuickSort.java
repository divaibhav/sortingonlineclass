/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 16-Apr-20
 *  Time: 10:11 AM
 */
package secd.quicksort;

import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] arr = {25, 2, 8, 60, 3};
        MyQuickSort object = new MyQuickSort();
        System.out.println("unsorted -->" + Arrays.toString(arr));
        object.quickSort(arr, 0, arr.length - 1);
        System.out.println("sorted -->" + Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int lower, int upper) {
        //step 1
        if (lower < upper) {
            // step 2
            int pivotIndex = partition(arr, lower, upper);
            //step 3
            quickSort(arr, lower, pivotIndex - 1);
            //step 4
            quickSort(arr, pivotIndex + 1, upper);
        }
    }

    private int partition(int[] arr, int lower, int upper) {

        // step 1
        int pivot = arr[lower];
        //step 2
        int down = lower;
        //step 3
        int up = upper;
        //step 4
        while (down < up) {
            //step 4(a)
            while (arr[down] <= pivot) {
                down = down + 1;
            }
            //step 4(b)
            while (arr[up] > pivot) {
                up = up - 1;
            }
            //step 4(c)
            if (down < up) {
                //swap the elements referred by up and down references
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
