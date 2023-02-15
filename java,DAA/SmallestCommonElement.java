import java.util.*;
class SmallestCommonElement{
    public static int common(int [][] arr,int m,int n){
        for(int i=0;i<n;i++){
            int x = arr[0][i];
            boolean flag = true;
            for(int j=1;j<m;j++){
                if(!binarysearch(arr[j],x)){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return x;
            }
        }
        return -1;
    }
    public static boolean binarysearch(int arr[],int x){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(x == arr[mid]) return true;
            else if(arr[mid]>x) h = mid-1;
            else{
                l = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println(common(a,m,n));
        sc.close();
    }
}