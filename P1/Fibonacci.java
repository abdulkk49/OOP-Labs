
public class Fibonacci {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 2, c = 0, a = 1, b = 1;
		double avg = 0;
		if(n == 1){
			System.out.println("The first " + n + "Fibonacci numbers are:");
			System.out.println("1");
			System.out.print("THe average is 1");
		}
		else if(n == 2){
			System.out.println("The first " + n + "Fibonacci numbers are:");
			System.out.println("1 1");
			System.out.print("The average is 1");
		}
		
		else if(n > 2){
			System.out.println("The first " + n + " Fibonacci numbers are:");
			System.out.print("1 1");
			for(int i = 2; i < n; i++){
				c = a + b;
				sum += c;
				System.out.print(" " + c);
				a = b;
				b = c;
			}
			avg = (double)sum/(double)n;
			System.out.println("\nThe average is " + avg);
		}

	}

}
