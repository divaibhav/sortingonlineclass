/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 07-Apr-20
 *  Time: 2:49 PM
 */
package secb.selectionsort;

import java.util.Arrays;

public class MySelectionSort {
    public void selectionSort(int[] arr){

        int sortedIndex = arr.length;
        //step 1 iterate over the array n -1
        for (int i = 0; i < arr.length - 1 ; i++) {
            int maximumIndex = 0;
            int maximumElement = arr[0];// arr[maximumIndex];
            //step 2
            // selecting an element in this case maximum value
            for (int j = 0; j < sortedIndex ; j++) {
                if (maximumElement < arr[j]) {
                    maximumElement = arr[j];
                    maximumIndex = j;
                }
            }
            //step 3
                System.out.println(maximumElement);
                // swap them
                sortedIndex --;
                int temp = arr[sortedIndex];
                arr[sortedIndex] = arr[maximumIndex];
                arr[maximumIndex] = temp;

        }



    }

    public static void main(String[] args) {
        int[] arr = {50,20,3,2,80,9};
        System.out.println("unsorted-->" + Arrays.toString(arr));
        MySelectionSort object = new MySelectionSort();
        object.selectionSort(arr);
        System.out.println("sorted-->" + Arrays.toString(arr));
    }
}
