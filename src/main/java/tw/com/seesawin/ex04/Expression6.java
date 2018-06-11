package tw.com.seesawin.ex04;

//1. run with no argument
//2. run with all kinds of argument

public class Expression6 {
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(i + ":" + args[i]);
		}

	}
}
