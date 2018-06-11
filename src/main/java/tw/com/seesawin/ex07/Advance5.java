package tw.com.seesawin.ex07;

//1. class must be abstract if there is one abstract method
//2. abstract class can have normal method and attribute
//3. abstract class can have no abstract method

public class Advance5 {
	public static void main(String[] args) {
		// Advance5Class a = new Advance5Class();
	}
}

abstract class Advance5Class {
	private int i = 0;
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}

//	public abstract void aMethod();

	//no implementation allowed
//	public abstract void bMethod() {}

	//abstract method can not have private, final, static modifiers
//	private abstract void cMethod();
//	public final abstract void dMethod();
//	public static abstract void eMethod();

}
