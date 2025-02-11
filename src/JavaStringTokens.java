import java.util.Scanner;

public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s = s.trim();// To remove leading/trailing zeroes. Somehow otherwise wrong answer with
						// split()
		if (s.isEmpty())
			System.out.println(0);
		else {
			// String tokens[] = s.split("[\\s!,?._'@]+");
			// \\s means regex for single space character
			// [abc] means any of the characters a,b or c
			// X+ means occurence of X one or more times

			// OR
			String tokens[] = s.split("[^a-zA-Z]+");
			// [a-zA-Z] means regex for any character from a-z or A-Z
			// [^abc] means regex for any character other than a, b or c

			System.out.println(tokens.length);
			for (String token : tokens)
				System.out.println(token);
		}
		scan.close();
	}
}
