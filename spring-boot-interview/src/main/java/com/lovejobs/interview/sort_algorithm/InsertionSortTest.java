package com.lovejobs.interview.sort_algorithm;

public class InsertionSortTest {

    public static void sort(int[] arr){
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0&&arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=current;
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
