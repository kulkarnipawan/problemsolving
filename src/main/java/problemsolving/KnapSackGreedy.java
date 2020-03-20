/**
 * 
 */
package problemsolving;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class KnapSackGreedy {
	
	double[] weight, profit;
	
	public KnapSackGreedy(double[] weight, double[] profit) {
		this.weight = weight;
		this.profit = profit;
	}
	
	public double getMaxProfit(double maxW) {
		double maxProfit = 0;
		
		//Create ratio matrix of profit to weight
		double[] ratio = new double[weight.length];
		
		for(int i=0;i<ratio.length;i++) {
			ratio[i] = profit[i]/weight[i];
		}
		
		//Sort the ratio array in descending order. Need to align weight and profit matrix accordingly
		int max;
		double temp;
		for(int i=0;i<ratio.length;i++) {
			max = i;
			for(int j=i+1;j<ratio.length;j++) {
				if(ratio[j] > ratio[max]) {
					max=j;
				}
			}
			
			if(max != i) {
				temp = ratio[i];
				ratio[i] = ratio[max];
				ratio[max] = temp;
				
				temp = weight[i];
				weight[i] = weight[max];
				weight[max] = temp;
				
				temp = profit[i];
				profit[i] = profit[max];
				profit[max] = temp;				
			}
		}
		
		//Calculate maxProfit
		for(int i=0;i<weight.length;i++) {
			System.out.print(ratio[i]+":");
			if(weight[i]<=maxW) {
				maxProfit+=profit[i];
			} else {
				System.out.print(maxW);
				maxProfit+=maxW*ratio[i];
				break;
			}
			maxW-=weight[i];			
		}
		return maxProfit;
	}
}
