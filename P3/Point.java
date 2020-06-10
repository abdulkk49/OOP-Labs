
public class Point {
	private double x; // Instance field x-coordinate
	private double y; // Instance field y-coordinate 
	 
	Point(double x, double y){
		this.x = x;
		this.y = y; 
	}
	 
	public double getX(){
		System.out.println("kk");
		return this.x;      
	}
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public double getY(){
		return this.y;
	}
	 
	public String toString(){
		return "X = " + x + " and Y = " + y; 
	}
	 
	public static void changeState(Point other){
		other.setX(-20); //actual change
		other.setY(-20);
	}
	 
	public static void changeReference(Point other){
		other = new Point(-20,-20); //local change	
	}
}
