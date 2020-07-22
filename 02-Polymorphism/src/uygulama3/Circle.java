package uygulama3;

public class Circle extends Figure {

	private double radius; 
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
	
	
	
	
}
