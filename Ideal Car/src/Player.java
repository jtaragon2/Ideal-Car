import java.util.ArrayList;

public class Player
	{
		private String name;
		private int balance;
		private ArrayList <Car> carCollection = new ArrayList<Car>();
		
		public void Player(String n, int b)
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
	}
