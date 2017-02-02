import java.util.*;
public class Player 
{
	String name;
	int money = 1500;
	ArrayList<Property> owned = new ArrayList<Property>();
	public void addMoney(int x)
	{
		money += x;
	}
	public void removeMoney(int x)
	{
		money -=x;
	}
	public int UtilitiesOwned()
	{
		int c = 0;
		for (int i = 0; i<owned.size(); i++)
		{
			if(owned.get(i).getClass().equals("Utility"))
			{
				c++;
			}
		}
		return c;
	}
	public int RROwned()
	{
		int c = 0;
		for (int i = 0; i<owned.size(); i++)
		{
			if(owned.get(i).getClass().equals("RR"))
			{
				c++;
			}
		}
		return c;
	}
	@Override
	public String toString() {
		return name;
	}
}
