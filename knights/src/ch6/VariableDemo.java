package ch6;

//https://fluvid.com/videos/detail/M-AKQTqOjMI4YgPq9#.YhOf0Nlqui4.link

public class VariableDemo {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();//complex variable - work with original

		int i;//simple or primitive type - work with copies
		
		VariableDemo obj=new VariableDemo();
		//System.out.println("before passing...:"+laddu.size);
		//obj.pbv(laddu.size);//pass by value - copies are made
		//System.out.println("after passing...:"+laddu.size);
		
		System.out.println("REFERENCE-before passing...:"+laddu.size);
		obj.pbr(laddu);//pass by reference - original is passed 
		System.out.println("REFERENCE-after passing...:"+laddu.size);
		
	}
	
	void pbv(int size) {
		size=5;
	}
	
	void pbr(Laddu lad) {
		lad.size=5;
	}
}


class Laddu{
	int size=10;
}