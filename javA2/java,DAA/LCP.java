import java.util.*;
class LCP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.nextLine().split(" ");
        System.out.print(lcp(arr));
        sc.close();
    }
    public static String lcp(String arr[]){
        if(arr==null||arr.length==0) return "";
        return lcp(arr,0,arr.length-1);

    }
    public static  String lcp(String arr[],int l,int h){
        if(l==h)
        {
            return arr[l];
        }
        else{
            int m = l+(h-l)/2;
            String lcpleft = lcp(arr,l,m);
            String lcpright = lcp(arr,m+1,h);
            return common(lcpleft,lcpright);
        }
    }
    public static String common(String l1,String l2){
        int n = Math.min(l1.length(),l2.length());
        for(int i=0;i<n;i++){
            if(l1.charAt(i)!=l2.charAt(i)){
                return l1.substring(0,i);
            }
        }
        return l1.substring(0,n);
    } 
}
