package threadpack;
//https://fluvid.com/videos/detail/KR9rGtD2KwSxjzPz5#.YmK7VM8CKUk.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassLockDemo {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(new ThreadJob7("arnold"));
		
		es.execute(new ThreadJob7("stallone"));
		
		es.shutdown();
	}
}
class ThreadJob7 implements Runnable{
	String name;
	public ThreadJob7(String name) {
		//Thread.currentThread().setName(name);
		this.name=name;
	}
	@Override
	public void run() {
		synchronized(TrainingRoom.class) {//class lock - used to lock static properties of the class
			TrainingRoom.toilet.useToilet(name);
		}
	}
}
class TrainingRoom{
	static Toilet toilet=new Toilet();
}

class Toilet{
	public void useToilet(String name) {
		Thread t=Thread.currentThread();
		System.out.println(name+" in the toilet....");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" out of the toilet...");
	}
}