import java.util.*;
class endgame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(canreach(arr,n));
        sc.close();
    }
    public static boolean canreach(int [][] arr,int n){
        
        return true;
    }
}
