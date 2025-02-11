import java.util.Iterator;
import java.util.Scanner;

public class Java_Loops_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			n = sc.nextInt();
		} while (n < 2 || n > 20);
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
}