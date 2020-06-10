
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer I = new Integer(10);  
		Integer J = new Integer(20);   // Observe the output for following two    
									   // statements carefully   
		System.out.println(new Integer(I.intValue()).toString());   
		System.out.println(I.toString());   // Observe the output for following two    
								 // statements carefully   
		System.out.println(J.intValue());   
		System.out.println(J);   
		Integer K1 = new Integer(I.intValue()+J.intValue());   
		// What happens for the following statement    
		// (Auto Unboxing)   
		Integer K2 = I + J + K1; System.out.println(K2);  
	}

}
