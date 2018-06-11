package tw.com.seesawin.ex07.Static;

//static member and static method
class Static1Test {
	public String instanceAttr = "instance";
	public static String staticAttr = "static";

	public Static1Test(String instanceAttr) {
		this.instanceAttr = instanceAttr;
	}

	public void instanceMethod() {
		System.out.println("instanceAttr=" + instanceAttr);
		System.out.println("staticAttr=" + staticAttr);
	}

	public static void staticMethod() {
		// System.out.println("instanceAttr="+ instanceAttr);
		System.out.println("staticAttr=" + staticAttr);
	}
}

public class Static1 {
	public static void main(String[] ags) {

		// static method, don't need an object
		Static1Test.staticMethod();
		System.out.println("--------------------");

		Static1Test st1 = new Static1Test("instance:st1");
		st1.instanceMethod();
		Static1Test st2 = new Static1Test("instance:st2");
		st2.instanceMethod();
		System.out.println("--------------------");

		st1.instanceAttr = "changed";
		st1.staticAttr = "changed";

		st1.instanceMethod();
		st2.instanceMethod();
	}
}
