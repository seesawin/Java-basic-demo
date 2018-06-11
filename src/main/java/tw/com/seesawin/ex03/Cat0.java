package tw.com.seesawin.ex03;

public class Cat0 {
	public int age = 3;
	public double weight = 4.5;
	public String name = "sammy";

	// no arguement, no return_type
	public void meow() {
		System.out.println("meow");
	}

	// arguement, no return type
	public void answerCall(String caller) {
		System.out.println(caller);
	}

	// arguement and return type
	public int feed(int amount) {
		System.out.println("Yum..");
		return amount - 1;
	}
}