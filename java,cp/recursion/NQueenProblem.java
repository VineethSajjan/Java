import java.util.*;
class NQueenProblem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int board[][] = new int[N][N];
		if(can(board,0,N)){
			System.out.println(true);
			print(board);
		}
		else{
			System.out.println(false);
		}
		sc.close();
	}
	public static boolean can(int [][] board,int row,int N){
		if(row>=N){
			return true;
		}
		for(int col=0;col<N;col++){
			if(isValid(board,row,col)){
				board[row][col] = 1;
				if(can(board,row+1,N)){
					return true;
				}
				board[row][col]=0;
			}
		}
		return false;
	}
	public static boolean isValid(int [][] board,int row,int col){
		for(int r=0;r<row;r++){
			if(board[r][col]==1){
				return false;
			}
		}
		for(int r=row,c=col;c<board[0].length && r>=0;r--,c++){
				if(board[r][c]==1){
					return false;
				}
		}
		for(int r=row,c=col;c>=0 && r>=0;r--,c--){
			if(board[r][c]==1){
				return false;
			}
		}
		return true;
	}
	public static void print(int [][] board){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board.length;j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}