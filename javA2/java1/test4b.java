import java.util.*;
public class test4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n1= s1.length();
        int n2 = s2.length();
        StringBuilder sb = new StringBuilder();
        int l1=0,l2=0;
        while(l1<n1 && l2<n2){
            sb.append(s1.charAt(l1++));
            sb.append(s2.charAt(l2++));
        }
        while(l1<n1){
            sb.append(s1.charAt(l1++));
        }
        while(l2<n2){
            sb.append(s2.charAt(l2++));
        }
        System.out.println(sb);
        sc.close();
    }
}
