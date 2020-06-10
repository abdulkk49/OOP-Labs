
public class StaticExample {
	
	public static int a;
	static{
		System.out.println("This is first static block");
	}
	
	public StaticExample(){
		System.out.println("This is a connstructor");
	}
	
	public static String staticString = "StaticVariable";
	
	static{
		System.out.println("This is a second static block " + staticString + a);
		
	}
	public static void main(String[] args) {
		StaticExample statEx = new StaticExample();
		StaticExample.staticMethod2();
	}
	
	static{
		staticMethod();
		System.out.println("This is the third static block");
	}
	
	public static void staticMethod(){
		System.out.println("This is a static Method 1");
	}
	
	public static void staticMethod2(){
		System.out.println("This is a static Method 2");
	}
}
