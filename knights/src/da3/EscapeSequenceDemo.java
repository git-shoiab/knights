package da3;

public class EscapeSequenceDemo {
	public static void main(String[] args) {
		System.out.println("Hello \"knightingale\" Batch");
		
		System.out.println("Hello \'knightingale\' Batch");
		
		System.out.println("Hello \t\tknightingale\t\t\t Batch");
		
		System.out.println("Hello \n knightingale \n Batch");
		
		System.out.println("Hello \n\t knightingale \n\t\t\t\t Batch");
		
		System.out.println("Hello \f knightingale \f Batch");
		
		System.out.println("Hello \b\b\b\bworld");
		
		System.out.println("Hello Hello\r World");
		
		int count=0;
		while(true) {
			System.out.print(count++ +"\r");
		}
	}
}
