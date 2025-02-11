import java.util.Scanner;

public class JavaStringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		String rstr = "";
		char ch;
		for (int i = 0; i < A.length(); i++) {
			ch = A.charAt(i);
			rstr = ch + rstr;
		}
		if (A.compareTo(rstr) == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
