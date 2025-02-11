import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {
	static int B;
	static int H;
	static Scanner scan = new Scanner(System.in);

	static {
		B = scan.nextInt();
		H = scan.nextInt();
		try {
			if (B <= 0 || H <= 0) {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		boolean flag = false;
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main
}
