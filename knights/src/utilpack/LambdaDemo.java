package utilpack;

public class LambdaDemo {
	public static void main(String[] args) {
		InterDemo obj=new InterImpl();
		obj.met4();
		InterDemo.met3();
		System.out.println(InterDemo.pi);
	}
}

interface InterDemo{
	default void met() {//template method
		System.out.println("default met called...");
		met2();
	}
	
	private void met2() {//these are private business methods
		System.out.println("private met2 called...");
	}
	
	static void met3() {//method which can be accessed from outside using interface name
		
	}
	static float pi=3.14f;
	
	public void met4() ;
}

class InterImpl implements InterDemo{
	@Override
	public void met4() {
		met();
		System.out.println("met4 called.......");
	}
}