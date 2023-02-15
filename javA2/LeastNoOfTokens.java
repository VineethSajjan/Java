 /*
You are given some tokens printed with unique numbers on them and an integer T.
Your task is to find the least number of tokens that you need to make up the 
value T, by adding the numbers printed on all the tokens. 
If you cannot make the value T, by any combination of the tokens, return -1.

NOTE: Assume that you have an unlimited set of tokens of each number type.

Input Format:
-------------
Line-1: Space separated integers tokens[], number printed on tokens.
Line-2: An integer T.

Output Format:
--------------
Print an integer, minimum number of tokens to make the value T.


Sample Input-1:
---------------
1 2 5
11

Sample Output-1:
----------------
3

Explanation:
------------
5+5+1 = 11


Sample Input-2:
---------------
2 4
15

Sample Output-2:
----------------
-1
class LeastNoOfTokens {
    
}
*/
import java.util.*;
class LeastNoOfTokens{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int[] arr = new int[s.length];
        for(int i = 0;i<s.length;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        int sum = sc.nextInt();
        System.out.println(dp(arr,arr.length,sum));
        sc.close();
    }
    
    public static int dp(int[] arr,int n,int sum){
        int[][] dp = new int[n+1][sum+1];
        
        for(int i = 0;i<=sum;i++){
            dp[0][i] = Integer.MAX_VALUE-1;
        }
        
        for(int i = 1;i<=sum;i++){
            if(i%arr[0]==0){
                dp[1][i] = i/arr[0];
            }
            else{
                dp[1][i] = dp[0][i];
            }
        }
        

        
        for(int i = 2;i<=n;i++){
            for(int j = 1;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-arr[i-1]]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[n][sum];
    }
}
