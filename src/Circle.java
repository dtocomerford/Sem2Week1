
public class Circle {

	double radius;
	
	
	public static void main(String[] args) 
	{
		Colour circleColour = new Colour();
		circleColour.red = 128;
		circleColour.green = 0;
		circleColour.blue = 128;

		
	}
	
	static double area (Circle c)
	{
		double area = 0;
		area = Math.PI * Math.pow(c.radius, 2);
		return area;
		
	}
	
	static double circumference(Circle c)
	{
		double circumference = 0;
		
		circumference  = 2 * Math.PI * c.radius;
		
		return circumference;
		
	}

}
