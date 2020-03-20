/**
 * 
 */
package ps.backtracking;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class NQueens {
	
	private int[][] board;
	private int size;
	
	public NQueens(int size) {
		this.size = size;
		board = new int[size][size];		
	}
	
	public boolean isMoveSafe(int x, int y) {
		//Upper rows
		for(int i=x;i>=0;i--) {
			if(board[i][y] == 1)
				return false;
		}
		
		//Left diagonal
		int i=x, j=y;
		for(;i>=0 && j>=0;i--,j--) {
			if(board[i][j] == 1)
				return false;
		}
		
		//Right diagonal
		i=x; j=y;
		for(;i>=0 && j<size;i--,j++) {
			if(board[i][j] == 1)
				return false;
		}
				
		return true;
	}
	
	public boolean findPath(int row) {
		if(row >= size)
			return true;
		
		boolean result = false;
		
		for(int i=0; i<size; i++) {
			if(isMoveSafe(row, i)) {
				board[row][i] = 1;
				if(result = findPath(row+1))
					break;
				board[row][i] = 0;
			}
		}
		
		return result;
	}
	
	public void printBoard() {
		System.out.println("------------------------------------------");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("------------------------------------------");
	}
	
	public boolean checkBoard() {
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(board[i][j] == 0 || board[i][j] > size*size) {
					return false;
				}
			}
		}
		return true;
	}
}
