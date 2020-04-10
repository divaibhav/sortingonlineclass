/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 10-Apr-20
 *  Time: 11:33 AM
 */
package secd.insertionsort;

import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        int[] arr = {25, 2, 8, 60, 3};
        System.out.println("unsorted--->" + Arrays.toString(arr));
        MyInsertionSort object = new MyInsertionSort();
        object.insertionSort(arr);
        System.out.println("sorted--->" + Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        // step 1 first element is sorted
        // step 2
        for (int i = 1; i < arr.length; i++) {
            //step 3
            int nextElement = arr[i];
            //System.out.println(nextElement);
            // compare with sorted
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    //System.out.println("exchange " + arr[j] + " with " + arr[j-1]);
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }

            }

        }
    }
}
