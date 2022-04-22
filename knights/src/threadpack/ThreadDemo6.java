package threadpack;
//https://fluvid.com/videos/detail/QKZX3hqR96f9qo9jY#.YlrXK9hZR5I.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->DBConnection.getDBConnectionObj());
		es.execute(()->DBConnection.getDBConnectionObj());
		
		es.shutdown();
	}
}

//singleton class
class DBConnection{
	private DBConnection() {
		System.out.println("DBCon object is created..");
	}
	private static DBConnection dbcon;
	//Double Dip Problem is solved through synchronization
	 synchronized public static DBConnection getDBConnectionObj() {
		if(dbcon==null) {
			dbcon=new DBConnection();
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
		return dbcon;
	}
}