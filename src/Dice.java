
public class Dice 
{
	public static int roll()
	{
		int d1 = (int)(Math.random()*6 + 1);
		int d2 = (int)(Math.random()*6 + 1);
		return d1 + d2;
	}
}
