package tw.com.seesawin.ex03;

public class Cat1 {
	// change to private
	public int age = 2;
	public double weight = 4.5;
	public String name = "sammy";

	private void getDetail() {
		System.out.println("age=" + age);
		System.out.println("weight=" + weight);
		System.out.println("name=" + name);
	}

	public void meow() {
		System.out.println("meow");
		getDetail();
	}

	// arguement, no return type
	public void answerCall(String caller) {
		meow();
		System.out.println(caller);
	}

	// arguement and return type
	public int feed(int amount) {
		System.out.println("Yum..");
		return amount - 1;
	}
}