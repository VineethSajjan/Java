import java.util.*;
public class test7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[],sum=0;
        try{
            if(n>0){
                arr = new int[n];
            }
            else{
                throw new IllegalArgumentException();
            }
            System.out.println("enter array element:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr[i]+=sum;
                sum =arr[i];
            }
            System.out.println("addition array:");
            System.out.println(Arrays.toString(arr));

        }catch(IllegalArgumentException e){
            System.out.println("Invalid argument");
        }
        sc.close();
    }
}
