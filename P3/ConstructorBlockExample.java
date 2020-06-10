
public class ConstructorBlockExample {
	
	{
		System.out.println("This is the first cons block");
	}
	
	public ConstructorBlockExample(){
		System.out.println("This is a no param constructor");
	}
	
	public ConstructorBlockExample(String param1){
		System.out.println("This is a single param Constructor");
	}
	
	{
		System.out.println("This is a second Constructor Block");
	}
	
	public static void main(String[] args) {
		 ConstructorBlockExample constrBlockEx = new ConstructorBlockExample();       
		 ConstructorBlockExample constrBlockEx1 = new ConstructorBlockExample("param1");
	}

}
