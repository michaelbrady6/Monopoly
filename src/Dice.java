
public class Dice 
{
	private int d1;
	private int d2;
	public int roll()
	{
		d1 = (int)(Math.random()*6 + 1);
		d2 = (int)(Math.random()*6 + 1);
		return d1 + d2;
	}
	public static int roll(int z)
	{
		int d1 = (int)(Math.random()*6 + 1);
		int d2 = (int)(Math.random()*6 + 1);
		return d1 + d2;
	}
	public int getD1() {
		return d1;
	}
	public void setD1(int d1) {
		this.d1 = d1;
	}
	public int getD2() {
		return d2;
	}
	public void setD2(int d2) {
		this.d2 = d2;
	}
}
