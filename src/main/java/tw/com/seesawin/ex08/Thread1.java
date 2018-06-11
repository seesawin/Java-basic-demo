package tw.com.seesawin.ex08;

//1. higher priority run first
//2. Thread.sleep(long) to enter the block state
//   Thread.yield() to go back to runnable state
//   join() make the caller block till callee finish
//3. after run() the thread dies

public class Thread1 {
	public static void main(String[] args) {
		DemoRunnable r0 = new DemoRunnable("0");
		Thread t0 = new Thread(r0);
		DemoRunnable r1 = new DemoRunnable("1");
		Thread t1 = new Thread(r1);
		DemoRunnable r2 = new DemoRunnable("2");
		Thread t2 = new Thread(r2);
		// t0.setPriority(Thread.MIN_PRIORITY);
		// t1.setPriority(Thread.MAX_PRIORITY);
		// t2.setPriority(Thread.NORM_PRIORITY);

		t0.start();
/*
		 try {
		 	t0.join();
		 } catch(InterruptedException e) {}
*/
		t1.start();
		t2.start();

		// System.out.println("t0.isAlive()="+ t0.isAlive());
		// System.out.println("t1.isAlive()="+ t1.isAlive());
		// System.out.println("t2.isAlive()="+ t2.isAlive());

	}
}

class DemoRunnable implements Runnable {
	private String name;

	public DemoRunnable(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("Thread " + name + " is running");
		for (int i = 0; i < 10; i++) {
			System.out.println(name + ":Hello:" + i);

/*
			 try {
			 	Thread.sleep(1);
			 } catch(InterruptedException e) {}
			 Thread.yield();
*/
		}
	}

}
