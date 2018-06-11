package tw.com.seesawin.ex07;

public class Advance2 {
	public static void main(String[] args) {
		Advance2Child c = new Advance2Child();
		c.testSuper();
	}
}
class Advance2Father {
	public int i = 10;
	public void aMethod() {
		System.out.println("aMethod() in Advance2Father");
	}
}

class Advance2Child extends Advance2Father {
	public int i = 100;
	public void aMethod() {
		System.out.println("aMethod() in Advance2Child");
	}
	public void testSuper() {
		System.out.println("super.i=" + super.i);
		System.out.println("this.i=" + this.i);
		super.aMethod();
		this.aMethod();
	}
}
