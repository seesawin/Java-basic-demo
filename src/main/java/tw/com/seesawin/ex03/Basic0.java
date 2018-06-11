package tw.com.seesawin.ex03;

//a class to demonstrate method call
public class Basic0 {
	public static void main(String[] args) {
		// access class attribute
		Cat0 c = new Cat0();
		System.out.println("c.age=" + c.age);
		System.out.println("c.weight=" + c.weight);
		System.out.println("c.name=" + c.name);
		System.out.println("--------------------------");

		c.age = 2;
		c.weight = 3.5;
		c.name = "momo";
		System.out.println("c.age=" + c.age);
		System.out.println("c.weight=" + c.weight);
		System.out.println("c.name=" + c.name);
		System.out.println("--------------------------");

		// access class method
		c.meow();
		System.out.println("--------------------------");

		// method with argument
		c.answerCall("samuel");
		System.out.println("--------------------------");

		// method with argument and return value
		int total = c.feed(10);
		System.out.println("total=" + total);

	}
}