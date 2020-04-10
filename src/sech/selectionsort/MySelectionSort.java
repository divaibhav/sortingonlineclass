/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 10-Apr-20
 *  Time: 10:23 AM
 */
package sech.selectionsort;

import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        int[] arr = {25, 2, 8, 60, 3};
        System.out.println("unsorted -->" + Arrays.toString(arr));
        MySelectionSort object = new MySelectionSort();
        object.selectionSort(arr);
        System.out.println("sorted-->" + Arrays.toString(arr));
    }

    public void selectionSort(int[] arr) {
        int maximumElement;
        int maximumElementIndex;

        int sortedIndex = arr.length;
        //step 1
        for (int i = 0; i < arr.length - 1; i++) {
            //step 2, select an element, selecting maximumElement
            maximumElement = arr[0];
            maximumElementIndex = 0;
            for (int j = 1; j < sortedIndex; j++) {
                if (arr[j] > maximumElement) {
                    maximumElement = arr[j];
                    maximumElementIndex = j;
                }

            }
            System.out.println(maximumElement);
            //step 3 swap them
            sortedIndex--;
            if (sortedIndex != maximumElementIndex) {
                System.out.println("exchanging " + arr[maximumElementIndex] + " with " + arr[sortedIndex]);
                int temp = arr[maximumElementIndex];
                arr[maximumElementIndex] = arr[sortedIndex];
                arr[sortedIndex] = temp;
            }

        }
    }
}
