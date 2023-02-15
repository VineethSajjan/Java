import java.util.*;
public class test3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println(max-min);
        sc.close();
    }
}
