import java.util.*;
public class Runner 
{
	static int g;
	static Board b = new Board();
	public static void main(String[] args) 
	{
		Dice d = new Dice();
		Scanner n = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = n.nextLine();
		Player p = new Player(name);
		int y = 0;
		while(p.money > 0)
		{
			
			int x = d.roll();
			System.out.println("You have rolled a " + x);
			if(g + x < 40)
			{
				g +=x;
			}
			else
			{
				g = g + x - 40;
				System.out.println("You have passed go. You recieve 200 dollars");
				p.addMoney(200);
			}
			b.board.get(g).landedOn(p);
			System.out.println("You have " + p.money + " dollars");
			System.out.println("The properties you own are:");
			for (int i = 0; i < p.owned.size(); i++)
			{
				System.out.println(p.owned.get(i));
			}
		}
	}

}
