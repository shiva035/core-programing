package org.codify.dsa;
/**
 * In Merge Sort, we have to perform partions and then merge with sorting.
 * */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,6,4,3,1,2,9};
        partition(arr, 0, arr.length-1);
        for(int k : arr){
            System.out.print(k + " ");
        }
    }

    private static void partition(int[] arr, int start, int end) {
        if(start < end){
            int mid = start + (end-start)/2;
            partition(arr, start, mid);
            partition(arr, mid+1, end);
            mergeArray(arr, start, mid, end);
        }

    }

    private static void mergeArray(int[] arr, int start, int mid, int end) {
        int[] merge = new int[(end-start)  + 1];  //s:4 e:5 => e-s = 1
        int idx = 0;
        int startIdx1 = start;
        int startIdx2 = mid+1;

        while (startIdx1 <= mid && startIdx2 <= end){
                if(arr[startIdx1] < arr[startIdx2]){
                    merge[idx++] = arr[startIdx1++];
                }else {
                    merge[idx++] = arr[startIdx2++];
                }
        }

        while (startIdx1 <= mid){
            merge[idx++] = arr[startIdx1++];
        }

        while (startIdx2 <= end){
            merge[idx++] = arr[startIdx2++];
        }

        for (int i = 0, j=start; i < merge.length; i++,j++) {
            arr[j] = merge[i];
        }
    }

}
