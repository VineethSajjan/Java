import java.util.*;
 class maxsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max =arr[0];
        int first = arr[0];
        for(int i=0;i<n;i++){
            max = Math.max(max+arr[i],arr[i]);
            if(first<max){
                first =max;
            }
        }
        System.out.println(first);
        sc.close();
    }
}
