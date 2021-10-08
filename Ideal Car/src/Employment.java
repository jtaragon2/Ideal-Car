import java.util.Scanner;

public class Employment
	{
		private static Scanner intGetter = new Scanner(System.in);
		private static int diffChoice;
		private static int num1;
		private static int num2;
		
		public static void addition()
			{
				System.out.println(
						"What difficulty do you want? \nChoose from 1-5\nDifficulty 1 earns $100; Difficulty 5 earns $500");
				diffChoice = intGetter.nextInt();
				if (diffChoice == 1)
					{
						num1 = (int) (Math.random() * 11);
						num2 = (int) (Math.random() * 11);
						System.out.println("Add " + num1 + " and " + num2 + "\nType your answer below");
						if (num1 + num2 == intGetter.nextInt())
							{
								Main.p.addToB(100);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else if (diffChoice == 2)
					{
						num1 = (int) (Math.random() * 90 + 10);
						num2 = (int) (Math.random() * 90 + 10);
						System.out.println("Add " + num1 + " and " + num2 + "\nType your answer below");
						if (num1 + num2 == intGetter.nextInt())
							{
								Main.p.addToB(200);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else if (diffChoice == 3)
					{
						num1 = (int) (Math.random() * 1000) + 10;
						num2 = (int) (Math.random() * 1000) + 10;
						System.out.println("Add " + num1 + " and " + num2 + "\nType your answer below");
						if (num1 + num2 == intGetter.nextInt())
							{
								Main.p.addToB(300);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else if (diffChoice == 4)
					{
						num1 = (int) (Math.random() * 400) + 10;
						num2 = (int) (Math.random() * 4000) + 10;
						System.out.println("Add " + num1 + " and " + num2 + "\nType your answer below");
						if (num1 + num2 == intGetter.nextInt())
							{
								Main.p.addToB(400);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else
					{
						num1 = (int) (Math.random() * 6000) + 10;
						num2 = (int) (Math.random() * 6000) + 10;
						System.out.println("Add " + num1 + " and " + num2 + "\nType your answer below");
						if (num1 + num2 == intGetter.nextInt())
							{
								Main.p.addToB(500);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				System.out.println("Your balance is: $" + Main.p.getBalance());
			}
			
		public static void subtraction()
			{
				System.out.println(
						"What difficulty do you want? \nChoose from 1-5\nDifficulty 1 earns $100; Difficulty 5 earns $500");
				diffChoice = intGetter.nextInt();
				if (diffChoice == 1)
					{
						num1 = (int) (Math.random() * 11);
						num2 = (int) (Math.random() * 11);
						System.out.println("Subtract " + num2 + " from " + num1 + "\nType your answer below");
						if (num1 - num2 == intGetter.nextInt())
							{
								Main.p.addToB(100);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else if (diffChoice == 2)
					{
						num1 = (int) (Math.random() * 90 + 10);
						num2 = (int) (Math.random() * 90 + 10);
						System.out.println("Subtract " + num2 + " from " + num1 + "\nType your answer below");
						if (num1 - num2 == intGetter.nextInt())
							{
								Main.p.addToB(200);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else if (diffChoice == 3)
					{
						num1 = (int) (Math.random() * 1000) + 10;
						num2 = (int) (Math.random() * 1000) + 10;
						System.out.println("Subtract " + num2 + " from " + num1 + "\nType your answer below");
						if (num1 - num2 == intGetter.nextInt())
							{
								Main.p.addToB(300);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else if (diffChoice == 4)
					{
						num1 = (int) (Math.random() * 400) + 10;
						num2 = (int) (Math.random() * 4000) + 10;
						System.out.println("Subtract " + num2 + " from " + num1 + "\nType your answer below");
						if (num1 - num2 == intGetter.nextInt())
							{
								Main.p.addToB(400);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else
					{
						num1 = (int) (Math.random() * 6000) + 10;
						num2 = (int) (Math.random() * 6000) + 10;
						System.out.println("Subtract " + num2 + " from " + num1 + "\nType your answer below");
						if (num1 - num2 == intGetter.nextInt())
							{
								Main.p.addToB(500);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				System.out.println("Your balance is: $" + Main.p.getBalance());
			}
			
		public static void multiplication()
			{
				System.out.println(
						"What difficulty do you want? \nChoose from 1-3\nDifficulty 1 earns $1000; Difficulty 2 earns $2000; Difficulty 3 earns $5000");
				diffChoice = intGetter.nextInt();
				if (diffChoice == 1)
					{
						num1 = (int) (Math.random() * 11);
						num2 = (int) (Math.random() * 11);
						System.out.println("Multiply " + num2 + " by " + num1 + "\nType your answer below");
						if (num1 * num2 == intGetter.nextInt())
							{
								Main.p.addToB(1000);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else if (diffChoice == 2)
					{
						num1 = (int) (Math.random() * 41) + 15;
						num2 = (int) (Math.random() * 11);
						System.out.println("Multiply " + num2 + " by " + num1 + "\nType your answer below");
						if (num1 * num2 == intGetter.nextInt())
							{
								Main.p.addToB(2000);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else
					{
						num1 = (int) (Math.random() * 100) + 15;
						num2 = (int) (Math.random() * 50) + 15;
						System.out.println("Multiply " + num2 + " by " + num1 + "\nType your answer below");
						if (num1 * num2 == intGetter.nextInt())
							{
								Main.p.addToB(5000);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
			}
			
		public static void division()
			{
				System.out.println(
						"What difficulty do you want? \nChoose from 1-3\nDifficulty 1 earns $2000; Difficulty 2 earns $5000; Difficulty 3 earns $10000");
				diffChoice = intGetter.nextInt();
				if (diffChoice == 1)
					{
						num1 = (int) (Math.random() * 110) + 15;
						num2 = (int) (Math.random() * 11);
						System.out.println("Divide " + num1 + " by " + num2
								+ "\nRound down to the nearest whole number\nType your answer below");
						if (num1 / num2 == intGetter.nextInt())
							{
								Main.p.addToB(2000);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else if (diffChoice == 2)
					{
						num1 = (int) (Math.random() * 1000) + 15;
						num2 = (int) (Math.random() * 11);
						System.out.println("Divide " + num1 + " by " + num2
								+ "\nRound down to the nearest whole number\nType your answer below");
						if (num1 / num2 == intGetter.nextInt())
							{
								Main.p.addToB(5000);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
				else
					{
						num1 = (int) (Math.random() * 10000) + 150;
						num2 = (int) (Math.random() * 50) + 15;
						System.out.println("Divide " + num1 + " by " + num2
								+ "\nRound down to the nearest whole number\nType your answer below");
						if (num1 / num2 == intGetter.nextInt())
							{
								Main.p.addToB(10000);
							}
						else
							{
								System.out.println("You were wrong.\nNo money for you");
							}
					}
			}
	}
