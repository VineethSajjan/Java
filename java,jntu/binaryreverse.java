import java.util.*;
class binaryreverse{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res =0;
        int i=0;
        while(i<32){
            res = res+(n&1);
            System.out.println("res: "+res);
            n = n>>1;
            System.out.println("n: "+n);
            if(i<31){
                res = res<<1;
            }
            i++;
        }
        System.out.println(res);
    }
}