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
					}else if(diffChoice ==2) {
						num1 = (int) (Math.random() * 90+10);
						num2 = (int) (Math.random()* 90+10);
						System.out.println("Add " + num1 + " and " + num2 + "\nType your answer below");
						if (num1 + num2 == intGetter.nextInt())
							{
								Main.p.addToB(200);
							}
					}else if(diffChoice ==3) {
						num1 = (int) (Math.random() * 1000)+10;
						num2 = (int) (Math.random() * 1000)+10;
						System.out.println("Add " + num1 + " and " + num2 + "\nType your answer below");
						if (num1 + num2 == intGetter.nextInt())
							{
								Main.p.addToB(300);
							}
					}else if(diffChoice ==4) {
						num1 = (int) (Math.random() * 400)+10;
						num2 = (int) (Math.random() * 4000)+10;
						System.out.println("Add " + num1 + " and " + num2 + "\nType your answer below");
						if (num1 + num2 == intGetter.nextInt())
							{
								Main.p.addToB(400);
							}
					}else {
						num1 = (int) (Math.random() * 6000) + 10;
						num2 = (int) (Math.random() * 6000) + 10;
						System.out.println("Add " + num1 + " and " + num2 + "\nType your answer below");
						if (num1 + num2 == intGetter.nextInt())
							{
								Main.p.addToB(500);
							}
					}
				System.out.println("Your balance is: $"+ Main.p.getBalance());
			}
		
		
	}
