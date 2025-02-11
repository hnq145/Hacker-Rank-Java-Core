import java.io.*;
import java.util.*;

public class JavaGenerics {
	public static void main(String[] args) {

		Integer arr1[] = { 1, 2, 3 };
		String arr2[] = { "Hello", "World" };
		Printer<Integer> print1 = new Printer<>(arr1);
		// print1.print();
		Printer<String> print2 = new Printer<>(arr2);
		// print2.print();

	}

	public static class Printer<T> {
		T[] thingtoprint;

		public Printer(T[] thingtoprint) {
			this.thingtoprint = thingtoprint;
			for (T i : thingtoprint) {
				System.out.println(i);
			}
		}
		// public void print(){
		// for(T i :thingtoprint){
		// System.out.println(i);
		// }
		// }
	}
}
