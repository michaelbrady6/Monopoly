import java.util.*;
public class Tax extends Space
{
	Tax(String n)
	{
		name = n;
	}
	public void landedOn(Player x)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("You have landed on " + name);
		System.out.println("Do you want to pay:");
		System.out.println("1: 10% of your money");
		System.out.println("2: 200 dollars");
		int z = in.nextInt();
		if(z == 1)
		{
			x.removeMoney((int)(x.money*.1));
			System.out.println("You have paid " + (int)(x.money*.1) + " dollars");
		}
		else
		{
			System.out.println("You have paid 200 dollars");
			x.removeMoney(200);
		}
	}
}
