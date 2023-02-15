import java.util.*;
public class test4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        int t=0,count=0;
        String s2 = sc.next();
        for(int i=0;i<s1.length();i++){
            for(int j=t;j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    count++;
                    t=j+1;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
