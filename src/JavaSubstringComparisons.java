public class JavaSubstringComparisons {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		String[] subStr = new String[s.length() - (k - 1)];
		subStr[0] = s.substring(0, k);

		// adding all substrings to a array
		for (int i = 1; i < subStr.length; i++) {
			subStr[i] = s.substring(i, i + k);
		}

		// using bubble sort for lexicographically element order
		for (int i = 0; i < subStr.length; i++) {
			for (int j = 0; j < subStr.length - i - 1; j++) {
				if (subStr[j].compareTo(subStr[j + 1]) > 0) {
					String temp = subStr[j];
					subStr[j] = subStr[j + 1];
					subStr[j + 1] = temp;
				}
			}
		}

		smallest = subStr[0];
		largest = subStr[subStr.length - 1];

		return smallest + "\n" + largest;
	}
}
