import java.util.Scanner;

public class Java_Int_to_String {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		if (user.hasNextInt()) {
			int input = user.nextInt();
			String digits = Integer.toString(input);
			System.out.println("Good job");
		} else {
			System.out.println("Wrong input. Please enter a valid digit.");
		}
		user.close();
	}
}