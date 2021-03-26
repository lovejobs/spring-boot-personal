package com.lovejobs.interview.sort_algorithm;

public class MergeSort {

    public static void sort(int[] arr, int start, int end){
        if(start<end){
            int mid = (end+start)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int[] tmp = new int[end-start+1];
        int index = 0;
        while (i<=mid&&j<=end){
            if(arr[i]<arr[j]){
                tmp[index++] = arr[i++];
            }else {
                tmp[index++] = arr[j++];
            }
        }
        while (i<=mid){
            tmp[index++] = arr[i++];
        }
        while (j<=end){
            tmp[index++] = arr[j++];
        }
        for (int k = 0; k < index; k++) {
            arr[start++] = tmp[k];
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,5,7,3,1};
        sort(arr,0,arr.length-1);
        System.out.println();
    }
}
