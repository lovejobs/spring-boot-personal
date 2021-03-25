package com.lovejobs.interview.sort_algorithm;

public class BubbleSort {

    public static void sort(int[] arr){
        int tmp = 0;
        int site = arr.length-1;
        for (int i = 0; i < site; i++) {
            for (int j = 0; j < site-i; j++) {
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(arr);
    }

    public static void sortBest(int[] arr){
        int tmp = 0;
        int site = arr.length-1;
        for (int i = 0; i < site; i++) {
            boolean flag = false;
            for (int j = 0; j < site-i; j++) {
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(arr);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,5,7,2};
        sort(arr);
    }
}
