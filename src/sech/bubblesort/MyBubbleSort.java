/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 07-Apr-20
 *  Time: 11:10 AM
 */
package sech.bubblesort;

import java.util.Arrays;

public class MyBubbleSort {
    public void bubbleSort(int[] arr){
        //step1 iterate over the array to sort each element
        for (int i = 0; i < arr.length - 1 ; i++) {
            boolean isSwap = true;
            //step 2 sort any one element , by iterating over the array
            System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                //step 3 compare adjacent elements
                if(arr[j] > arr[j+1]){
                    //swap them
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = false;
                }
                //print
                System.out.println(Arrays.toString(arr));



            }
            if(isSwap){
                break;
            }
            System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
            System.out.println("------------------------------------------------");
            System.out.println(Arrays.toString(arr));
            System.out.println("------------------------------------------------");


        }

    }

    public static void main(String[] args) {
        int[] arr = {50,60,22,55,88};
        System.out.println("Unsorted -->" + Arrays.toString(arr));
        MyBubbleSort object = new MyBubbleSort();
        object.bubbleSort(arr);
        System.out.println("Sorted -->" + Arrays.toString(arr));

    }
}
