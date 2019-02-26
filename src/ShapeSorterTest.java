package lab6.src;


import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 7, 3);
		Shape b = new EquilateralTriangle("test2", 3);
		Shape c = new Square("test3", 2);
		Shape d = new Circle("test4", 4.4);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		sorter.sortShapes();

		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(0), b);
		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(1), c);
		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(2), a);
		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 7, 3);
		Shape b = new EquilateralTriangle("test2", 3);
		Shape c = new Square("test3", 2);
		Shape d = new Circle("test4", 4.4);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		sorter.sortShapes(new ShapeAreaComparator());

		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(0), d);
		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(1), a);
		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(2), c);
		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(3), b);
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 9, 2);
		Shape b = new EquilateralTriangle("test2", 13);
		Shape c = new Square("test3", 25);
		Shape d = new Circle("test4", 44);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		sorter.sortShapes(new ShapeAreaComparator());

		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(0), d);
		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(1), c);
		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(2), b);
		Assert.assertEquals("SortShapes gave incorrect ordering.", sorter.shapes.get(3), a);
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 9, 2);
		
		sorter.addShape(a);
		
		Assert.assertEquals("Rectangle:\t ID = test\t area = 18.000\t perimeter = 22.000", sorter.toString());
	}
	
}
