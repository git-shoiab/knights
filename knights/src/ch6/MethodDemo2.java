package ch6;
//https://fluvid.com/videos/detail/Y5V24T8jwEs9L56Z-#.Yg0LALAU3ns.link
public class MethodDemo2 {
	public static void main(String[] args) {
		MethodDemo2 obj=new MethodDemo2();
		
		int ret=obj.met();
		System.out.println(ret);
		
		System.out.println(obj.met(10));
		
		System.out.println(obj.met(100L));
	
		System.out.println(obj.getName(200));
	}
	
	int met() {
		return 90;
	}
	
	String met(int i) {
		return "hello";
	}
	
	boolean met(long l) {
		if(l==100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	String getName(int rollno) {
		switch(rollno) {
		case 100:{
			return "rahim";
			}
		case 200:{
			return "ram";
			}
		default:{
			return "unknown";
			}
		}
	}
}
