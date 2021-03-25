package com.lovejobs.interview.sort_algorithm;

public class QuickSort {

    public static void sort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int i = start;
        int j = end;
        int current = arr[i];

        while (i!=j){
            while (i<j&&arr[j]>=current){
                j--;
            }
            while (i<j&&arr[i]<=current){
                i++;
            }
            if(i<j){
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        arr[i] = current;
        sort(arr,start,i-1);
        sort(arr,i+1,end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,5,7,3,1};
        sort(arr,0,arr.length-1);
        System.out.println(arr);
    }
}
