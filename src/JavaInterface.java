import java.io.*;
import java.util.*;

public class JavaInterface {
	interface AdvancedArithmetic {

		int divisor_sum(int n);
	}

	class MyCalculator implements AdvancedArithmetic {

		@Override
		public int divisor_sum(int d) {
			int m = d, n = d, total = 0;
			while (n-- != 0) {
				if (d % m == 0)
					total += d / m;
				m--;
			}

			return total;
		}
	}

	public class Solution {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

//	    MyCalculator mC = new MyCalculator();
//
//	    int result  = mC.divisor_sum(sc.nextInt());
//	    String str = mC.getClass().getAnnotatedInterfaces()[0].toString();
//
//	    System.out.println("I implemented: " + str.substring(str.lastIndexOf('.') + 1));
//	    System.out.println(result);

			sc.close();
		}
	}

}
