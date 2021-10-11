import java.util.Scanner;

import java.util.ArrayList;

public class Main
	{
		public static ArrayList<Car> CarList = new ArrayList<Car>();
		public static Player p = new Player(null, 0);
		private static Scanner stringGetter = new Scanner(System.in);
		private static Scanner intGetter = new Scanner(System.in);
		private static boolean funTimes = true;
		private static int workC;
		private static boolean atWork=true;
		private static int homeC;
		
		public static void main(String[] args)
			{
				ogListFiller();
				playerMaker();
				gamePlayer();
				
			}
			
// Car datatype order: int weight, int horsepower, int torque, int wheelbase, string color, double top speed,
// string make, string model, int year, string nickname, int miles, int price
		private static void ogListFiller()
			{
				CarList.add(new Car(3950, 183, 217, 105, "silver", 129.5, "Toyota", "4runner v6", 1998, "Old Man",
						280000, 3400));
				CarList.add(new Car(3529, 185, 163, 103, "maroon", 120, "Honda", "CR-V", 2014, "Steve", 130967, 15000));
				CarList.add(new Car(2459, 125, 125, 97, "red", 115, "Toyota", "Corolla", 2000, "C O R O L L A", 300000,
						5000));
				CarList.add(new Car(3015, 160, 146, 104, "silver", 120, "Ford", "Focus", 2012, "Andrewmobile", 165000,
						6000));
				CarList.add(new Car(4608, 250, 253, 109, "Black", 125, "Honda", "Pilot", 2014, "Jimmi", 150000, 22000));
				CarList.add(new Car(5169, 360, 380, 135, "Silver", 92, "Ford", "F-150", 2012, "The Gas Guzzler", 223000,
						8000));
				CarList.add(
						new Car(4120, 215, 222, 119, "White", 116, "Toyota", "Sienna", 2006, "Papa Car", 250000, 4500));
				CarList.add(new Car(4927, 329, 325, 117, "Gray", 145, "Audi", "Q7", 2019, "Da Beast", 15000, 54500));
				System.out.println("These are the available cars: \n");
				
				listPrinter(CarList);
			}
			
		private static void listPrinter(ArrayList<Car> a)
			{
				for (int i = 0; i < a.size(); i++)
					{
						System.out.println("Car " + (i + 1));
						System.out.println("This car is a " + a.get(i).getMake() + " " + a.get(i).getModel());
						System.out.println("The car's nickname is: " + a.get(i).getNickname());
						System.out.println("It is the color " + a.get(i).getColor());
						System.out.println("It was made in " + a.get(i).getYear());
						System.out.println("It has " + a.get(i).getHorsepower() + " horsepower and "
								+ a.get(i).getTorque() + " lb-ft of torque");
						if (a.get(i).getPrice() == 0)
							{
								System.out.println("It is already owned");
							}
						else
							{
								System.out.println("It costs $" + a.get(i).getPrice());
							}
						System.out.println();
					}
					
			}
			
		private static void playerMaker()
			{
				System.out.println("Enter your name below");
				p.setName(stringGetter.nextLine());
				p.addCarToCollection(
						new Car(3600, 170, 175, 103, "white", 118.0, "Nissan", "rogue", 2017, "Tom", 29027, 0));
				System.out.println("What do you want the nickname of your Nissan Rogue to be?");
				p.getCarFromCollection(0).setNickname(stringGetter.nextLine());
				
			}
			
		public static void carBuyer(int bc)
			{
				
				if (p.getBalance() >= CarList.get(bc).getPrice())
					{	
						CarList.get(bc).setPrice(0);
						p.subFromB(CarList.get(bc).getPrice());
						p.addCarToCollection(CarList.get(bc));
						CarList.remove(bc);
					}
				else
					{
						System.out.println("You don't have enough money to do that.");
					}
			}
			
		private static void gamePlayer()
			{
				System.out.println("In this game, you can earn money to buy cars by completing mathmatical operations");
				home();
				
			}
			
		private static void work()
			{
				do
					{
						System.out.println(
								"Would you like to do addition (1), subtraction (2), multiplication (3), division (4), or go home (5)?");
						workC = intGetter.nextInt();
						if (workC == 1)
							{
								Employment.addition();
							}
						else if (workC == 2)
							{
								Employment.subtraction();
							}
						else if (workC == 3)
							{
								Employment.multiplication();
							}
						else if (workC == 4)
							{
								Employment.division();
							}
						else
							{
								atWork = false;
								System.out.println("You are at home");
							}
					} while (atWork);
					
			}
			
		private static void home()
			{
				
				do
					{
						System.out.println(p.getName()
								+ ", do you want to \n(1) print your collection\n(2) see the unpurchased collection\n(3) see your balance\n(4) buy a car\n(5) go to work\n(0) end the game");
						homeC = intGetter.nextInt();
						if (homeC == 0)
							{
								System.exit(0);
							}
						else if (homeC == 1)
							{
								listPrinter(p.getCollection());
							}
						else if (homeC == 2)
							{
								listPrinter(CarList);
							}
						else if (homeC == 3)
							{
								System.out.println("Your balance is: $" + p.getBalance());
							}
						else if (homeC == 4)
							{
								System.out.println("Which car do you want to buy?");
								carBuyer(intGetter.nextInt()-1);
							}
						else
							{
								atWork=true;
								work();
							}
							
					} while (funTimes);
			}
	}
