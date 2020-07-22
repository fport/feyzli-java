package uygulama3;

public class Square extends Figure{

	private int edge;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public Square(int edge) {
		this.edge = edge;
	}
	public int getEdge() {
		return edge;
	}
	public void setEdge(int edge) {
		this.edge = edge;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return edge*edge;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return edge*4;
	}

		
	
}
