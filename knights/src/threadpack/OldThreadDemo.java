package threadpack;

import java.util.concurrent.Callable;

public class OldThreadDemo {
	public OldThreadDemo() {
		Thread t=new Thread(new MyThreadJob5());
		
		//Thread t=new Thread(new MyThreadJob6());
		t.start();
	}
	public static void main(String[] args) {
		new OldThreadDemo();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class MyThreadJob5 implements Runnable{	
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}

class MyThreadJob6 implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "child thread with call called...";
	}
}
