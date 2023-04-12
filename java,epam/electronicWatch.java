
import java.util.Scanner;

import java.util.Scanner;

class ElectronicWatch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int s=seconds%60;
        int m = seconds/60;
        int h = m/60;
        if(h==24) h=0;
        m=m%60;
        String s1 = String.format("%02d",s);
        String m1 = String.format("%02d",m);
        //String h1 = String.format("%02d",h);
        System.out.println(h+":"+m1+":"+s1);
        scanner.close();
    }
}

