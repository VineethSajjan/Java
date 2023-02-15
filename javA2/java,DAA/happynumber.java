import java.util.*;
class happynumber{
    static int digit(int z){
        int res=0;
        while(z!=0){
            res = res+(int) Math.pow(z%10,2);
            z = z/10;
        }
        return res;
    }
    static boolean happy(int v,HashSet<Integer> s){
        if(!s.add(v)){
            return false;
        }
        if(v == 1){
            return true;
        }
        return happy(digit(v),s);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> h = new HashSet<>();
        System.out.println(happy(n,h));
        sc.close();
    }
}
