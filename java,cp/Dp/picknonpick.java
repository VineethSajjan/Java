import java.util.*;
public class picknonpick{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(check(0,a,-1,b));
        sc.close();
    }
    static int check(int j,int a[],int l,int b[]){
        if(j==a.length){
            return 0;
        }
        int nt=check(j+1,b,l,a);
        int t=0;
        for(int i=0;i<b.length;i++){
            if(a[j]==b[i] && i>l){
                t=1+check(j+1,b,i,a);
                break;
            }
        }
        return Math.max(nt,t);
    }
}