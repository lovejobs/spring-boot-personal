package com.lovejobs.interview.sort_algorithm;

public class BubbleSortTest {

    private static int[] sort(int[] array){
        if(array.length==0){
            return new int[]{};
        }
        int size = array.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1-i; j++) {
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = sort(new int[]{4,2,6,2,8,11,1});
        for (int i:array) {
            System.out.print(String.valueOf(i).concat(","));
        }
    }
}
