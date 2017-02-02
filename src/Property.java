import java.util.*;
public abstract class Property extends Space
	{
		int cost;
		int rent;
		Player owner;
		
		public abstract int rent(Player x, int i);
		public void landedOn(Player y)
		{
			int z = 0;
			if(owner.equals(null))
			{
				System.out.println("Would you like to buy this property");
				Scanner in = new Scanner(System.in);
				System.out.println("1 = yes, 2 = no");
				int x = in.nextInt();
				if(x == 1)
				{
					y.owned.add(this);
					y.removeMoney(cost);
				}
			}
			else
			{
				System.out.println("You have landed on " + this.owner + "'s property");
				y.removeMoney(this.rent(this.owner, z));
				this.owner.addMoney(this.rent(this.owner, z));
				System.out.println("You payed them " + this.rent(this.owner, z) + "owner");
			}
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public int getRent() {
			return rent;
		}
		public void setRent(int rent) {
			this.rent = rent;
		}
		public Player getOwner() {
			return owner;
		}
		public void setOwner(Player owner) {
			this.owner = owner;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
