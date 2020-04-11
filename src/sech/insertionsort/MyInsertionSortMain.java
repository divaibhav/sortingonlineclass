/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 11-Apr-20
 *  Time: 12:53 PM
 */
package sech.insertionsort;

import java.util.Arrays;

public class MyInsertionSortMain {
    public static void main(String[] args) {
        int[] arr = {25, 2, 8, 60, 3};
        System.out.println("Unsorted-->" + Arrays.toString(arr));
        MyInsertionSort object = new MyInsertionSort();
        object.insertionSort(arr);
        System.out.println("sorted-->" + Arrays.toString(arr));
    }
}
