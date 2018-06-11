//inheritance and access modifier
package tw.com.seesawin.ex07.AccessModifiers.package1;

public class Father {
	public int p = 1;
	protected int q = 1;
	int r = 1;
	private int s = 1;

	public void publicMethod() {
		System.out.println("publicMethod()");
	}
	protected void protectedMethod() {
		System.out.println("protectedMethod()");
	}
	void defaultMethod() {
		System.out.println("defaultMethod()");
	}
	private void privateMethod() {
		System.out.println("privateMethod()");
	}
	public void aMethod() {
	    System.out.println("public    , p="+ this.p);
	    System.out.println("protected , q="+ this.q);
	    System.out.println("default   , r="+ this.r);
	    System.out.println("private   , s="+ this.s);

	    this.publicMethod();
	    this.protectedMethod();
	    this.defaultMethod();
	    this.privateMethod();
	}
	public void bMethod() {
		Father obj = new Father();
	    System.out.println("public    , p="+ obj.p);
	    System.out.println("protected , q="+ obj.q);
	    System.out.println("default   , r="+ obj.r);
	    System.out.println("private   , s="+ obj.s);

	    obj.publicMethod();
	    obj.protectedMethod();
	    obj.defaultMethod();
	    obj.privateMethod();
	}
}
