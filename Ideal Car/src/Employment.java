import java.util.Scanner;
public class Employment
	{
		private static Scanner intGetter = new Scanner(System.in);
		private static int diffChoice;
		private static int num1;
		private static int num2;
		
		public static void addition() {
			System.out.println("What difficulty do you want? \nChoose from 1-5");
			diffChoice = intGetter.nextInt();
			if(diffChoice==1) {
				num1 = (int)Math.random()*11;
				num2 = (int)Math.random()*11;
				System.out.println("Add "+num1+" and "+num2+"\nType your answer below");
				if(num1+num2==intGetter.nextInt()) {
					
				}
			}
		}
	}
