package revision;
//https://fluvid.com/videos/detail/dagdEhdXKgUAB1d7y#.YjiSWrUDNPc.link
public class ExcepDemo1 {
	public static void main(String[] args) {
		System.out.println("before exception..");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(NumberFormatException e) {			
			System.out.println("logic for numberformat exception can be written");		
		}catch(ArithmeticException ee) {
			System.out.println("logic for arithmetic exception can be written");
		}
//		catch(Exception eee) {
//			System.out.println("this is general block - common for all exceptions..."+eee);
//		}
		finally {
			System.out.println("finally always executes...");
		}
		System.out.println("after exception..");
	}
}


