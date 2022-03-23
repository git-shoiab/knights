package threadpack;
//https://fluvid.com/videos/detail/mv1dViwoogU7xrO9O#.YjmPby3iGjg.link
public class Jdk5InterfaceDemo {
	public static void main(String[] args) {
		JDKImpl obj=new JDKImpl();
		obj.met2();
		JDKInterface.statMet2();
		//obj.a=300;
		System.out.println(obj.a);
		System.out.println(JDKInterface.pi);
	}
}

interface JDKInterface{
	public final static float pi=3.14f;//constant
	int a=20;//this is not a constant
	private void met() {
		System.out.println("private met method called..");
	}
	
	public default void met2() {//equivalent to template methods of abstract classes
		met();
		System.out.println("public default met 2 called....");
	}
	public static void statMet2() {//static template method
		System.out.println("stat met called...");
	}
	
}

class JDKImpl implements JDKInterface{}
//marker interface - no methods
//functional interface - only one method

interface MyFunc{
	public int getAge();
}
