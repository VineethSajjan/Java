import java.util.*;
class maxsequence {
    public static void main(String[] args) {
        System.out.println(max());
    }
    public static int max(){
        int max=Integer.MIN_VALUE,v=1;
        Scanner sc = new Scanner(System.in);
        while(v!=0){
            v = sc.nextInt();
            if(v!=0){
                max = Math.max(max,v);
            }
        }
        sc.close();
        return max;
    }
}
