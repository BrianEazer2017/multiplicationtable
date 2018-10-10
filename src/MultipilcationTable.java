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
		while (counter <= number) {
			System.out.print("     " + counter + "   ");
			counter++;
		}
		System.out.println("");
		
		//The problem with this multiplication table is that when you get to double digits, you should reduce the spaces
		
		for (int i = 1; i <= number; i++) {
			System.out.print(i);
			for (int j = 1; j <= number; j++) {
			if (j!=number) {
			System.out.print("    " + (i*j) + "    ");
			} else {
				System.out.println("    " + (i*j) + "    ");
			}
		}	
		
		}
	}

}
