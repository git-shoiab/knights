package da3;

public class CommandLineArgsDemo {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		//System.out.println(args[4]);
		
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		
		System.out.println("addition...:"+(n1+n2));
	}
}
