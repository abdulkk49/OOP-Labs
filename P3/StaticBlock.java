
public class StaticBlock {
	
	 static int[] values = initializeArray(10); 
	 
	 private static int[] initializeArray(int N){
		 int[] arr = new int[N]; 
		 for(int i = 0; i < arr.length; i++){
			 arr[i] = i;
		 }
		 System.out.println("Static initialised");
		 return arr;
	}
	 
	void listValues(){
		for(int value : values){
			System.out.println(value);
		}
	}
	 
	public static void main(String[] args) {
		System.out.println("Object being created...");
		StaticBlock example = new StaticBlock();
		System.out.println("\nFirst object: ");
		example.listValues();
		
		example = new StaticBlock();
		System.out.println("\nSecond Object");
		example.listValues();
	}
	
	static{
		System.out.println("KKK");
	}

}
