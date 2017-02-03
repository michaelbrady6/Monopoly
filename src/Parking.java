
public class Parking extends Space
{

	public Parking() {
		name = "Free Parking";
	}
	public void landedOn(Player x)
	{
		System.out.println("You have landed on " + name);
	}
}
