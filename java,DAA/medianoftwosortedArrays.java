import java.util.*;
class medianoftwosortedArrays{
    public static double median(int first[],int second[]){
        int c= first.length;
        int v= second.length;
        int l=0;
        int h=c;
        while(l<=h){
            int f=(l+h)/2;
            int s=(c+v+1)/2-f;
            int max1=(f==0)?Integer.MIN_VALUE:first[f-1];
            int min1=(f==c)?Integer.MAX_VALUE:first[f];
            int max2=(s==0)?Integer.MIN_VALUE:second[s-1];
            int min2=(s==v)?Integer.MAX_VALUE:second[s];
            if(max1<=min2 && min1>=max2){
                if((c+v)%2 == 0){
                    return ((double)(Math.max(max1,max2)+Math.min(min1,min2)))/2;
                }
                else{
                    return (double)Math.max(max1,max2);
                }
            }
            else if(max1>min2){
                 h = f-1;
            }
            else{
                l=f+1;
            }
        }
        return -1; 
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        if(n<m){
            System.out.println(median(arr1,arr2));
        }
        else{
            System.out.println(median(arr2,arr1));
        }
        sc.close();
    }
}