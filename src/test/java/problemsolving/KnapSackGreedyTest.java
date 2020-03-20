/**
 * 
 */
package problemsolving;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class KnapSackGreedyTest {
	
	@Test 
	public void testKnapSackInputSize1() {
		double[] weight = {5.0};
		double[] profit = {5.0};
		
		KnapSackGreedy maxProfitCalculator = new KnapSackGreedy(weight, profit);
		double maxProfit = maxProfitCalculator.getMaxProfit(4.0);		
		assertEquals(0.8, maxProfit,0);
	}
	
	@Test 
	public void testKnapSackInputSize2() {
		double[] weight = {5.0, 4.0};
		double[] profit = {5.0, 15.0};
		
		KnapSackGreedy maxProfitCalculator = new KnapSackGreedy(weight, profit);
		double maxProfit = maxProfitCalculator.getMaxProfit(4.0);		
		assertEquals(15, maxProfit,0);
	}

	@Test 
	public void testKnapSackInputSize7() {
		double[] weight = {2, 3, 5, 7, 1, 4, 1};
		double[] profit = {10, 5, 15, 7, 6, 18, 3};
		
		KnapSackGreedy maxProfitCalculator = new KnapSackGreedy(weight, profit);
		double maxProfit = maxProfitCalculator.getMaxProfit(15);		
		assertEquals(55.3, maxProfit,0);
	}
}
