import java.util.*;
class Buckets{
    public static int bucket(int n){
        if(n==0||n==1){
            return 1;
        }
        return bucket(n-1)+bucket(n-2);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        System.out.println(bucket(k));
        sc.close();
    }
}