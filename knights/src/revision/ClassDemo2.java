package revision;
//https://fluvid.com/videos/detail/p35djuwp_DTrnMAz2#.YjH2LMP6KR4.link
public class ClassDemo2 {
	int age=20;//simple type
	String name="knights";//simple type
	MyType obj;//complex type
	void met() {
		MyType obj=null;
		System.out.println(obj);
		System.out.println(age+":"+name);
		obj=new MyType();
		System.out.println(obj.height+":"+obj.weight+":"+obj.name);
	}
	public static void main(String[] args) {
		ClassDemo2 obj=new ClassDemo2();
		obj.met();
	}
}


class MyType{
	int height=45454;
	int weight=345345;
	String name="sssssss";
}