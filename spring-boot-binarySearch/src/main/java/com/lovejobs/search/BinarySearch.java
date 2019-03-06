package com.lovejobs.search;

public class BinarySearch {

    private int[] arr;

    public BinarySearch(int[] arr){
        this.arr=arr;
    }

    public int searchRecursion(int target){
        return searchRecursion(target,0,arr.length-1);
    }


    private int searchRecursion(int target,int begin,int end) {
        if(begin<=end) {
            int mid=(begin+end)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target)
                return searchRecursion(target,begin,mid-1);
            else
                return searchRecursion(target,mid+1,end);
        }
        return -1;
    }

    private int search(int target) {
        int begin =0;
        int end=arr.length-1;
        while(begin<=end) {
            int mid=(begin+end)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target) end=mid-1;
            else begin=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,6,6,8,9};
        BinarySearch binarySearch=new BinarySearch(arr);
        System.out.println(binarySearch.searchRecursion(5));
        System.out.println(binarySearch.searchRecursion(4));
        System.out.println(binarySearch.searchRecursion(6));
        System.out.println(binarySearch.search(5));
        System.out.println(binarySearch.search(7));
        System.out.println(binarySearch.search(6));
    }
}
