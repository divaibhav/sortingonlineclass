/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 07-Apr-20
 *  Time: 1:30 PM
 */
package seco.bubblesort;

import java.util.Arrays;

public class MyBubbleSort {
    public void bubbleSort(int[] arr){
        //step 1 iterate over the array n times
        for (int i = 0; i < arr.length -1  ; i++) {
            boolean isSwap = true;
            //step 2 iterate over the array n-1 times to sort any one element
            System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
            for (int j = 0; j < arr.length -1 -i ; j++) {
                //step 3 ,compare the adjacent indexs if j is greater than j+1, swap them
                if(arr[j] > arr[j+1]){
                    //swapping the elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = false;
                }
                //printitng arr after each swap

                System.out.println(Arrays.toString(arr));


            }
            if(isSwap){
                break;
            }
            System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
            System.out.println("------------------------------------------------");
            System.out.println(Arrays.toString(arr));
            System.out.println("------------------------------------------------");

        }
    }

    public static void main(String[] args) {
        int[] arr = {50,3,8,25,4,7,60,9};
        System.out.println("Unsorted --->" + Arrays.toString(arr));
        MyBubbleSort object = new MyBubbleSort();
        object.bubbleSort(arr);
        System.out.println("Sorted --->" + Arrays.toString(arr));

    }
}
