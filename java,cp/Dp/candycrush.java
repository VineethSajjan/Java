import java.util.*;
class candycrush{
    public static int[][] check(int [][]grid,int r,int c){
        boolean crush=false;
        //finding the three candies
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int v = Math.abs(grid[i][j]);
                if(v==0) continue;
                if(j+2<c&&Math.abs(grid[i][j+1])==v&&Math.abs(grid[i][j+2])==v){
                    crush=true;
                    grid[i][j]=grid[i][j+1]=grid[i][j+2]=-v;
                }
                if(i+2<r&&Math.abs(grid[i+1][j])==v&&Math.abs(grid[i+2][j])==v){
                    crush=true;
                    grid[i][j]=grid[i+1][j]=grid[i+2][j]=-v;
                }
            }
        }
        //crushing
        for(int j=0;j<c;j++){
            int id=r-1;
            for(int i=r-1;i>=0;i--){
                if(grid[i][j]>0){
                    grid[id][j]=grid[i][j];
                    id--;
                }
            }
            while(id>=0) {
                grid[id][j]=0;
                id--;
            }
        }

        return crush?check(grid, r, c):grid;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int grid[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        check(grid,r,c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}