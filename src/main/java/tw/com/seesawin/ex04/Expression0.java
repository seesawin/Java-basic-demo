package tw.com.seesawin.ex04;

//object reference and object
public class Expression0 {
	public static void main(String[] args) {

		// two TV
		Toshiba remote = new Toshiba("TV1", 56, 10);
		Toshiba remote1 = new Toshiba("TV2", 48, 15);

		remote.show();
		System.out.println("----------------------");

		remote1.show();
		System.out.println("----------------------");

		remote.setChannel(60);
		remote.setVolume(5);

		remote1.setChannel(61);
		remote1.setVolume(20);

		remote.show();
		System.out.println("----------------------");

		remote1.show();
		System.out.println("----------------------");

		// one TV
		Toshiba remote3 = new Toshiba("TV3", 56, 10);
		Toshiba remote4 = remote3;

		remote3.show();
		System.out.println("----------------------");

		remote4.show();
		System.out.println("----------------------");

		remote3.setChannel(60);
		remote3.setVolume(5);
		remote3.show();
		System.out.println("----------------------");

		remote4.show();

	}
}

class Toshiba {
	private String name;
	private int channel;
	private int volume;

	public Toshiba(String n, int c, int v) {
		name = n;
		channel = c;
		volume = v;
	}

	public void setChannel(int c) {
		channel = c;
	}

	public void setVolume(int v) {
		volume = v;
	}

	public void show() {
		System.out.println(name + " is on channel " + channel);
		System.out.println(name + "'s volume is " + volume);
	}
}
