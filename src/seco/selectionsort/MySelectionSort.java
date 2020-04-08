/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 08-Apr-20
 *  Time: 11:34 AM
 */
package seco.selectionsort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MySelectionSort {
    public void selectionSort(int[] arr){
        int maximumElement;
        int maximumElementIndex;
        int sortedIndex = arr.length;
        //step 1 iterate over the collection or array
        for (int i = 0; i < arr.length; i++) {
            maximumElement = arr[0];
            maximumElementIndex = 0;
            //step 2
            // selecting maximum
            // find the maximum from the array
            for (int j = 0; j < sortedIndex ; j++) {
                if(arr[j] > maximumElement){
                    maximumElement = arr[j];
                    maximumElementIndex = j;
                }
            }
            //step 3
            //swap them
            int temp = arr[maximumElementIndex];
            sortedIndex --;
            arr[maximumElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;

            
        }
    }

    public static void main(String[] args) {
        int[] arr = {25,2,8,3};
        MySelectionSort object = new MySelectionSort();
        System.out.println("unsorted--->" + Arrays.toString(arr));
        object.selectionSort(arr);
        System.out.println("sorted--->" +Arrays.toString(arr));
    }
}
