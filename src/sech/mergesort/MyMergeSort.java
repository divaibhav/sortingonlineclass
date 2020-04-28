/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 25-Apr-20
 *  Time: 10:09 AM
 */
package sech.mergesort;

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
        //step 3 sort the left side by applying mergeSort
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
        int i = low; // left partition
        int j = mid + 1; // right partition
        int k = 0; // for crr
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
            // process j element
            while (j <= high) {
                crr[k] = arr[j];
                k = k + 1;
                j = j + 1;
            }
        } else {
            //process i  element
            while (i <= mid) {
                crr[k] = arr[i];
                k = k + 1;
                i = i + 1;
            }
        }
        System.out.println("crr -->" + Arrays.toString(crr));
        //step 5 copy all the elements from crr to arr on index from low to high
        int p = 0; // for crr
        for (int x = low; x <= high; x++) {
            arr[x] = crr[p];
            p = p + 1;
        }

    }

}
