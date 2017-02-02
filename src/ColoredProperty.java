
public class ColoredProperty extends Property
{
	String color;
	ColoredProperty(String c, int r, int co, String n)
	{
		color = c;
		rent = r;
		cost = co;
		name = n;
	}
	public int rent(Player x, int i)
	{
		return (rent);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
