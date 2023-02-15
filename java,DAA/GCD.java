import java.util.*;
class GCD{
    static int gcd(int n,int v){
        if(n!=0){
            return gcd(v%n,n);
        }
        return v;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int max = Integer.parseInt(s[0]);
        int min = Integer.parseInt(s[0]);
        for(int i=1;i<s.length;i++){
            if(Integer.parseInt(s[i])>=max){
                max = Integer.parseInt(s[i]);
            }
            if(min >= Integer.parseInt(s[i])){
                min = Integer.parseInt(s[i]);
            }
        }
        System.out.println(gcd(min,max));
        sc.close();
    }
}
