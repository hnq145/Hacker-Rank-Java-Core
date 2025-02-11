import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class JavaPrimalityTest {
	public static void main(String[] args) throws IOException {
		int n;

		// BigInteger num = new BigInteger(n);

		// var for true if prime and not if false
		Boolean prime = false;

		// method written in BigInteger class
		// prime = num.isProbablePrime(1);
		if (prime == true) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
