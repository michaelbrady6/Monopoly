import java.util.*;
import java.io.*;
public class Runner 
{
	static int g = 0;
	static Board b = new Board();
	static Dice d = new Dice();
	static Player p;
	static int jailCount = 0;
	public static void main(String[] args) throws IOException
	{
//		Dice d = new Dice();
		Scanner n = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = n.nextLine();
		Scanner in = new Scanner(System.in);
		System.out.println("What type of Monopoly would you like to play?");
		System.out.println("1: Classic");
		System.out.println("2: 14er version");
		int h = in.nextInt();
		b.setBoard(h);
		System.out.println("Welcome to Monopoly " + name);
		p = new Player(name);
		while(p.money > 0)
		{
			System.out.println("To roll the dice, press enter");
			playerDirection(jailCount);
			b.board.get(g).landedOn(p);
			System.out.println("The properties you own are:");
			for (int i = 0; i < p.owned.size(); i++)
			{
				System.out.println(p.owned.get(i));
			}
		}
	}
	public static void playerDirection(int i)
	{
		int x = 0;
		Scanner in = new Scanner(System.in);
		String roll = in.nextLine();
		x = d.roll();
		System.out.println("You have rolled a " + x);
		if(i%2 == 0)
			{
				if(g + x < b.board.size())
					{
						g +=x;
					}
					else
					{
						g = g + x - b.board.size();
						System.out.println("You have passed GO. You recieve 200 dollars");
						p.addMoney(200);
					}
			}
		else
			{
				if(g - x >= 0)
					{
						g -=x;
					}
					else
					{
						g = g - x + b.board.size();
						System.out.println("You have passed GO. You lose 200 dollars");
						p.removeMoney(200);
					}
			}
	}

}
