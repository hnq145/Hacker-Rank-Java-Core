import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Java_ReflectionAttributes {
	public static <Student> void main(String[] args) {
		Class<Student> student = null;
		Method[] methods = student.getDeclaredMethods();

		ArrayList<String> methodList = new ArrayList<>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}
		// Note: Error
//		Collection.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}
}
