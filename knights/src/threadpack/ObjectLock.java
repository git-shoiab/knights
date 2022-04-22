package threadpack;
//https://fluvid.com/videos/detail/KR9rGtD23YHxjzodQ#.YmLAMryM59k.link
public class ObjectLock {
	public static void main(String[] args) {
		TicketCounter counter=new TicketCounter();
		
		
	}
}

class ThreadJob8 implements Runnable{
	String name;int amt;TicketCounter counter;
	public ThreadJob8(String name,int amt,TicketCounter counter) {
		this.name=name;this.amt=amt;this.counter=counter;
	}
	@Override
	public void run() {
		synchronized(counter) {//OBJECT LOCK
			counter.booking(amt);
			counter.giveChange();
		}
	}
}
class TicketCounter{
	public void booking(int amt) {
		
	}
	
	public void giveChange() {
		
	}
}