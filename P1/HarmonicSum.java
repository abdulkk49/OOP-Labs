
public class HarmonicSum {

	public static void main(String[] args) {
		double n = 50000d;
		double sum2 = 0d, sum1 = 0d;
		for(int i = 1; i <= n; i++){
			sum1 += 1d/i;
		}
		
		for(int i = (int)n; i >= 1; i--){
			sum2 += 1d/i;
		}
		
		System.out.println(-1 * (sum1 - sum2));
		
	}

}
