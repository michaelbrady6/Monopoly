
public class JailDude extends Space
{
	public void landedOn(Player x)
	{
		System.out.println("You have been sent to Jail");
		x.setLocation(Runner.b, 10);
		Runner.b.board.get(10).landedOn(x, 5);
		Runner.jailCount++;
	}
}
