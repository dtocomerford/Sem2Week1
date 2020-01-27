
public class Point {

	double x;
	double y;
	
	
	public static void main(String[] args) 
	{
		double distance = 0;
		
		Point point1 = new Point();
		point1.x = 9.3;
		point1.y = 4.7;
		
		Point point2 = new Point();
		point2.x = 8.3;
		point2.y = 4.7;
		
		
		double result1 = Math.pow(point1.x - point1.y, 2);
		double result2 = Math.pow(point2.x - point2.y, 2);
		
		double answer = result1 + result2; 
		
		distance = Math.sqrt(answer);
		
		System.out.println(distance);

	}

}
