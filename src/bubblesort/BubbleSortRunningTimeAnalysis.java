/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 08-Apr-20
 *  Time: 7:00 PM
 */
package bubblesort;

import java.util.Random;

//In this class we will perform running time analysis of bubble sort algorithm, by creating a array of random size, with random values
// we will print total number of comparision performed and total number of swap / exchange happened
public class BubbleSortRunningTimeAnalysis {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
        }
        BubbleSortRunningTimeAnalysis object = new BubbleSortRunningTimeAnalysis();
        // getting the system time
        long currentTime = System.currentTimeMillis();
        object.bubbeSort(array);
        long totalTime = System.currentTimeMillis() - currentTime;
        System.out.println("total time for sorting (bubble sort) array of size = " + array.length + ", is " + totalTime / 1000 + " seconds");
    }

    public void bubbeSort(int[] arr) {
        long totalComparision = 0;
        long totalExchange = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                //compare
                boolean result = arr[j] > arr[j + 1];
                totalComparision++;
                //result contains comparision result
                if (result) {
                    //swap
                    totalExchange++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println("for Array of size = " + arr.length);
        System.out.println("total comparision happened = " + totalComparision);
        System.out.println("total exchange / swap happened = " + totalExchange);
    }


}
