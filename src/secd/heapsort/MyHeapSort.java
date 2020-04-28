/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 27-Apr-20
 *  Time: 4:49 PM
 */
package secd.heapsort;

import java.util.Arrays;

public class MyHeapSort {
    public static void main(String[] args) {
        int[] arr = {20, 2, 8, 60, 50, 90, 3};
        System.out.println("Unsorted -->" + Arrays.toString(arr));
        MyHeapSort object = new MyHeapSort();
        object.heapSort(arr);
        System.out.println("Sorted -->" + Arrays.toString(arr));
    }

    /*
    public void heapSort(int[] arr){

        //step 1
        //create a heap
        heapify(arr);
        //step 2
        //store the maximum value at last of arr

    }

    private void heapify(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            insert(arr, i);
        }
    }

    private void insert(int[] arr, int childIndex) {
        if(childIndex == 0){
            return;
        }
        else{
            int parentIndex = (childIndex - 1) / 2;
            while(parentIndex >= 0 && arr[childIndex] > arr[parentIndex]){
                swap(arr,parentIndex,childIndex);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }
    }

    private void swap(int[] arr, int parentIndex, int childIndex) {
        int temp = arr[parentIndex];
        arr[parentIndex] = arr[childIndex];
        arr[childIndex] = temp;
    }

     */
    public void heapSort(int[] arr) {
        //step 1 : create a heap i.e. maxHeap
        // in place arr -- heap
        // first element is already inserted in heap
        for (int i = 1; i < arr.length; i++) {
            int child = i;
            int parent = (child - 1) / 2;
            while (parent >= 0 && arr[parent] < arr[child]) {
                //swap parent and child
                swap(arr, child, parent);
                child = parent;
                parent = (child - 1) / 2;
            }

        }//step 1 ends : maxHeap created
        System.out.println("Heap arr -->" + Arrays.toString(arr));
        //step 2 : removing the maxElement i.e. root and placing it on to the array at the index starting from n-1
        for (int i = arr.length - 1; i >= 0; i--) {
            //apply removal on maxHeap
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
        }//step 2 ends, array is sorted
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

