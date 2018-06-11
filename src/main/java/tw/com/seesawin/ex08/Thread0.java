package tw.com.seesawin.ex08;

//1. create Thread:
//   implements java.lang.Runnable
//   extends java.lang.Thread
//2. must call start to enter runnable state

public class Thread0 {
  public static void main(String[] args) {
    Thread t0 = new Thread(new MyRunnable());
    Thread t1 = new MyThread();

    //t0.start();
    //t1.start();
  }
}

class MyRunnable implements Runnable {
  public void run() {
    for(int i=0; i<50; i++) {
      System.out.println("Hello");
    }
  }
}

class MyThread extends Thread {
  public void run() {
    for(int i=0; i<50; i++) {
      System.out.println(this.getName()+ ":Hello");
    }
  }
}
