/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 20-Apr-20
 *  Time: 2:52 PM
 */
package seco.merge;

import java.util.Arrays;

public class MyMerge2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] brr = {-1, 5, 6, 11, 23, 25, 40, 55, 95};
        System.out.println("arr -->" + Arrays.toString(arr));
        System.out.println("brr -->" + Arrays.toString(brr));
        MyMerge2 object = new MyMerge2();
        object.merge(arr, brr);
        System.out.println("Merged -->" + Arrays.toString(arr));
    }

    public void merge(int[] arr, int[] brr) {
        //step 1
        int s = arr.length + brr.length;
        int[] crr = new int[s];
        //step 2
        int i = 0;
        int j = 0;
        int k = 0;
        //step 3
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                k = k + 1;
                i = i + 1;
            } else {
                crr[k] = brr[j];
                k = k + 1;
                j = j + 1;
            }

        }
        //step 4
        if (i < arr.length) {
            while (i < arr.length) {
                crr[k] = arr[i];
                k = k + 1;
                i = i + 1;
            }
        } else {
            while (j < brr.length) {
                crr[k] = brr[j];
                k = k + 1;
                j = j + 1;
            }
        }
        //step 5
        arr = crr;

    }
}
