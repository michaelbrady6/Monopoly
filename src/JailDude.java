
public class JailDude extends Space
{
	public void landedOn(Player x)
	{
		x.setLocation(Runner.b, 10);
		Runner.b.board.get(10).landedOn(x, 5);
	}
}
