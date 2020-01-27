
public class Colour {

	int red;
	int green;
	int blue;
	
	public static void main(String[] args) 
	{
		Colour yellow = new Colour();
		yellow.red = 255;
		yellow.green = 255;
		yellow.blue = 0;
		
		Colour purple = new Colour();
		purple.red = 128;
		purple.green = 0;
		purple.blue = 128;
		
		Colour orange = new Colour();
		orange.red = 255;
		orange.green = 165;
		orange.blue = 0;
		
		System.out.println(orange);
	}

}
