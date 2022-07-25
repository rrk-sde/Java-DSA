package com.rajeev;

import java.util.Arrays;

public class InsertionSort {


    static void Insertion(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int temp = arr[i];
            while(j>-1 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }


    public static void main(String[] args) {
        int arr[] = { 4, 8, 5, 12, 32, 1, 2 };
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
