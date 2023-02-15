import java.util.*;
public class test3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res =0;
        for(int i=1;i<n-1;i++){
            int left = arr[i];
            for(int j=0;j<i;j++){
                left = Math.max(left,arr[j]);
            }
            int right = arr[i];
            for(int j=i+1;j<n;j++){
                right = Math.max(right,arr[j]);
            }
            res+=Math.min(left,right) - arr[i];
        }
        System.out.println(res);
        sc.close();
    }
}

