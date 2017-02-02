
public class RR extends Property 
{
	RR(String n)
	{
		name = n;
		cost = 200;
	}
	public int rent(Player x, int i)
	{
		if(x.RROwned() == 1)
		{
			return 25;
		}
		if(x.RROwned() == 2)
		{
			return 50;
		}
		if(x.RROwned() == 3)
		{
			return 100;
		}
		return 200;
	}
}
