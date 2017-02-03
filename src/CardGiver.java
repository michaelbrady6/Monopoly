
public class CardGiver extends Space
{
	String name;
	CardGiver(String n)
	{
		name = n;
	}
	public void landedOn(Player y)
	{
		System.out.println("You have landed on " + name);
		System.out.println("You recieve a card");
	}
}
