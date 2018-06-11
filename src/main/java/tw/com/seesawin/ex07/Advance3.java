package tw.com.seesawin.ex07;

//1. constructor not inherited
//2. use super to call parent constructor
//3. no super, no this => implicit super() in the beginning
//   no super() then compile time error
class GrandFather extends Object {
	public GrandFather() {
		System.out.println("Creating GrandFather()");
	}
	public GrandFather(int i) {
		System.out.println("Creating GrandFather(int)");
	}
}
class Father extends GrandFather {
	public Father() {
		System.out.println("Creating Father()");
	}
	public Father(double d) {
		System.out.println("Creating Father(double)");
	}
}
class Son extends Father {
	public Son(String s) {
		System.out.println("Creating Son(String)");
	}
	public Son(char c) {
		this("AAA");

		// 1. constructor not inherited, no this(int), this(double) here
		// this(10);
		// this(10.0);
/*
		// super must be the first line
		super(10.0);
		System.out.println("Creating Son(char)");
*/
	}
}

public class Advance3 {
	public static void main(String[] args) {
		Son s = new Son("test");
	}
}
