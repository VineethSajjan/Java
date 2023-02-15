import java.util.*;
class Test{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=0;
        int left=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
            while(h.size()>2){
                h.put(arr[left],h.get(arr[left])-1);
                if(h.get(arr[left])==0){
                    h.remove(arr[left]);
                }
                left++;
            }
            m = Math.max(m,i-left+1);
        }
        System.out.println(m);
        sc.close();
    }
}