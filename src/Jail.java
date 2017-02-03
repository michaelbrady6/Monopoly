import java.util.*;
public class Jail extends Space
{
	public void landedOn(Player p)
	{
		System.out.println("You are visiting the Jail");
	}
	public void landedOn(Player p, int j)
	{
		Scanner in  = new Scanner(System.in);
		System.out.println("You are in Jail");
		System.out.println("Which would you like to do?");
		System.out.println("1: Roll a double in the next 3 turns");
		System.out.println("2: Pay 50 dollars to get out");
		int z = in.nextInt();
		if(z == 1)
		{
			int i;
			for(i = 0; i < 3; i++)
			{
				Dice d = new Dice();
				d.roll();
				System.out.println("You rolled a " + d.getD1() + " and a " + d.getD2());
				if(d.getD1() == d.getD2())
				{
					System.out.println("You have been freed");
					i = 5;
					this.landedOn(p);
				}
			}
			if(i != 5)
			{
				System.out.println("It has been 3 turns. You are free");
				this.landedOn(p);
			}
		}
		else
		{
			System.out.println("You have been freed");
			this.landedOn(p);
		}
	}
}
