import java.io.*;
public class Exercise1 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		int n = 0, sum = 0;
		for(int i = 0; i < 10; i++){
			String num = br.readLine();
			n = Integer.parseInt(num);
			sum += n;
		}
		System.out.println("The sum of 10 numbers is: " + sum);
	}

}
