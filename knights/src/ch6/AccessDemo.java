
//ACCESS DEMO - https://fluvid.com/videos/detail/XLE5Zc8-7AI6XB5_g#.YgptYdRWC5s.link
package ch6;

public class AccessDemo {
	private int pri;//CLASS SCOPE
	int nomod;//PACKAGE SCOPE
	protected int pro;//RELATION SCOPE
	public int pub;//GLOBAL SCOPE
	
	void met(){
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}


class AccessDemoSamePackSubClass extends AccessDemo{
	void met(){
		//System.out.println(pri);//class scope
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}

class AccessDemoSamePackNonSubClass {
	void met(){
		AccessDemo obj=new AccessDemo();
		//System.out.println(obj.pri);
		System.out.println(obj.nomod);//package scope
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}

