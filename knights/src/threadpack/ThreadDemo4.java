package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(1);
		//es.execute(new MyThreadJob1());
		met1();
		met2();
		met3();
		es.shutdown();
	}
	
	static void met1() {
		System.out.println("met 1 called...");
	}
	static int met2() {
		System.out.println("met 2 called...");
		try {Thread.sleep(3000);}catch(Exception e) {}
		return 10;
	}
	static void met3() {
		System.out.println("met 3 called...");
	}
}

class MyThreadJob1 implements Runnable{
	@Override
	public void run() {
		ThreadDemo4.met3();
	}
}