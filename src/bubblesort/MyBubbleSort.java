/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 07-Apr-20
 *  Time: 10:04 AM
 */
package bubblesort;

import java.util.Arrays;

public class MyBubbleSort {
    public void bubbleSort(int[] arr){
        // step 1 to iterate for each element
        for (int i = 0; i < arr.length - 1 ; i++) {
            //step sort an element by iterating the array

            for (int j = 0; j < arr.length -1 ; j++) {
                // step 3 compare j with j+1
                if(arr[j] > arr[j+1]){
                    //swap them
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
                //print
                System.out.println(Arrays.toString(arr));
            }

            //print
            System.out.println("----------------------------------");
            System.out.println(Arrays.toString(arr));
            System.out.println("----------------------------------");


        }
    }

    public static void main(String[] args) {
        int[] arr = {50,1,2,3,4};
        //printing unsorted arr
        System.out.println("Unsorted -->" + Arrays.toString(arr));
        //sorting the array
        MyBubbleSort object = new MyBubbleSort();
        object.bubbleSort(arr);

        System.out.println("Sorted -->" + Arrays.toString(arr));

    }
}
