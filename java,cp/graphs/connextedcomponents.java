
import java.util.*;
class connextedcomponents{
    public static void bfs(boolean v[],ArrayList<ArrayList<Integer>> l ,int i){
        v[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int r = q.poll();
            for(int j:l.get(r)){
                if(v[j]==false){
                    v[j] = true;
                    q.add(j);
                }
            }
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            l.get(a1).add(a2);
            l.get(a2).add(a1);
        }
        int c=0;
        boolean v[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(v[i]==false){
                c++;
                bfs(v,l,i);
            }
        }
        System.out.println(c);
        sc.close();
    }
}
