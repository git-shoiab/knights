package exceppack;
//https://fluvid.com/videos/detail/QKZX3hdv88TRLd_gj#.Yii3LdcEqEM.link
public class ExceptionDemo2 {
	public static void main(String[] args) {
		int result=0;
		System.out.println("before exception...");
		int length=args.length;
		if(length==0) {
			System.out.println("please enter a command line argument value");
		}
		else {
			String s=args[0];
			if(Character.isDigit(s.charAt(0))) {
				int n=Integer.parseInt(s);
				if(n==0) {
					System.out.println("You cannot divide a number by zero...");
				}
				else {
					result=1/n;
				}
			}
			else {
				System.out.println("please enter a number value not a character...");
			}
		}
		System.out.println("Result...:"+result);
	}
}
