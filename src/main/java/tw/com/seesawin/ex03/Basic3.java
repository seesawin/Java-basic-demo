package tw.com.seesawin.ex03;

//method signature
public class Basic3 {
	public void aMethod(String s, int i) {
		System.out.println("void aMethod(String, int)");
	}

	// different argument type, different signature
	public void aMethod(String s, double d) {
		System.out.println("void aMethod(String, double)");
	}

	// different argument count, different signature
	public void aMethod(String s, int i, String s1) {
		System.out.println("void aMethod(String, int, String)");
	}

	// different argument order, different signature
	public void aMethod(int i, String s) {
		System.out.println("void aMethod(int, String)");
	}
/*
	// different return type not allowed
	public int aMethod(String s, int i) {
		System.out.println("int aMethod(String, int)");
	}

	// different access modifier not allowed
	protected void aMethod(String s, int i) {
		System.out.println("void aMethod(String, int)");
	}
*/
}
