//CHAPTER6-https://fluvid.com/videos/detail/9wa-Bi7n7atRYAyP2#.Ygpp1iwyE3U.link
package ch6;

public class ClassDemo1 {
	
	public static void main(String[] args) {
		ClassDemo1 obj=new ClassDemo1();
		
		Human shoiab=new Male();
		
		System.out.println(new Male().name);
	}
	void met() {
		System.out.println("hello...");
	}
}


class Human{
	String name="bbbbbb";
}

class Male extends Human{//INHERITANCE  - KIND OF RELATIONSHIP
	
}
