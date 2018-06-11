package tw.com.seesawin.ex04;

//when to use the this keyword
class TestClass {
	private String name;
	public void setName(String name) {
		name = name;
	}
	public void show() {
		System.out.println("name=" + name);
	}
}

public class Expression2 {
	public static void main(String[] ags) {
		TestClass t = new TestClass();
		t.setName("Michael");
		t.show();
	}
}
