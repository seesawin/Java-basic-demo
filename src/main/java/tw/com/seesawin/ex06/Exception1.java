package tw.com.seesawin.ex06;

import java.net.*;

public class Exception1 {
	public static void main(String[] args) {
		CallStackTest cs = new CallStackTest();
		cs.first();
	}
}

class CallStackTest {
	public void first() {
		System.out.println("first before call");
		second();
		System.out.println("first after call");
	}

	public void second() {
		System.out.println("second before call");
		third();
		System.out.println("second after call");
	}

	public void third() {
		System.out.println("third before call");
		forth();
		System.out.println("third after call");
	}

	public void forth() {
		System.out.println("forth before throw");
		throw new RuntimeException();
		// new URL("http://tw.yahoo.com");

	}
}
