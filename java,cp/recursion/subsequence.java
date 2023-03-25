import java.util.*;
class subsequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        SubSequence(arr,0,al,l);
        System.out.print(al);
        sc.close();
    }
    public static void SubSequence(int [] arr,int j,List<List<Integer>> al,List<Integer> l){
        if(j>=arr.length){
            al.add(new ArrayList<>(l));
            return ;
        }
        l.add(arr[j]);
        SubSequence(arr, j+1, al, l);
        l.remove(l.size()-1);
        SubSequence(arr, j+1, al, l);
    }
}
