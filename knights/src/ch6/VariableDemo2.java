package ch6;
//https://fluvid.com/videos/detail/37jwQhOVBvSy1azeQ#.YhY9e4tPCY0.link
public class VariableDemo2 {
	public static void main(String[] args) {
		A obj=new A();
		obj.s=100;
		//obj.ss=1000;
		A.ss=1000;//right way of accessing static
		
		A obj2=new A();
		obj2.s=200;
		//obj2.ss=2000;
		A.ss=2000;
		
		System.out.println(obj.s+":"+obj2.s);
		System.out.println(A.ss+":"+A.ss);
		
		A objX=obj;
		
		obj.met(10);
		objX.met(20);
	}
}


class A{
	int s;//instance variable
	static int ss;//class variable
	
	public void met(int n) {
		//n is local variable
		System.out.println(n);
	}
	
	public void met2(long ll) {
		//ll is local variable
	}
}