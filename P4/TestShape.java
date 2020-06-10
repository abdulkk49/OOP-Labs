
public class TestShape {

	public static void main(String[] args) {
		 Rectangle s1 = new Rectangle("red", 4, 5);
		 System.out.println(s1);
		 //System.out.println(s1.test());
		 System.out.println("Area is " + s1.getArea());
		 Shape s2 = new Triangle("blue", 4, 5);      
		 System.out.println(s2);      
		 System.out.println("Area is " + s2.getArea()); 
	}

}

//s1.test() does not work as test() does not exist in shape class
//Subclass objects referenced through superclass variables cannot be used to call non overridden methods of sub class