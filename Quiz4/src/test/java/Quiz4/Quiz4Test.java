package Quiz4;

import static org.junit.Assert.*;
import org.junit.Test;
import Quiz4.Triangles;

public class Quiz4Test {



	@Test
	public void getAreaTest() 
	{
		double testside1 = 9.0;
		double testside2 = 11.0;
		double testside3 = 16.0;
		Triangles testArea = new Triangles(testside1, testside2, testside3);
		double HermArea= 47.6235;
		
		assertEquals(HermArea, testArea.getArea(),.01);
	}
	
	@Test
	public void getPerimeterTest() 
	{
		double testside1 = 3.0;
		double testside2 = 3.0;
		double testside3 = 3.0;
		Triangles testPer = new Triangles(testside1, testside2, testside3);
		double perim = 9.0;
		assertEquals(perim, testPer.getPerimeter(),.01);
	}
}
