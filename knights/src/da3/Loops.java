package da3;

public class Loops {
	public static void main(String[] args) {
		//while, do-while, for
		
//		while(true) {//pre condition check loop
//			System.out.println("infinite loop");
//		}
		
//		do {
//			System.out.println("infinite loop");
//		}while(true);//post condition check loop
		
		int i=10;
		while(i>0) {
			System.out.println(i);
			i--;
		}
		//i=10;
		do {
			System.out.println("do while loop...:"+i);
			i--;
		}while(i>0);
		
		
	}
}
