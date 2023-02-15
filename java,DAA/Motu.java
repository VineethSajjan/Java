import java.util.*;
public class Motu {
    public static int patlu(int [] A,int h){
        int y= Arrays.stream(A).max().getAsInt();
        int l=1;
        while(l<y){
            int mid = (l+y)/2;
            int total=0;
            for( int a:A){
                total= total+(a+mid-1)/mid;
            }
            if(total>h){
                l=mid+1;
            }
            else{
                y=mid;
            }
        }
         return l;   
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int H = sc.nextInt();
        System.out.println(patlu(arr,H));
        sc.close();
    }
}
