//inheritance and access modifier
package tw.com.seesawin.ex07.AccessModifiers.package2;

import tw.com.seesawin.ex07.AccessModifiers.package1.*;

public class Child2 extends Father {
	public void aMethod() {
//	    System.out.println("public    , p="+ this.p);
//	    System.out.println("protected , q="+ this.q);
//	    System.out.println("default   , r="+ this.r);
//	    System.out.println("private   , s="+ this.s);
//
//	    this.publicMethod();
//	    this.protectedMethod();
//	    this.defaultMethod();
//	    this.privateMethod();
	}
	public void bMethod() {
		Father obj = new Father();
//	    System.out.println("public    , p="+ obj.p);
//	    System.out.println("protected , q="+ obj.q);
//	    System.out.println("default   , r="+ obj.r);
//	    System.out.println("private   , s="+ obj.s);
//
//	    obj.publicMethod();
//	    obj.protectedMethod();
//	    obj.defaultMethod();
//	    obj.privateMethod();
	}
}
