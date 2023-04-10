//
import java.util.*;
public class snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner sc = new Scanner(System.in);

        int up= sc.nextInt();

        int down = sc.nextInt();

        int h = sc.nextInt();

        int c=0;

        if(up<=down && h>up){
            System.out.println("Impossible");
        }
        else if(h<=up){
            System.out.print(1);
        }
        else{
            while(h>0){
                h-=up;
                if(h>=0)c++;
                h+=down;
            }
            System.out.println(c);
        }
        sc.close();
    }
}

