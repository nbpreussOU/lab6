package lab6.src;

public class Rectangle extends Polygon{

	
	private double height, width;
	
	//constructor
	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
	}
	
	// returns the area
	public double getArea(){
		return width * height;
	}
	
	//returns the shape type
	public String getShapeType()
	{
		return "Rectangle";
	}
	
	
}
