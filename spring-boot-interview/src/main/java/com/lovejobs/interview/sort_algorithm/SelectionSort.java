package com.lovejobs.interview.sort_algorithm;

public class SelectionSort {

    public static void sort(int[] arr){
        int tmp = 0;
        int min_idx = 0;
        int site = arr.length;
        for (int i = 0; i < site-1; i++) {
            min_idx = i;
            for (int j = i; j < site; j++) {
                if(arr[min_idx]>arr[j]){
                    min_idx = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
        }
        System.out.println(arr);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,5,7,3,1};
        sort(arr);
    }
}
