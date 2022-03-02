package ch6;

public class InnerClasses2 {
public static void main(String[] args) {
	new Outer2().met();
	}
}

class Outer2{
	
	void met() {
		
		//local inner class - private to the method
		class Local{
			void mett() {
				System.out.println("met  ttttttttttttt called....");
			}
		}
		new Local().mett();
	}
}