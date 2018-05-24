package pkgShapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void RectangleTestArea() {
		int iWidth = 10;
		int iLength=20;
		double dArea= 200;
		double dPerimeter=60;
		
		Rectangle rec1 = new Rectangle(iWidth, iLength);
		
		assertEquals(dArea, rec1.Area(), 0.01);
		assertEquals(dPerimeter, rec1.Perimeter(), 0.01);
		
	}
	
	@Test
	public void RectangleisSquare() 
	{
		int iWidth = 10;
		int iLength=20;
		Rectangle rec1 = new Rectangle(iLength, iWidth);
		
		assertFalse(rec1.isSquare());
		rec1.setWidth(20);
		
		assertTrue(rec1.isSquare());
	}

}

