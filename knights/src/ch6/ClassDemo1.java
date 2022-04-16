//CHAPTER6-https://fluvid.com/videos/detail/9wa-Bi7n7atRYAyP2#.Ygpp1iwyE3U.link
package ch6;
/*
 * 6 advantages of Inheritance.
 * 1. Object Reusability
 * 2. Create part whole hierarchy
 * 3. Achieve composition
 * 4. Removal of if-else-if conditional statement.
 * 5. Polymorphism and Polymorphic queries
 * 6. Code reusability
 */
public class ClassDemo1 {
	
	public static void main(String[] args) {
		ClassDemo1 obj=new ClassDemo1();
		
		Human shoiab=new Male();
		Human sunaina=new Female();
		//child object can replace the parent
		//can the reverse be possible
		//Male m=new Human();
		//Parent object cannot replace the child
		
	}
	void met() {
		System.out.println("hello...");
	}
}


class Human{

}

class Male extends Human{//INHERITANCE  - KIND OF RELATIONSHIP
	
}
class Female extends Human{}