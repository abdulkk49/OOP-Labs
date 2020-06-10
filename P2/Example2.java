import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		int num1;
		double double1;
		String numStr1, numStr2;
		
		Scanner in = new Scanner(System.in);
//		in.useDelimiter("\\n");
		System.out.println("Enter an integer: ");
		num1 = in.nextInt();
		System.out.println("You entered: " + num1);
		
		System.out.println("Enter a double: ");
		double1 = in.nextDouble();
		System.out.println("You entered: " + double1);
		
		System.out.println("Enter your first name");
		numStr1 = in.next();
		in.nextLine();
		System.out.println("Your name is " + numStr1);
		
		System.out.println("Enter your surname");
		numStr2 = in.nextLine();
		System.out.println("You surname is " + numStr2);
		
	}

}

//https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo