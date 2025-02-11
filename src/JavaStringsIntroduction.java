import java.util.Scanner;

public class JavaStringsIntroduction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		System.out.println(A.length() + B.length());
		if (A.charAt(0) <= B.charAt(0)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		String s = "";
		String m = "";
		for (int i = 0; i < A.length(); i++) {
			if (i == 0) {

				char b = A.charAt(0);
				m = "" + b;
				continue;
			}
			s += A.charAt(i);

		}
		String k = "";
		String l = "";

		for (int j = 0; j < B.length(); j++) {
			if (j == 0) {

				char x = B.charAt(0);
				k = "" + x;
				continue;
			}
			l += B.charAt(j);

		}
		System.out.println(m.toUpperCase() + s + " " + k.toUpperCase() + l);

	}

}
