import java.util.*;
public class test3b {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int rowbegin = 0;
        int rowend= n-1;
        int columnbegin=0;
        int columnend = n-1;
        int arr [][] = new int[n][n];
        while(rowbegin<=rowend && columnbegin<=columnend){
            for(int i=columnbegin;i<=columnend;i++){
                arr[rowbegin][i] = sc.nextInt();
            }
            rowbegin++;
            for(int i = rowbegin;i<=rowend;i++){
                arr[i][columnend] = sc.nextInt();
            }
            columnend--;
            for(int i=columnend;i>=columnbegin;i--){
                arr[rowend][i] = sc.nextInt();
             }
            rowend--;
            for(int i=rowend;i>=rowbegin;i--){
                arr[i][columnbegin] = sc.nextInt();
            }
            columnbegin++;
        }
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
