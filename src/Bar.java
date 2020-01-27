
public class Bar {

	public static void main(String[] args) 
	{
		Foo f = new Foo();
		
		f.x = 180;
		f.y = 7;
		f.z = 150;
		
		
		System.out.println(f.x + " " + f.y + " " + f.z);
		
		Foo g = new Foo();
		
		System.out.println(g.x + " " + g.y + " " + g.z);
		
		Foo h = f;
		
		System.out.println(f.x + " " + f.y + " " + f.z);
		
	}

}
