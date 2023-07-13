import java.util.*;
class beautiful{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        settle(arr,n);
        System.out.println(arr[0]);
        sc.close();
    }
    public static void settle(int [] arr,int n){
        if(n==1){
            arr[0]++;
            return ;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0 && (i%n==0||n%i==0)){
                arr[i]=n;
                settle(arr, n-1);
                arr[i]=0;
            }
        }
    }
}