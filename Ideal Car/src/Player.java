import java.util.ArrayList;

public class Player
	{
		private String name;
		private int balance;
		private ArrayList <Car> carCollection = new ArrayList<Car>();
		
		public Player(String n, int b)
			{
				name = n;
				balance = b;
				
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getBalance()
			{
				return balance;
			}

		public void setBalance(int balance)
			{
				this.balance = balance;
			}

		public Car getCarFromCollection(int i)
			{
				return carCollection.get(i);
			}
		public void addCarToCollection(Car c) {
			carCollection.add(c);
		}
		public void addToB(int bastard) {
			balance += bastard;
		}
		
	}
