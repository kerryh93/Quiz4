package Quiz4;

public class Triangles extends GeometricObject
{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;



	public Triangles(double side1, double side2, double side3) 
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}



	public double getSide1() {
		return side1;
	}



	public double getSide2() {
		return side2;
	}



	public double getSide3() {
		return side3;
	}



	@Override
	public double getPerimeter() 
	{
		// TODO Auto-generated method stub
		return side1 + side2 + side3;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double halfBase = ((side1+side2+side3)/2);
		/**
		 * use Heron's equation to solve for side of triangle
		 */
		double area =  Math.sqrt(halfBase*(halfBase-side1)*(halfBase-side2)*(halfBase-side3));
		return area;
	}
	
	@Override
	public String toString() {
	 return ("The length of side 1 is: " + this.getSide1()+"\n"
				+"The length of side 2 is: " + this.getSide2() + "\n" 
				+ "The length of side 3 is: " + this.getSide3() + "\n"
				+ "The perimeter of the triangle is: " + this.getPerimeter() + "\n"
				+"The area of the triangle is: " + this.getArea() + "\n" 
				);
		
	}



	
	
}