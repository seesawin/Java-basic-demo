package tw.com.seesawin.ex07;

class Help {
	public int j = 10;
}
class Advance4Grand {
	public static final int i = 100;
	public final Help h = new Help();
	public final void aMethod() {
		System.out.println("in Advance4Grand");
	}
}
final class Advance4Father extends Advance4Grand {
/*
	// can't override final method
	public final void aMethod() {
		System.out.println("in Advance4Father");
	}
*/
	// final variable still inherited
	public void show() {
		System.out.println("in Advance4Father, i=" + Advance4Grand.i);
		System.out.println("in Advance4Father, h=" + this.h);
		System.out.println("in Advance4Father, h.j=" + this.h.j);
	}
}
/*
// no subclass from a final class
class Advance4Child extends Advance4Father {
}
*/
public class Advance4 {
	public static void main(String[] args) {
		Advance4Father ff = new Advance4Father();
		ff.show();
		System.out.println("----------------------------");

		// ff.i=1;
		// ff.h=new Help();
		ff.h.j = 100;
		ff.show();
	}
}
