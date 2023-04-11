//package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.*;

public class Hellostranger {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        if(n==0){
            System.out.println("Oh, it looks like there is no one here");
        }

        else if(n<0){
            System.out.println("Seriously? Why so negative?");
        }
        
        else{
            String arr[] = new String[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextLine();
            }
            for(int i=0;i<n;i++){
                System.out.println("Hello, "+arr[i]);
            }
        }
        sc.close();
    }
}
