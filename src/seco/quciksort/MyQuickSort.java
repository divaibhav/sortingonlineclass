/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 14-Apr-20
 *  Time: 1:49 PM
 */
package seco.quciksort;

import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        System.out.println("unsorted --> " + Arrays.toString(arr));
        MyQuickSort object = new MyQuickSort();
        object.quickSort(arr, 0, arr.length - 1);
        System.out.println("sorted --> " + Arrays.toString(arr));

    }

    public void quickSort(int[] arr, int lower, int upper) {
        if (lower >= upper) {
            return;
        }
        int pivotIndex = partition(arr, lower, upper);

        quickSort(arr, lower, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, upper);
    }

    private int partition(int[] arr, int lower, int upper) {
        int pivot = arr[lower];
        int down = lower;
        int up = upper;
        while (down < up) {
            while (arr[down] <= pivot) {
                if (down >= arr.length - 1) {
                    break;
                }
                down = down + 1;
            }
            while (arr[up] > pivot) {
                up = up - 1;
            }
            if (down < up) {
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        arr[lower] = arr[up];
        arr[up] = pivot;
        return up;
    }
}
