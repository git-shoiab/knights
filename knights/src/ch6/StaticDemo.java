package ch6;
class Parent{
	int i=20;
	static void met(int i) {
		System.out.println("parent met is called..."+i);
	}
}
public class StaticDemo extends Parent{
	public StaticDemo() {
		System.out.println("cons called..");
	}
	static {
		System.out.println("code common for all static methods is written here...");
	}
	public static void main(String[] args) {
		//new StaticDemo().met2();
		Parent.met(200);
		StaticDemo.met(100);
		//StaticDemo.met();
	}
	int i=10;
	static void met(int i) {
		//keywords - this,super cannot be used
		//non static variables and methods cannot be referred here
		//System.out.println("static method called...."+this.i);//cannot use this in static context
		new StaticDemo().i=20;
		//i=10;
		//met2();
		System.out.println(i);
		//System.out.println(this.i); - cannot use this
		//System.out.println(super.i); - cannot use super 
	}
	static void met() {
		System.out.println("static method 2222 called....");
	}
	void met2(int i) {
		System.out.println("non static method called...");
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}




