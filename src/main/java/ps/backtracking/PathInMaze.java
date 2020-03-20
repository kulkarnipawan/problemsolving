/**
 * 
 */
package ps.backtracking;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class PathInMaze {
	
	private static final int[] moveX = {1,0,-1,0};
	private static final int[] moveY = {0,1,0,-1};
	
	private boolean canMoveTo(int[][] maze, int x, int y) {
		if(x>=0 && x<maze.length
			&& y>=0 && y<maze[x].length
			&& maze[x][y] == 1) {
			return true;		
		}
		
		return false;
	}
	
	public boolean findPath(int[][] maze, int startX, int startY, int destX, int destY, int moveCount) {
		maze[startX][startY] = moveCount;
		
		if(startX == destX && startY == destY)
			return true;
		
		boolean result = false;
		
		for(int i=0; i<4; i++) {
			if(canMoveTo(maze, startX+moveX[i], startY+moveY[i])) {
				if(result = findPath(maze, startX+moveX[i], startY+moveY[i], destX, destY, moveCount+1))
					break;
			}
		}
		
		if(!result) {
			maze[startX][startY] = 1;
		}
		
		return result;
	}
	
	public void printMaze(int[][] maze) {
		System.out.println("------------------------------------------");
		for(int i=0; i<maze.length; i++) {
			for(int j=0; j<maze[i].length; j++) {
				System.out.print(maze[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("------------------------------------------");
	}
}
