public class Circle{ 

	private double radius;
	private String color;

	public Circle() { 
		radius = 1.0;
		color = "red";
	}
	public Circle(double r) { 
		radius = r;
		color = "red";
	}
	public Circle(double r, String c) { 
		radius = r;
		color = c;
	}
	
	public double getRadius(){
		System.out.println("sub radius");
		return radius;
	}
	public String getColor(){
		return color;
	}
	public double getArea(){
		System.out.println("Super class");
		return radius*radius*Math.PI;
	}
}
 