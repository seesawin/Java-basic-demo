package tw.com.seesawin.ex04.Scope;

//variable scope
public class Local {
	public static void main(String[] args) {
/*
		// local variable must initialized before use
		int i;
		// System.out.println("i="+i); //must initialize before use

		// local variable scope
		{
			int i = 10;
			System.out.println("inside block, i=" + i);
		}
		// System.out.println("after block, i="+ i); //no i here
		System.out.println("-----------------------");

		// local variable can't have the same name
		int i = 100;
		{
			// int i = 10; //illegal
		}

		// inner scope => outter scope
		int i = 100;
		{
			int j = 10;
			System.out.println("inside block, j=" + j + ", i=" + i);
		}
		System.out.println("outside block, i=" + i);

		// shadowing
		Shadow s = new Shadow();
		s.aMethod();
*/
	}
}

// shadowing
class Shadow {
	public int i = 100;

	public void aMethod() {
		int i = 5;
		System.out.println(i);
	}

}
