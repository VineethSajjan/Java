import java.util.*;
class bfsdistinctshapes{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int grid[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
        int vis[][] = new int[m][n];
        HashSet<List<List<Integer>>> h =new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1&&vis[i][j]!=1){
                    List<List<Integer>> l = new ArrayList<>();
                    bfs(grid,i,j,vis,dir,l);
                    h.add(l);
                }
            }
        }
        System.out.print(h.size());
        sc.close();
    }
    public static void bfs(int [][] grid,int i,int j,int vis[][],int dir[][],List<List<Integer>> l){
        vis[i][j] = 1;
        Queue<int []> q= new LinkedList<>();
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int r[] = q.poll();
            for(int d[]:dir){
                int x = d[0]+r[0];
                int y = d[1]+r[1];
                if(x>=0&&x<grid.length&&y>=0&&y<grid[0].length&&vis[x][y]!=1&&grid[x][y]==1){
                    q.add(new int[]{x,y});
                    vis[x][y] = 1;
                    l.add(Arrays.asList(x-i,y-j));
                }
            }
        }
    }
}