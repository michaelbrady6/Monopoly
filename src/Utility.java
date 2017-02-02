
public class Utility extends Property
{
	Utility(int co, String n)
	{
		rent = 0;
		cost = co;
		name = n;
	}
	public int rent(Player x, int y)
	{
		if(x.UtilitiesOwned() == 1)
		{
			return y*4;
		}
		return y*10;
	}
}
