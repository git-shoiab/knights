package revision;
//https://fluvid.com/videos/detail/dagdEhdXKgUAB1d7y#.YjiSWrUDNPc.link
public class ExcepDemo2 {
	public static void main(String[] args) {
		System.out.println("before exception..");
		try {
			int i=1/0;
		}catch(Exception e) {
			e.initCause(new MyExceptionReason());//exception chaining
			System.out.println(e);
			System.out.println(e.getCause());
		}
		System.out.println("after exception..");
	}
}


class MyExceptionReason extends Throwable{
	@Override
	public String toString() {
		return "The exception is caused due to line number 7 where u r dividing a number by zero...";
	}
}