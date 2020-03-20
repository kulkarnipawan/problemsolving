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
public class NQueensTest {
	
	@Test 
	public void testBoardSize1() {
		NQueens pathFinder = new NQueens(1);
		
		boolean result = pathFinder.findPath(0);
		pathFinder.printBoard();		
		assertTrue(result);
	}
	
	@Test 
	public void testBoardSize2() {
		NQueens pathFinder = new NQueens(2);
		
		boolean result = pathFinder.findPath(0);
		pathFinder.printBoard();		
		assertFalse(result);
	}
	
	@Test 
	public void testBoardSize3() {
		NQueens pathFinder = new NQueens(3);
		
		boolean result = pathFinder.findPath(0);
		pathFinder.printBoard();		
		assertFalse(result);
	}
	
	@Test 
	public void testBoardSize4() {
		NQueens pathFinder = new NQueens(4);
		
		boolean result = pathFinder.findPath(0);
		pathFinder.printBoard();		
		assertTrue(result);
	}
	
	@Test 
	public void testBoardSize5() {
		NQueens pathFinder = new NQueens(5);
		
		boolean result = pathFinder.findPath(0);
		pathFinder.printBoard();		
		assertTrue(result);
	}
	
	@Test 
	public void testBoardSize6() {
		NQueens pathFinder = new NQueens(6);
		
		boolean result = pathFinder.findPath(0);
		pathFinder.printBoard();		
		assertTrue(result);
	}
	
	@Test 
	public void testBoardSize7() {
		NQueens pathFinder = new NQueens(7);
		
		boolean result = pathFinder.findPath(0);
		pathFinder.printBoard();		
		assertTrue(result);
	}
	
	@Test 
	public void testBoardSize8() {
		NQueens pathFinder = new NQueens(8);
		
		boolean result = pathFinder.findPath(0);
		pathFinder.printBoard();		
		assertTrue(result);
	}
}
