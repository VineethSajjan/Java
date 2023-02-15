import java.util.*;
class BestFit{
    public static int maximum(int [] arr){
        int m = arr[arr.length-1];
        int max = 0;
        for(int i=arr.length-1;i>=0;i--){
            if(m<arr[i]){
                m=arr[i];
            }
            else if(m-arr[i]>max){
                max = m-arr[i];
            }
        }
        return max;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximum(arr));
        sc.close();
    }
}