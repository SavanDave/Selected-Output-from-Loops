import java.util.Random;
import java.util.Scanner;

public class DiceRolls {

	public static void main(String[] args) {
		double percentage;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the number to count:");
		int number1 = scan.nextInt();
		percentage = rollA(number1);
		System.out.println("The percentage of " + number1 + " is " + percentage + "%.");
	}

	public static double rollA(int number) {
		Random random = new Random();
		int die1, die2, dice, countOfSevens = 0;
		double percent;

		for (int count = 0; count < 10000000; count++) {
			die1 = random.nextInt(6) + 1;
			die2 = random.nextInt(6) + 1;
			dice = die1 + die2;
			
			if (dice == number) {
				countOfSevens++;
			}
		}
		System.out.println("There were " + countOfSevens + " rolled");
		percent = (countOfSevens / 10000000.0) * 100;
		System.out.println("In the Method " + number);
		return percent;
	}
}
