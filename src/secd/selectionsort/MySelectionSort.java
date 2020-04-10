/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 09-Apr-20
 *  Time: 10:21 AM
 */
package secd.selectionsort;

import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        int[] arr = {35, 2, 8, 100, 5};
        System.out.println("unsorted -->" + Arrays.toString(arr));
        MySelectionSort object = new MySelectionSort();
        object.selectionSort(arr);
        System.out.println("sorted -->" + Arrays.toString(arr));
    }

    public void selectionSort(int[] arr) {
        int sortedIndex = arr.length; //arr.length - 1
        //step 1, Iterate over the array N times
        for (int i = 0; i < arr.length - 1; i++) {
            //step 2, iterate over the unsorted partition, and select an element(Maximum / Minimum)
            //maximum
            int maximumElement = arr[0];
            int maximumElementIndex = 0;
            for (int j = 1; j < sortedIndex; j++) {
                //finding maximum
                if (arr[j] > maximumElement) {
                    maximumElement = arr[j];
                    maximumElementIndex = j;
                }
            }
            System.out.println(maximumElement);
            //step 3, exchange or swap, value at sortedIndex with value at maximumElementIndex
            sortedIndex--;
            int temp = arr[sortedIndex];
            arr[sortedIndex] = arr[maximumElementIndex];
            arr[maximumElementIndex] = temp;

            /*
            sortedIndex--;
            arr[maximumElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = maximumElement;
             */

        }

    }
}
