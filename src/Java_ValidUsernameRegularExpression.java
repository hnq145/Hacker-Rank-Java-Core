import java.util.*;

public class Java_ValidUsernameRegularExpression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // Consume the newline character after reading n

		for (int i = 1; i <= n; i++) {
			String userName = sc.nextLine();

			try {
				if (userName.matches("^[a-zA-Z][a-zA-Z0-9_]{7,29}$")) {
					System.out.println("Valid");
				} else {
					System.out.println("Invalid");
				}
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}
	}
}