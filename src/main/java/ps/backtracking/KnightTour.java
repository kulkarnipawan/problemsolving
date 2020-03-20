/**
 * 
 */
package ps.backtracking;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class KnightTour {
	
	private static final int[] moveX = {2,2,-2,-2,1,-1,1,-1};
	private static final int[] moveY = {1,-1,1,-1,2,2,-2,-2};
	
	private int[][] board;
	private int size;
	
	public KnightTour(int size) {
		this.size = size;
		board = new int[size][size];		
	}
	
	public boolean isMoveValid(int x, int y) {
		if(x >= 0 && x <= size-1 
		   && y >= 0 && y <= size-1
		   && board[x][y] == 0) {
			return true;
		}
		
		return false;
	}
	
	public int countEmptyNeighbours(int x, int y) {
		int count = 0;
		for(int i=0;i<8;i++) {
			if(isMoveValid(x+moveX[i], y+moveY[i])) {
				count++;
			}
		}
		return count;
	}
	
	public int nextMove(int x, int y) {
		int min=8, next=-1, emptyNeighbours;
		for(int i=0;i<8;i++) {
			if(isMoveValid(x+moveX[i], y+moveY[i])) {
				emptyNeighbours = countEmptyNeighbours(x+moveX[i], y+moveY[i]);
				if(emptyNeighbours < min) {
					min = emptyNeighbours;
					next = i;				
				}
			}
		}
		return next;
	}
	
	public boolean findPath(int x, int y, int moveCount) {
		board[x][y] = moveCount;
		
		if(moveCount == size*size)
			return true;
		
		boolean result = false;
		
		for(int i=0; i<8; i++) {
			if(size>7) {
				int next = nextMove(x,y);
				if(next != -1 && findPath(x+moveX[next], y+moveY[next], moveCount+1)) {
					result = true;
					break;
				}
			} else {
				if(isMoveValid(x+moveX[i], y+moveY[i])) {
					if(result = findPath(x+moveX[i], y+moveY[i], moveCount+1))
						break;
				}
			}
		}
		
		if(!result) {
			board[x][y] = 0;
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
