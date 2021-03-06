package lab6.src;




import java.util.ArrayList;


/**
 * Abstract shape class to define a polygon.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public abstract class Polygon extends Shape
{
    /**
     * A list of the lengths of the sides of the polygons.
     */
    protected ArrayList<Double> sideLengths;

    /**
     * Initializes the sideLengths arraylist and sets the Shape's ID.
     *
     * @param id The created shape's name id.
     */
    public Polygon(String id)
    {
        super(id);
        sideLengths = new ArrayList<Double>(10);
    }

    /**
     * Calculates the perimeter of a polygon. That is, the sum of its side lengths.
     *
     * @return The perimeter of the polygon.
     */
    @Override
	public double getPerimeter()
    {
    	double totalSideLength = 0;
    	
    	//totals all the sides in the arraylist
    	for(int i =0; i < sideLengths.size(); i++)
    	{
    		totalSideLength += sideLengths.get(i);
    	}
    	return totalSideLength;
    }
}
