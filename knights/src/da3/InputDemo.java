package da3;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number...:");
		
		//int n1=scan.nextInt();
		int n1=Integer.parseInt(scan.next());
		
		System.out.println("Please enter another number...:");
		int n2=scan.nextInt();
		
		System.out.println("Addition..:"+(n1+n2));
	}
}
