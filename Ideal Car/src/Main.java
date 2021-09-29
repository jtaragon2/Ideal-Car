import java.util.Scanner;
import java.util.ArrayList;

public class Main
	{
		public static ArrayList<Car> CarList = new ArrayList<Car>();
		public static Player p = new Player(null, 0);
		private static Scanner stringGetter = new Scanner(System.in);
		public static void main(String[] args)
			{
				ogListFiller();
				playerMaker();
				System.out.println("What's your name?");
				Employment.addition();

			}

		private static void ogListFiller()
			{
				CarList.add(new Car(0, 0, 0,0, 0, null, 0, null, null, 0, null));
			}

		private static void playerMaker()
			{
				System.out.println("Enter your name below");
				p.setName(stringGetter.nextLine());
				p.setBalance(0);
				p.addCarToCollection(new Car(3600, 170, 175, 103, 0, null, 0, null, null, 0, null));
			}
	}
