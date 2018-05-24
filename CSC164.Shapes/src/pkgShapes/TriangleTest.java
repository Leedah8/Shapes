package pkgShapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void TestTriangle() 
	{
		double sides = 7;
		double angles = 60;
		
		Triangle t1 = new Triangle(sides); 	
		
		assertEquals(sides, t1.getS1(), 0.01);
		assertEquals(sides, t1.getS2(), 0.01);
		assertEquals(sides, t1.getS3(), 0.01);
		
		assertEquals(angles, t1.AngleA(), 0.01);
		assertEquals(angles, t1.AngleB(), 0.01);
		assertEquals(angles, t1.AngleC(), 0.01);
		 
	}

}

