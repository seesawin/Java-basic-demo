package tw.com.seesawin.ex04.Scope.package1;

public class Class1 {
	public int i = 1;
	private int j = 2;
	int k = 3;
	public void publicMethod() {
		System.out.println("public");
	}
	private void privateMethod() {
		System.out.println("private");
	}
	void defaultMethod() {
		System.out.println("default");
	}

	public void aMethod() {
	    System.out.println("this.i="+ this.i);
	    System.out.println("this.j="+ this.j);
	    System.out.println("this.k="+ this.k);
	    this.publicMethod();
	    this.privateMethod();
	    this.defaultMethod();
	}
	public void bMethod() {
	    Class1 obj = new Class1();
	    
	    System.out.println("obj.i="+ obj.i);
	    System.out.println("obj.j="+ obj.j);
	    System.out.println("obj.k="+ obj.k);
	    obj.publicMethod();
	    obj.privateMethod();
	    obj.defaultMethod();
	}
}
