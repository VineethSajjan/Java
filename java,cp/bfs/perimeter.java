import java.util.*;
class perimeter{
    public  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] grid= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.print(islandPerimeter(grid));
        sc.close();
    }
    public int islandPerimeter(int[][] grid) {
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int v =bfs(grid,i,j,dir);
                    c=c+v;
                }
            }
        }
        return c;
    }
    public int bfs(int [][] grid,int i,int j,int [][] dir){
        int m = grid.length;
        int n = grid[0].length;
        grid[i][j]=2;
        int c=0;
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int r[] = q.poll();
            for(int d[]:dir){
                int x = r[0]+d[0];
                int y = r[1]+d[1];
                if(x>=0&&x<m&&y>=0&&y<n&&grid[x][y]==1){
                    q.add(new int[]{x,y});
                    grid[x][y]=2;
                }
                if(x<0||x>m-1||y<0||y>n-1||grid[x][y]==0){
                    c++;
                }
            }
        }
        return c;
    }
}
