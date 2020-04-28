/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 22-Apr-20
 *  Time: 11:18 AM
 */
package seco.mergesort;

import java.util.Arrays;

public class MyMergeSort {
    public static void main(String[] args) {
        int[] arr = {20, 2, 8, 60, 50, 90, 3};
        int low = 0;
        int high = arr.length - 1;
        System.out.println("Unsorted -->" + Arrays.toString(arr));
        MyMergeSort object = new MyMergeSort();
        object.mergeSort(arr, low, high);
        System.out.println("Sorted -->" + Arrays.toString(arr));
    }

    //name =
    // roll =
    public void mergeSort(int[] arr, int low, int high) {
        //step 1
        if (low >= high) {
            return;
        }
        //step 2
        int mid = (low + high) / 2;
        //step 3
        mergeSort(arr, low, mid);
        //step 4
        mergeSort(arr, mid + 1, high);
        //step 5
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        //name =
        //roll =
        // step 1 --> 15
        int[] crr = new int[high + 1];
        //step 2 --> 56
        //index
        int i = low; // partition 1 / partition i
        int j = mid + 1; // partition 2 / partition j
        int k = 0; // crr
        //step 3
        while (i <= mid && j <= high) {
            //step 3 (a)
            if (arr[i] <= arr[j]) {
                crr[k] = arr[i];
                k = k + 1;
                i = i + 1;
            } else {
                crr[k] = arr[j];
                k = k + 1;
                j = j + 1;
            }

        }

        //step 4
        if (i > mid) {
            // process j
            while (j <= high) {
                crr[k] = arr[j];
                k = k + 1;
                j = j + 1;
            }
        } else {
            //process i
            while (i <= mid) {
                crr[k] = arr[i];
                k = k + 1;
                i = i + 1;
            }
        }
        System.out.println("crr -->" + Arrays.toString(crr));
        // step 5
        int p = 0; // index for processing crr
        for (int x = low; x <= high; x++) {
            arr[x] = crr[p];
            p = p + 1;
        }
    }
}
