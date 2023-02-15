import java.util.*;
class bfs{
    public static void traversal(int [][] vis,int [][] arr,int dir[][],int i,int j){
        int m = arr.length;
        int n = arr[0].length;
        vis[i][j]=1;
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int r[] = q.poll();
            for(int d[] :dir){
                int x =d[0]+r[0];
                int y=d[1]+r[1];
                if(x>=0&&x<m&&y>=0&&y<n&&vis[x][y]!=1&&arr[x][y]==1){
                    q.add(new int[]{x,y});
                    vis[x][y]=1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int vis[][] = new int[m][n];
        int dir[][] = {{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{1,1},{-1,1},{1,-1}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]!=1 && arr[i][j]==1){
                    c=c+1;
                    traversal(vis,arr,dir,i,j);
                }
            }
        }
        System.out.println(c);
        sc.close();
    }
}
