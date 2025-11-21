package org.codify.dsa;

/**
 * In this, we are finding min number and move at start index, using the smallest index variable in every loop
 *
 * */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,6,4,3,1,2,9};
        selectionSort(arr, arr.length);
        for(int k:arr){
            System.out.print(k + " ");
        }
    }

    private static void selectionSort(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int smallest_Idx = i;
            for (int j = i; j < n; j++) {
                if( arr[j] < arr[smallest_Idx]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


