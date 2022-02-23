package ch6;
////https://fluvid.com/videos/detail/ykZL6cknRkhY9w96G#.YhWfgfrQnjs.link
public class ConsDemo {
	ConsDemo(){
		System.out.println("Constructor called...");
	}
	String name;
	String s;
	ConsDemo(String s){
		System.out.println("....................:"+s);
		name=s;//initialization
		this.s=s;
	}
	
	ConsDemo(String s,int i){
		System.out.println("...................:"+s+":"+i);
	}
	public static void main(String[] args) {
		System.out.println("Before construction.....");
		ConsDemo obj=new ConsDemo("hello");
		System.out.println("After Construction.....");
		
		ConsDemo obj2=new ConsDemo();
	}
}
