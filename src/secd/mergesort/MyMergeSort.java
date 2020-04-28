/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Apr-20
 *  Time: 10:06 AM
 */
package secd.mergesort;

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
        //step 1
        int s = high + 1;
        int[] crr = new int[s];
        //step 2
        int i = low; //index for left partition
        int j = mid + 1; //index for right partition
        int k = 0; //index for crr
        //step 3
        while (i <= mid && j <= high) {
            //step 3(a)
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
            //process j
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
        //step 5
        System.out.println("Crr -->" + Arrays.toString(crr));
        int p = 0; // index for crr
        for (int x = low; x <= high; x++) {
            arr[x] = crr[p];
            p = p + 1;
        }
        System.out.println("Arr -->" + Arrays.toString(arr));
    }
}
