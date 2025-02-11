import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.
		NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);
		String us = formatUS.format(payment);

		Locale localeIndia = new Locale("en", "IN");
		NumberFormat formatIndia = NumberFormat.getCurrencyInstance(localeIndia);
		String india = formatIndia.format(payment);

		NumberFormat formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = formatChina.format(payment);

		NumberFormat formatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = formatFrance.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
