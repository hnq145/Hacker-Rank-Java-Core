import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JavaArraylist {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// Array data
		int line = Integer.parseInt(reader.readLine());
		ArrayList list = new ArrayList<>();
		for (int i = 0; i < line; i++) {
			list.add(reader.readLine());
		}
		// Array request
		int count = Integer.parseInt(reader.readLine());
		ArrayList queries = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			queries.add(reader.readLine());
		}
		// write your code here
		for (int i = 0; i < queries.size(); i++) {
			String queri = (String) queries.get(i);
			String[] quer = queri.split(" ");
			int[] que = new int[2];
			for (int j = 0; j < quer.length; j++) {
				que[j] = Integer.parseInt(quer[j]);
			}
			if (que[0] <= list.size()) {
				String lis = (String) list.get(que[0] - 1);
				String[] li = lis.split(" ");
				int[] l = new int[li.length];
				for (int j = 0; j < l.length; j++) {
					l[j] = Integer.parseInt(li[j]);
				}
				if (que[1] <= l[0] && l[0] > 0) {
					System.out.println(l[que[1]]);
				} else {
					System.out.println("ERROR!");
				}
			} else {
				System.out.println("ERROR!");
			}
		}
		reader.close();
	}
}
