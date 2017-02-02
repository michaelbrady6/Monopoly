import java.util.*;
public class Board 
{
	ArrayList<Space> board = new ArrayList<Space>();
	Board()
	{
		//GO-->
		board.add(new ColoredProperty("Purple", 2, 60, "Mediterranean Avenue"));
		board.add(new CardGiver("Community Chest"));
		board.add(new ColoredProperty("Purple", 4, 60, "Baltic Avenue"));
		//Income Tax
		board.add(new RR("Reading Railroad"));
		board.add(new ColoredProperty("Light Blue", 6, 100, "Oriental Avenue"));
		board.add(new CardGiver("Chance"));
		board.add(new ColoredProperty("Light Blue", 6, 100, "Vermont Avenue"));
		board.add(new ColoredProperty("Light Blue", 8, 120, "Connecticut Avenue"));
		//jail
		board.add(new ColoredProperty("Pink", 10, 140, "Oriental Avenue"));
		board.add(new Utility(150, "Electric Company"));
		board.add(new ColoredProperty("Pink", 10, 140, "States Avenue"));
		board.add(new ColoredProperty("Pink", 12, 160, "Viginia Avenue"));
		board.add(new RR("Pennsylvania Railroad"));
		board.add(new ColoredProperty("Orange", 14, 180, "St. James Place"));
		board.add(new CardGiver("Community Chest"));
		board.add(new ColoredProperty("Orange", 14, 180, "Tennessee Avenue"));
		board.add(new ColoredProperty("Orange", 16, 200, "New York Avenue"));
		//Free Parking
		board.add(new ColoredProperty("Red", 18, 220, "Kentucky Avenue"));
		board.add(new CardGiver("Chance"));
		board.add(new ColoredProperty("Red", 18, 220, "Indiana Avenue"));
		board.add(new ColoredProperty("Red", 20, 240, "Illinois Avenue"));
		board.add(new RR("B. & O. Railroad"));
		board.add(new ColoredProperty("Yellow", 22, 260, "Atlantic Avenue"));
		board.add(new ColoredProperty("Yellow", 22, 260, "Ventor Avenue"));
		board.add(new Utility(150, "Water Works"));
		board.add(new ColoredProperty("Yellow", 24, 280, "Marvin Gardens"));
		//jail dude
		board.add(new ColoredProperty("Green", 26, 300, "Pacific Avenue"));
		board.add(new CardGiver("Community Chest"));
		board.add(new ColoredProperty("Green", 26, 300, "North Carolina Avenue"));
		board.add(new ColoredProperty("Green",28, 320, "Pennsylvania Avenue"));
		board.add(new RR("Short Line"));
		board.add(new CardGiver("Chance"));
		board.add(new ColoredProperty("Blue", 35, 350, "Park Place"));
		// Luxury Tax
		board.add(new ColoredProperty("Blue", 50, 400, "Boardwalk"));
	}
}
