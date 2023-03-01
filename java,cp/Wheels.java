import java.util.*;
class Wheels{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a[] = new int[m];
        for(int i=0;i<m;i++){
            a[i] = sc.nextInt();
        }
        int bc = sc.nextInt();
        int rc= sc.nextInt();
        System.out.println(cost(a,bc,rc));
        sc.close();
    }
    public static int cost(int [] arr,int bc,int rc){
        int cost=0;
        int w=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=4){
                cost = cost+((4*bc)-(1*rc));
                w = w+(arr[i]-4);
            }
            else if(arr[i]<4&&w>arr[i]){
                if(w>=4){
                    cost = cost+((4*bc)-(1*rc));
                    w = w+(arr[i]-4);
                }
                else{
                    cost = cost+((w*bc)-(1*rc));
                    w=w+(w-arr[i]);
                }
            }
            else if(arr[i]<0){
                cost = cost-(1*rc);
            }
            else{
                cost = cost+((arr[i]*bc)-(1*rc));
            }
        }
        while(w!=0){
            if(w>=4){
                cost = cost+((4*bc)-(1*rc));
                w = w-4;
            }
            else{
                cost =cost+((w*bc)-(1*rc));
                w=0;
            }
        }
        return cost<0?-1:cost;
    }
}