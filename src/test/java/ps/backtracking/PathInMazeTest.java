/**
 * 
 */
package ps.backtracking;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class PathInMazeTest {
	
	PathInMaze pathFinder = new PathInMaze();
	
	@Test 
	public void testSuccessRow1Col1() {
		int[][] maze = {{1}};
		boolean result = pathFinder.findPath(maze, 0, 0, 0, 0, 2);
		pathFinder.printMaze(maze);		
		assertTrue(result);
	}
	
	@Test 
	public void testSuccessRow1Col2() {
		int[][] maze = {{1, 1}};
		boolean result = pathFinder.findPath(maze, 0, 0, 0, 1, 2);
		pathFinder.printMaze(maze);		
		assertTrue(result);
	}
	
	@Test 
	public void testSuccessRow2Col1() {
		int[][] maze = {{1}, 
						{1}};
		boolean result = pathFinder.findPath(maze, 0, 0, 1, 0, 2);
		pathFinder.printMaze(maze);		
		assertTrue(result);
	}
	
	@Test 
	public void testSuccessRow4Col4() {
		int[][] maze = {{1, 0, 0, 0},
				        {1, 1, 0, 1},
				        {0, 1, 0, 0},
				        {1, 1, 1, 1}};
		boolean result = pathFinder.findPath(maze, 0, 0, 3, 3, 2);
		pathFinder.printMaze(maze);		
		assertTrue(result);
	}
	
	@Test 
	public void testFailureRow4Col4() {
		int[][] maze = {{1, 0, 0, 0},
				        {1, 1, 0, 1},
				        {0, 1, 0, 0},
				        {1, 1, 1, 1}};
		boolean result = pathFinder.findPath(maze, 0, 0, 0, 3, 2);
		pathFinder.printMaze(maze);		
		assertFalse(result);
	}
	
	@Test 
	public void testSuccessRow8Col8() {
		int[][] maze = {{1, 0, 0, 0, 0, 0, 0, 0},
				        {1, 1, 0, 1, 0, 0, 0, 1},
				        {0, 1, 0, 0, 0, 0, 0, 1},
				        {1, 1, 1, 0, 0, 1, 1, 1},
				        {1, 0, 1, 0, 0, 0, 0, 1},
		                {1, 1, 1, 1, 0, 0, 0, 1},
		                {0, 1, 0, 0, 0, 0, 0, 1},
		                {1, 1, 1, 1, 1, 1, 1, 1}};		
		
		boolean result = pathFinder.findPath(maze, 0, 0, 3, 5, 2);
		pathFinder.printMaze(maze);		
		assertTrue(result);
	}
}
