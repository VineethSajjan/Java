import java.util.*;
public class test1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = ""+N;
        int c =0;
        int v = Integer.parseInt(s.charAt(0)+""+s.charAt(s.length()-1));
        int n = N;
        while(n>0){
            c++;
            n = n/10;
        }
        if(c >= 3){
            if( N % v == 0 ){
                System.out.println("it is a gapful number");
            }
            else{
                System.out.println("it is not a gapful number");
            }
        }
        else{
            System.out.println(" it is not a gapful number and given number is not atleast length of three");
        }
        sc.close();
    }
}
