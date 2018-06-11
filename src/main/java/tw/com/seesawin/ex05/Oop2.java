package tw.com.seesawin.ex05;


public class Oop2 {
	public static void main(String[] args) {
		
		Super obj1 = new Super();
		obj1.aMethod();
		
		Sub obj2 = new Sub();
		obj2.aMethod();
		
		Super obj3 = new Sub();
		obj3.aMethod();
	}
}

class Super {
	public void aMethod() {
		System.out.println("super");
	}
}
class Sub extends Super {
	public void aMethod() {
		System.out.println("sub");
	}
}