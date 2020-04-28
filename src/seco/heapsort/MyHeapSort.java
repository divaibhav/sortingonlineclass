/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Apr-20
 *  Time: 1:29 PM
 */
package seco.heapsort;

public class MyHeapSort {
    public void heapSort(int[] arr) {
        //step 1: create a maxHeap, while traversing the arr.
        // use the arr to store maxHeap i.e. in-place sorting/storing
        // considering 1st element already inserted in heap
        for (int i = 1; i < arr.length; i++) {
            int child = i;
            int parent = (child - 1) / 2;
            while (parent <= 0 && arr[parent] < arr[child]) {
                //swap
                swap(arr, child, parent);
                child = parent;
                parent = (child - 1) / 2;
            }
        }//step 1 end: maxHeap is ready
        //step 2 : remove max element from heap;
        //place that element on to index from n-1 to 0
        //max element will always on 0 index
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr, i, 0);
            int parent = 0;
            int maxChild = getMaxChild(arr, parent, i);
            while (parent < i && arr[parent] < arr[maxChild]) {
                //swap
                swap(arr, maxChild, parent);
                parent = maxChild;
                maxChild = getMaxChild(arr, parent, i);
                if (maxChild == 0) {
                    break;
                }
            }
        }// we will get our sorted array
    }

    private int getMaxChild(int[] arr, int parent, int lastSortedIndex) {
        int response = 0;
        int leftChild = (2 * parent) + 1;
        int rightChild = (2 * parent) + 2;
        if (leftChild < lastSortedIndex && rightChild < lastSortedIndex) {
            if (arr[leftChild] > arr[rightChild]) {
                response = leftChild;
            } else {
                response = rightChild;
            }
        }
        return response;
    }

    private void swap(int[] arr, int child, int parent) {
        int temp = arr[parent];
        arr[parent] = arr[child];
        arr[child] = temp;
    }
}
