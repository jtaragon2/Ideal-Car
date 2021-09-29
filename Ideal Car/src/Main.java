import java.util.Scanner;
import java.util.ArrayList;

public class Main
	{
		public static ArrayList<Car> CarList = new ArrayList<Car>();
		
		public static void main(String[] args)
			{
				ogListFiller();
				System.out.println("What's your name?");
				Employment.addition();
				
			}
			
		private static void ogListFiller()
			{
				CarList.add(new Car(0, 0, 0, 0, null, 0, null, null, 0, null));
			}
	}
