package exceppack;
//https://fluvid.com/videos/detail/QKZX3hdv88TRLd_gj#.Yii3LdcEqEM.link
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println("handle arithmetic ...");
		}catch(NumberFormatException ne) {
			System.out.println("handle number format...");
		}
		finally {
			System.out.println("finally called...");
		}
		System.out.println("after exception");
	}
}
