import java.util.*;
class targetsumcount{
    static Set<Integer> h = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.print(check(arr,0,t));
        sc.close();
    }
    public static boolean check(int [] arr,int i,int t){
        if(i==t) return true;
        if(i>t) return false;
        for(int j=0;j<arr.length;j++){
            if(!h.contains(arr[j]+i)){
                h.add(arr[j]+i);
                if(check(arr,arr[j]+i,t)) return true;
                h.remove(arr[j]+i);
            }
        }
        return false;
    }
}
