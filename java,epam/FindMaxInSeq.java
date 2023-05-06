
//package com.epam.rd.autotasks.sequence;
import java.util.*;

public class FindMaxInSeq {
    public static int max() {
        Scanner sc = new Scanner(System.in);

        int max=Integer.MIN_VALUE,v=1;
        // Put your code here
        while(v!=0){
            v=sc.nextInt();
            if(v!=0){
                max = Math.max(max,v);
            }
        }
        sc.close();
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        //ArrayList<Integer> l = new ArrayList<>();



        System.out.println(max());
    }
}
