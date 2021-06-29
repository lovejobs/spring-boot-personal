package com.lovejobs.interview.sort_algorithm;

public class SelectionSortTest {

    public static void sort(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size-1; i++) {
            int min_idx = i;
            for (int j = i; j < size; j++) {
                if(arr[min_idx]>arr[j]){
                    min_idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,5,7,3,1};
        sort(arr);
        for (int i:arr) {
            System.out.print(String.valueOf(i).concat(","));
        }
    }
}
