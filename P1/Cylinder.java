public class Cylinder extends Circle {
	private double height; 
	public Cylinder() { 
		super(); 
		height = 1.0;
	}
	public Cylinder(double radius, double height) { 
		super(radius); 
		this.height = height;
	}
	public double getHeight() {
		System.out.println("height");
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea(){
		System.out.println("the function belong to subclass");
		return 1;
	}
	public double getVolume() {
		System.out.println("volume");
		return getArea()*height; 
	}
}
