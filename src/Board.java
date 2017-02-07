import java.util.*;
import java.io.*;
public class Board 
{
	ArrayList<Space> board = new ArrayList<Space>();
	Board()
	{
		board.add(new Go("GO"));
		board.add(new ColoredProperty("Purple", 2, 60, "Mediterranean Avenue"));
		board.add(new CardGiver("Community Chest"));
		board.add(new ColoredProperty("Purple", 4, 60, "Baltic Avenue"));
		board.add(new Tax("Income tax"));
		board.add(new RR("Reading Railroad"));
		board.add(new ColoredProperty("Light Blue", 6, 100, "Oriental Avenue"));
		board.add(new CardGiver("Chance"));
		board.add(new ColoredProperty("Light Blue", 6, 100, "Vermont Avenue"));
		board.add(new ColoredProperty("Light Blue", 8, 120, "Connecticut Avenue"));
		board.add(new Jail());
		board.add(new ColoredProperty("Pink", 10, 140, "Oriental Avenue"));
		board.add(new Utility(150, "Electric Company"));
		board.add(new ColoredProperty("Pink", 10, 140, "States Avenue"));
		board.add(new ColoredProperty("Pink", 12, 160, "Viginia Avenue"));
		board.add(new RR("Pennsylvania Railroad"));
		board.add(new ColoredProperty("Orange", 14, 180, "St. James Place"));
		board.add(new CardGiver("Community Chest"));
		board.add(new ColoredProperty("Orange", 14, 180, "Tennessee Avenue"));
		board.add(new ColoredProperty("Orange", 16, 200, "New York Avenue"));
		board.add(new Parking());
		board.add(new ColoredProperty("Red", 18, 220, "Kentucky Avenue"));
		board.add(new CardGiver("Chance"));
		board.add(new ColoredProperty("Red", 18, 220, "Indiana Avenue"));
		board.add(new ColoredProperty("Red", 20, 240, "Illinois Avenue"));
		board.add(new RR("B. & O. Railroad"));
		board.add(new ColoredProperty("Yellow", 22, 260, "Atlantic Avenue"));
		board.add(new ColoredProperty("Yellow", 22, 260, "Ventor Avenue"));
		board.add(new Utility(150, "Water Works"));
		board.add(new ColoredProperty("Yellow", 24, 280, "Marvin Gardens"));
		board.add(new JailDude());
		board.add(new ColoredProperty("Green", 26, 300, "Pacific Avenue"));
		board.add(new CardGiver("Community Chest"));
		board.add(new ColoredProperty("Green", 26, 300, "North Carolina Avenue"));
		board.add(new ColoredProperty("Green",28, 320, "Pennsylvania Avenue"));
		board.add(new RR("Short Line"));
		board.add(new CardGiver("Chance"));
		board.add(new ColoredProperty("Blue", 35, 350, "Park Place"));
		board.add(new Tax("Luxury Tax"));
		board.add(new ColoredProperty("Blue", 50, 400, "Boardwalk"));
	}
	public void setBoard(int i) throws IOException
	{
		
		if(i == 1)
			{
				
			}
		if(i == 2)
			{
				Scanner x = new Scanner(new File("14ers.txt"));
				for(int z = 0; z<board.size(); z++)
					{
						String y = x.nextLine();
						this.board.get(z).setName(y);
					}
			}
	}
}
