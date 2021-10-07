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
		private static boolean atWork;
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
				System.out.println("In this game, you can earn money to buy cars by completing mathmatecal operations");
				do
					{
						home();
						
					} while (funTimes);
			}
			
		private static void work()
			{
				do {
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
					}else {
						atWork=false;
					}
				}while(atWork);
			}
		private static void home() {
		work();	
		}
	}
