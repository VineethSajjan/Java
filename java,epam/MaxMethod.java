//package com.epam.rd.autotasks.max;
//import java.util.*;
public class MaxMethod {
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();
        //Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        //int arr[] = new int [n];
        //for(int i=0;i<arr.length;i++){
         //   arr[i]=sc.nextInt();
        //}
        int max=Integer.MIN_VALUE;
        for(int i:values){
            max=Math.max(max,i);
        }
        return max;
    }
}