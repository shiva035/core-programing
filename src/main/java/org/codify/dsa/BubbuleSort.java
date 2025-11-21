package org.codify.dsa;

/***
 * Basically move large number at last index,
 * compare next subsequence number and reduce iteration count of inner loop by 1
 * as every loop we will move highest at last index
 */

public class BubbuleSort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,6,4,3,1,2,9};
        bubbleSort(arr, arr.length);
        for (int k: arr) {
            System.out.print(k + " ");
        }
    }

    private static void bubbleSort(int[] arr, int n){
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
