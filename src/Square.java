package lab6.src;


public class Square extends Rectangle{
	
	//constructor
	public Square(String id, double size)
	{
		super(id, size, size);
	}
	
	//returns shape type
	public String getShapeType()
	{
		return "Square";
	}
	
	@Override
	public double getPerimeter()
	{
		return 4 * this.getHeight();
	}
}

