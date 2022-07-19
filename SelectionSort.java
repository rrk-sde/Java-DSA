package com.rajeev;

import java.util.Arrays;

public class SelectionSort {
       static void Selection(int arr[]){
           for (int i = 0; i < arr.length-1 ; i++) {
               int smallest =i;
              for(int j=i+1; j<arr.length; j++){
                  if(arr[j]<arr[smallest]){
                      smallest=j;
                  }
              }
               int temp = arr[i];
               arr[i]= arr[smallest];
               arr[smallest]=temp;
           }
        }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 12, 32, 1, 2 };
        Selection(arr);
        System.out.println(Arrays.toString(arr));
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
    }
}
