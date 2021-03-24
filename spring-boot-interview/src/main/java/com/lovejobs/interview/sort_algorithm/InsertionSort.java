package com.lovejobs.interview.sort_algorithm;

public class InsertionSort {

    public static void sort(int[] arr){
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int current = arr[i];
            int pre_index = i-1;
            while (pre_index>=0&&arr[pre_index]>current){
                arr[pre_index+1] = arr[pre_index];
                pre_index--;
            }
            arr[pre_index + 1] = current;
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,5,7,3,1};
        sort(arr);
    }
}
