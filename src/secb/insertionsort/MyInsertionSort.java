/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 08-Apr-20
 *  Time: 4:48 PM
 */
package secb.insertionsort;

import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        int[] arr = {25, 6, 8, 30, 2};
        MyInsertionSort object = new MyInsertionSort();
        System.out.println("Unsorted-->" + Arrays.toString(arr));
        object.insertionSort(arr);
        System.out.println("sorted -->" + Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        int nextElement;
        for (int i = 1; i < arr.length; i++) {
            nextElement = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > nextElement; j--) {

                  /*  int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                   //System.out.println("exchanging" + arr[j] + " , " + arr[j-1]);


                   */
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = nextElement;

            //System.out.println(j);


        }

    }
}
