/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 08-Apr-20
 *  Time: 7:00 PM
 */
package bubblesort;
//In this class we will perform running time analysis of bubble sort algorithm, by creating a array of random size, with random values
// we will print total number of comparision performed and total number of swap / exchange happened
public class BubbleSortRunningTimeAnalysis {
    public void bubbeSort(int[] arr) {
        int totalComparision = 0;
        int totalExchange = 0;

        for (int i = 0; i < arr.length - 1; i++) {
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
                    arr[j + 1] = temp
                }
            }

        }
        System.out.println("for Array of size = " + arr.length);
        System.out.println("total comparision happened = " + totalComparision);
        System.out.println("total excahnge / swap happened = " + totalExchange);
    }


}
