package threadpack;
//https://fluvid.com/videos/detail/Ee1-6HG5LPc5Bo4Pe#.YjlPZSRYEYA.link
//https://fluvid.com/videos/detail/Ee1-6HG5m3f5BogBk#.YjlT5U5bYiA.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyRunnable implements Runnable{
	ThreadDemo1 obj;
	public MyRunnable(ThreadDemo1 obj) {
		this.obj=obj;
	}
	 @Override
	public void run() {
		 obj.met2();
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		ThreadDemo1 obj=new ThreadDemo1();
		Thread t=Thread.currentThread();
		t.setName("main thread");
		t.setPriority(10);
		System.out.println(t);
		obj.met1();
		
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new MyRunnable(obj));
		//fire and wait
	
		//obj.met2();
		obj.met3();
		es.shutdown();
	}
	
	void met1() {
		System.out.println("met 1 called...");
		Thread t=Thread.currentThread();
		System.out.println("met1...:"+t);
	}
	void met2() {
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			
		}
		System.out.println("met 2 called...");
		Thread t=Thread.currentThread();
		System.out.println("met2....:"+t);
		
	}
	void met3() {
		System.out.println("met 3 called...");
		Thread t=Thread.currentThread();
		System.out.println("met3...:"+t);
	}
}
