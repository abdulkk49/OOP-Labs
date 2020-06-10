
public class MovableCircle implements Movable{
	private MovablePoint center;
	private int radius;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
		this.radius = radius;
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
	}
	
	public void moveUp(){
		center.y -= center.ySpeed;
	}
	
	public void moveDown(){
		center.y += center.ySpeed;
	}
	
	public void moveRight(){
		center.x += center.xSpeed;
	}
	
	public void moveLeft(){
		center.x -= center.xSpeed;
	}
}
