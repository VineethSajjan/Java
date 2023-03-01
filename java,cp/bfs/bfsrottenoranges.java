import java.util.*;
class bfsrottenoranges{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int grid[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.print(orangesRotting(grid));
        sc.close();
    }
    public static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int []> q = new LinkedList<>();
        int dir [][] = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int l=0;
        while(!q.isEmpty()){
            int size = q.size();
            l++;
            while(size>0){
                int r[] = q.poll();
                for(int d[] :dir){
                    int x =d[0]+r[0];
                    int y=d[1]+r[1];
                    if(x>=0&&x<m&&y>=0&&y<n&&grid[x][y]==1){
                        q.add(new int[]{x,y});
                        grid[x][y]=2;
                    }
                }
                size--;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return l==0?0:l-1;
    }
}