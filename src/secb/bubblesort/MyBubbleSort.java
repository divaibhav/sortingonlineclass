/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 07-Apr-20
 *  Time: 2:08 PM
 */
package secb.bubblesort;

import java.util.Arrays;

public class MyBubbleSort {
    public void bubbleSort(int[] arr){
        //step1 , iterate the array n times to sort n elements
        for (int i = 0; i < arr.length - 1 ; i++) {
            //step 2 iterate the array n-1 times to sort any element
            boolean isSwap = true;
            System.out.println("******************************************************");
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                //step 3 compare adjacent index,if jth element is greater than j+1, swap them
                if(arr[j] > arr[j+1]){
                    //swap them
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = false;

                }
                System.out.println(Arrays.toString(arr));

            }
            System.out.println("******************************************************");
            if(isSwap){
                break;

            }
            System.out.println(Arrays.toString(arr));


        }
    }

    public static void main(String[] args) {
        int[] arr = {28,8,3,60,7,90,5};
        System.out.println("Unsorted -->" + Arrays.toString(arr));
        MyBubbleSort object = new MyBubbleSort();
        object.bubbleSort(arr);
        System.out.println("Sorted -->" + Arrays.toString(arr));
    }
}
