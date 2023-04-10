

import java.io.IOException;
import java.util.*;

public class Hellostranger {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
                arr[i] = sc.nextLine();
        }

        if(n==0){
            System.out.print("Oh, it looks like there is no one here");
        }

        else if(n<0){
            System.out.print("Seriously? Why so negative?");
        }
        
        else{
            for(int i=0;i<n;i++){
                System.out.println("Hello, "+arr[i]);
            }
        }
        sc.close();
    }
}

