/*import java.util.*;
public class uniquepaths
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int [m][n];
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		System.out.println(count(arr,0,0));
        sc.close();
	}
	public static int count(int [][] arr,int i,int j){
	    int m=arr[0].length;
	    int n=arr.length;
	    if(i == m-1 && j == n-1){
	        return 1;
	    }
	    if(i>m-1 || j>n-1 || arr[i][j] == 1){
	        return 0;
	    }
	    int down = count(arr,i+1,j);
	    int right =count(arr,i,j+1);
	    return down+right;
	}
}
                RECURSION*/
                
                
                
                
import java.util.*;
public class uniquepaths
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int dp[][] = new int[m][n];
        System.out.println(count(arr,0,0,dp));
        sc.close();
    }
    public static int count(int [][] arr,int i,int j,int dp[][]){
        int n=arr[0].length;
        int m=arr.length;
        if(i == m-1 && j == n-1){
            return 1;
        }
        if(i>m-1 || j>n-1 || arr[i][j] == 1){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int down = count(arr,i+1,j,dp);
        int right =count(arr,i,j+1,dp);
        return dp[i][j] = down+right;
    }
}






