package threadpack;
//https://fluvid.com/videos/detail/w6e8gcQ7V8Hny8zgw#.YjlfwuJrvUc.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {
	public ThreadDemo2() {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new ThreadJob());
		es.shutdown();
	}
	public static void main(String[] args) {
		new ThreadDemo2();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				//Thread.sleep(1000);
			}catch(Exception e) {
				
			}		
		}
	}
}


class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}