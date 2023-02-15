import java.util.*;
class Sequence{
    public static int arith(int n1,int n2,int n){
        if(n>2){
            n--;
            return arith(n2,n1+n2,n);
        }
        return n2;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(arith(num1,num2,k));
        sc.close();
    }
}