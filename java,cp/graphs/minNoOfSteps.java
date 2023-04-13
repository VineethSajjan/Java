/*Azim likes to play the number sliding puzzle game but it takes more number of steps for solving the puzzle.
  help Azim to find the minimum number of steps in which he can finish the game.
 given a 3x3 board and the tiles it in are numbered from 1-8 and an empty square represented by 0.
 the game is completed when the numbers are arranged in Increasing order i.e
  [[1,2,3]
  [4,5,6]
  [7,8,0]]
  find the minimum number of ways to achive the required order by moving the tiles 4 directionaly i.e
  up,down,right,left.only one movement is possible at every move.
 return -1 if it is not possible to achieve the order.
  
  Input:
  Input for the jumbled matrix of size 3x3;
  
  Output:
  Minimum number of steps to solved the board in Increasing order;
  Example 1:
  Input:
  1 2 3
  4 5 6
  0 7 8
  Output:
  1
  Explanation:
  swap 0 and 8 in one move.
 Example 2:
  Input:
  0 2 3
  4 5 6
  1 7 8
  Output:
  -1
  
  Explanation:
  No number of moves will make the board solve.   
*/

import java.util.*;

class minNoOfSteps 
{    
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // down, up, right, left
     
	public static int solve(int[][] board) 
	{
		String target = "123456780";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sb.append(board[i][j]);
			}
		}

		String start = sb.toString();
		//System.out.println("sb " + start);

		Queue<String> queue = new LinkedList<>();
		Set<String> visited = new HashSet<>();
		queue.offer(start);
		visited.add(start);

		int steps = 0;
		while (!queue.isEmpty()) 
		{
			int size = queue.size();
			//System.out.println("size = " + size);
			for (int i = 0; i < size; i++) 
			{
				String curr = queue.poll();
				//System.out.println("curr = " + curr);
				if (curr.equals(target)) {
					return steps;
				}
				int zeroIndex = curr.indexOf('0');
				int x = zeroIndex / 3, y = zeroIndex % 3;
				//System.out.println("zeroIndex = " + zeroIndex + " x = " + x + " y = " + y);
				for (int[] dir : directions) 
				{
					int newX = x + dir[0], newY = y + dir[1];
					if (newX < 0 || newX >= 3 || newY < 0 || newY >= 3) {
						continue;
					}
					int newIndex = newX * 3 + newY;
					String next = swap(curr, zeroIndex, newIndex);
					//System.out.println("newIndex = " + newIndex + " next = " + next);
					if(next.equals(target))
					{
						steps++;
						return steps;
					}
					if (!visited.contains(next)) 
					{
						queue.offer(next);
						visited.add(next);
					}
				}
			}
			steps++;
		}	 
		return -1;
	}

	private static String swap(String s, int i, int j) 
	{
		char[] arr = s.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return new String(arr);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[][] board=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]=sc.nextInt();
			}
		}
		System.out.println(solve(board));
		sc.close();
	}
}

/* Test Cases
case=1
input = 1 2 3
4 5 7
6 8 0
output = -1
 
case=2
input = 8 1 2
4 6 5
7 3 0
output = 18
  
case=3
input = 1 2 3
7 4 5
8 0 6
output = 5
  
case=4
input = 1 3 0
5 2 6
4 7 8
output = 6
  
case=5
input = 6 4 7
3 1 2
5 8 0 
output = 24
  
case=6
input = 1 3 0
5 2 6
4 7 8 
output = 6

case=7
input = 7 1 4
3 5 2
6 8 0 
output = 22
 
case=8
input = 8 7 4
1 5 2
3 6 0
output = 26
*/