import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
	public class Main {

		public static void main(String[] args) {

			Locale.setDefault(Locale.getDefault());

			Scanner sc = new Scanner(System.in);

			try {
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				System.out.println(n1 / n2);
			} catch (InputMismatchException e) {
				System.out.println("java.util.InputMismatchException");
			} catch (ArithmeticException e) {
				System.out.println("java.lang.ArithmeticException: / by zero");
			}
			sc.close();
		}
	}

}
