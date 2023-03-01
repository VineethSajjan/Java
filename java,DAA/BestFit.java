import java.util.*;
class BestFit{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr,n));
    }
    public static int max(int [] arr,int n){
        int max=0;
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            int v = arr[i]-min;
            max= Math.max(max,v);
            min = Math.min(arr[i],min);
        }
        return max;
    }
}