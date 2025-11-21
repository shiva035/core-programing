package org.codify.dsa;

/**
 *  In array of numbers, take 1 number at time in loop and iterate child loop for new set of numbers and arrange order
 *  inner child loop should be bound to iterate for new set of numbers
 *  To avoid index out of bound, make sure inner loop compare with ahead index
 *  but start behind -1 index from parent loop
 * */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,6,4,3,1,2,9};
        insertionSort(arr, arr.length);
        for(int k:arr){
            System.out.print(k + " ");
        }
    }

    private static void insertionSort(int[] arr, int n){
        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
