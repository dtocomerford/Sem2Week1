
public class Player {
	
	String name;
	int score;
	
	public static void main(String[] args) 
	{
		Player A = new Player();
		A.name = "Jake";
		A.score = 46;
		
		Player B = new Player();
		B.name = "Elwood";
		B.score = 49;
		
		if(A.score > B.score)
		{
			Player winner = A;
		}
		else
		{
			Player winner = B;
		}
		
		
	}
}
