import java.util.Scanner;
public class Exercise2 {
	
	public static void main(String[] args){
		int n = 0, sum = 0;
		
		Scanner in  = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			n = in.nextInt();
			sum += n;
		}
		System.out.println("Sum = " + sum);
	}
}
