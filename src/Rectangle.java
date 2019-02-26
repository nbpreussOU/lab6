package lab6.src;
public class Rectangle extends Polygon{

	
	private double height, width;
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	//constructor
	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
		sideLengths.add(height);
		sideLengths.add(height);
		sideLengths.add(width);
		sideLengths.add(width);
		
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
	
	@Override
	public double getPerimeter()
	{
		return sideLengths.get(0) + sideLengths.get(1) + sideLengths.get(2) + sideLengths.get(3);
	}
	
	
}
