package threadpack;
//https://fluvid.com/videos/detail/xLOkKcLQEwcn291D7#.YlrR_6qOaBE.link
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo5 {
	public static void main(String[] args)throws Exception {
		ExecutorService ex=Executors.newFixedThreadPool(1);
		
		Future<String> future=ex.submit(new MyCallable());
		
		System.out.println("main thread running...");
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
		String result=future.get();
		
		System.out.println(result);
	}
}

class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		System.out.println("child thread called....");
		return "hello from call method...";
	}
}