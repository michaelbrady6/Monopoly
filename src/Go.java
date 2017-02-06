
public class Go extends Space
{
	Go(String n)
	{
		name = n;
	}
	public void landedOn(Player x)
	{
		System.out.println("You are on " + name);
	}
}
