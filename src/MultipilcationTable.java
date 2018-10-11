import java.util.Scanner;

public class MultipilcationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = 0;
		if (sc.hasNextInt()) {
		number = sc.nextInt();
		}
		else {
			System.out.println("Oops. Try again, hombre.");
			input();
		}
		displayMultiplcationTable(number);
	}
	private static void displayMultiplcationTable(int number) {
		// TODO Auto-generated method stub
		int counter = 1;
		System.out.print("     ");
		while (counter <= number) {
			// Assumption: The user will not input a number with more than 4 digits. If the user were to input a number with more 
			// digits I'd have to change the printf specification.
			// printf changes the amount of space based off the number of digits and left justifies the number.
			System.out.printf("%-5d", counter);
			counter++;
		}
		System.out.println("");
		
		
		
		for (int i = 1; i <= number; i++) {
			// This right justifies the number
			
			System.out.printf("%-5d", i);
			
			
			for (int j = 1; j <= number; j++) {
				// The if statement checks to see if you need a new line after the specific entry
				System.out.printf("%-5d", i*j);
				
				if (j == number) {
					System.out.printf("\n");
				}
				else {
					continue;
				}
			}
		}
	}
}
