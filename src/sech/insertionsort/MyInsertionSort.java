/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 11-Apr-20
 *  Time: 12:43 PM
 */
package sech.insertionsort;

public class MyInsertionSort {
    public void insertionSort(int[] arr) {
        //step 1 consider first element as sorted
        // we are going to sort rest of the arr
        //step2 iterate over the collection
        for (int i = 1; i < arr.length; i++) {
            //step 3
            int nextElement = arr[i];
            System.out.println(nextElement);
            //step 4
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    System.out.println("exhanging  " + arr[j] + " with " + arr[j - 1]);
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }

            }

        }
    }


}
