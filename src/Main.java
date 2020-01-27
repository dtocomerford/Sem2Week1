import java.util.Random;

public class Main {

	public static void main(String[] args) 
	{
		int rand1 = 0;
		int rand2 = 0;
		
		Citizen[] citizens = new Citizen[3];
		
		citizens[0] = new Citizen();
		citizens[0].name = "Fred";
		citizens[0].water = 5;
		citizens[0].lives = 3;
		
		citizens[1] = new Citizen();
		citizens[1].name = "Jim";
		citizens[1].water = 5;
		citizens[1].lives = 3;
		
		citizens[0] = new Citizen();
		citizens[0].name = "Sheila";
		citizens[0].water = 5;
		citizens[0].lives = 3;
		
		Random r = new Random();
		
		for(int i = 0; i < 30; i++)
		{
			
			while(rand1 == rand2)
			{
				rand1 = r.nextInt(citizens.length - 1);
				rand2 = r.nextInt(citizens.length - 1);
			}
			
			boolean hit = r.nextInt(2) > 0;
			Citizen shooter = citizens[rand1];
			Citizen victim = citizens[rand2];
			
			shoot(shooter, victim, hit);
		}

	}
	
	public static void shoot(Citizen shooter, Citizen victim, boolean hit)
	{
		System.out.println(shooter.name + " shoots");
		shooter.water--;
		
		if(hit == true && shooter.water > 0)
		{
			System.out.println("Die!");
			System.out.println(victim.name + " loses a life");
			
			victim.lives--;
		}
		else if(hit == false && shooter.water > 0)
		{
			System.out.println(shooter.name + " misses " + victim.name);
		}
		else
		{
			System.out.println(shooter.name + " has run out of ammo");
		}
		
		
	}

}
