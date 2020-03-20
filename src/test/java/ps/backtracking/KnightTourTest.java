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
public class KnightTourTest {
	
	
	@Test 
	public void testSuccessSize1() {
		KnightTour tour = new KnightTour(1);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertTrue(result);
		assertTrue(tour.checkBoard());
	}
	
	@Test 
	public void testFailureSize2() {
		KnightTour tour = new KnightTour(2);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertFalse(result);
	}
	
	@Test 
	public void testFailureSize3() {
		KnightTour tour = new KnightTour(3);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertFalse(result);
	}
	
	@Test 
	public void testFailureSize4() {
		KnightTour tour = new KnightTour(4);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertFalse(result);
	}
	
	@Test 
	public void testSuccessSize5() {
		KnightTour tour = new KnightTour(5);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertTrue(result);
		assertTrue(tour.checkBoard());
	}
	
	@Test 
	public void testSuccessSize6() {
		KnightTour tour = new KnightTour(6);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertTrue(result);
		assertTrue(tour.checkBoard());
	}
	
	@Test 
	public void testSuccessSize7() {
		KnightTour tour = new KnightTour(7);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertTrue(result);
		assertTrue(tour.checkBoard());
	}
	
	@Test 
	public void testSuccessSize8() {
		KnightTour tour = new KnightTour(8);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertTrue(result);
		assertTrue(tour.checkBoard());
	}
	
	@Test 
	public void testSuccessSize9() {
		KnightTour tour = new KnightTour(9);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertTrue(result);
		assertTrue(tour.checkBoard());
	}
	
	@Test 
	public void testSuccessSize10() {
		KnightTour tour = new KnightTour(10);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertTrue(result);
		assertTrue(tour.checkBoard());
	}
	
	@Test 
	public void testSuccessSize11() {
		KnightTour tour = new KnightTour(11);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertTrue(result);
		assertTrue(tour.checkBoard());
	}
	
	@Test 
	public void testSuccessSize12() {
		KnightTour tour = new KnightTour(12);
		boolean result = tour.findPath(0, 0, 1);
		tour.printBoard();		
		assertTrue(result);
		assertTrue(tour.checkBoard());
	}
	
}
