import java.util.*;

public class JavaAbstractClass {
	abstract class book {
		String tiTle;

		abstract void setTitle(String s);

		String getTitle() {
			return tiTle;
		}
	}

	class Mybook extends book {

		void setTitle(String s) {
			this.tiTle = s;
		}
	}

	public class oops3 {

		public static void main(String[] args) {

//	Mybook d=new Mybook();
//	Scanner sc= new Scanner(System.in);
//	 String ti=sc.nextLine();
//	 d.setTitle(ti);
//	 System.out.println("The title is:"+d.getTitle());
//	} 
		}
	}
}
