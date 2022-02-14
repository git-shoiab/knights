package da3;

public class Loop2 {
	public static void main(String[] args) {
//		for(;;) {
//			System.out.println("infinite loop..");
//		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		//NESTED
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
}
