package tw.com.seesawin.ex01;

//primitive literal
public class Start2 {
	public static void main(String[] args) {

		// out of range
		byte b1 = 127;
		// byte b2 = 128;

		short s = 200;
		System.out.println("s=" + s);

		int i = 20;

		long l = 100L;
		long l1 = 100l;
		long l2 = 100;

		System.out.println("------------------");

		double d = 100.0;
		double d1 = 100.0D;
		double d2 = 100.0d;

		float f1 = 100.0F;
		float f2 = 100.0f;

		System.out.println("------------------");

		char c = 'c';
		char c1 = '\u99ac';
		System.out.println("c1=" + c1);
		
		String st = "this is a string literal";
		System.out.println("------------------");

		boolean t = true;
		boolean f = false;
		// boolean o = 1;
	}
}
