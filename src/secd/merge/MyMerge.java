/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 17-Apr-20
 *  Time: 11:48 AM
 */
package secd.merge;

import java.util.Arrays;

public class MyMerge {
    public static void main(String[] args) {
        int[] arr = {10, 100, 400, 500, 600};
        int[] brr = {50, 550, 650, 750};
        MyMerge object = new MyMerge();
        int[] crr = object.merge(arr, brr);
        System.out.println("Merged -- >" + Arrays.toString(crr));

    }

    public int[] merge(int[] arr, int[] brr) {
        //step 1
        int[] crr = new int[arr.length + brr.length];
        //step 2
        int i = 0;

        int j = 0;

        int k = 0;
        //step 3
        while (i < arr.length && j < brr.length) {
            //step 3(a)
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i = i + 1;
                k = k + 1;
            } else {
                crr[k] = brr[j];
                j = j + 1;
                k = k + 1;
            }
        }
        //step 4
        if (i < arr.length) {
            //step 4(a)
            while (i < arr.length) {
                crr[k] = arr[i];
                i = i + 1;
                k = k + 1;
            }
        }
        //step 4(b)
        else if (j < brr.length) {
            while (j < brr.length) {
                crr[k] = brr[j];
                j = j + 1;
                k = k + 1;
            }
        }
        //step 5
        return crr;
    }
}
