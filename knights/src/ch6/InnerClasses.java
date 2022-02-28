package ch6;
//https://fluvid.com/videos/detail/8EL-9T3X37SdvPXok#.Yhzeh-dJ0aQ.link
public class InnerClasses {

	public static void main(String[] args) {
		Outer.InnerStatic ins=new Outer.InnerStatic();
		ins.met();
		
		Outer.InnerNonStatic in=new Outer().new InnerNonStatic();
		in.met();
	}
	
}

class Outer{
	void outMet() {
		System.out.println("non static out met called...");
	}
	static void staticOutMet() {
		System.out.println("static void out met called...");
	}
	static class InnerStatic{
		public void met() {
			System.out.println("static inner class method called...");
			//outMet(); - non static cannot be accessed
			staticOutMet();
		}
	}
	
	class InnerNonStatic{
		public void met() {
			System.out.println("non static met called....");
			outMet();
			staticOutMet();
		}
	}
}
