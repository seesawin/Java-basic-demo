package tw.com.seesawin.ex07.Static;

class StaticBlock {
	static {
		System.out.print("A");
	}
	public StaticBlock() {
		System.out.print("B");
	}
	static {
		System.out.print("C");
	}
}
public class Static2 {
	static {
		System.out.print("D");
	}
	public static void main(String[] args) {
		System.out.print("E");
		StaticBlock t = new StaticBlock();
		System.out.print("F");
	}
	static {
		System.out.print("G");
	}
}
