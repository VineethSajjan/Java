import java.util.*;
public class palindrome{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char a[]=s.toCharArray();
        System.out.println(check(a));
        sc.close();
    }
    static int check(char[] s){
        int m=0;
        for(int i=0;i<s.length;i++){
            m+=sum(s,i,i);
            if(i<s.length-1){
                m+=sum(s,i,i+1);
            }
        }
        return m;
    }
    static int sum(char[]s,int i,int j){
        int p=0;
        while(i>=0&&j<s.length&&s[i]==s[j]){
            p++;
            i--;
            j++;
        }
        return p;
    }
}