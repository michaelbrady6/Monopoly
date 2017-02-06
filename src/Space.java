
public abstract class Space 
{
	String name;
	public abstract void landedOn(Player y);
	@Override
	public String toString() {
		return  name ;
	}
	public void landedOn(Player x, int z)
	{
		
	}
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}
}
