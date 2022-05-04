package encapspack;

import java.lang.reflect.Method;

public class RefDemo2 {
	public static void main(String[] args) throws Exception{
		//Temp obj=new Temp();
		
		//Temp obj=(Temp)Class.forName("encapspack.Temp").newInstance();
		Temp obj=(Temp)Class.forName("encapspack.Temp").getConstructor(String.class,int.class).newInstance("aaa",120);
		Class c=obj.getClass();
		Method m=c.getDeclaredMethod("met",new Class[] {String.class});	
		m.setAccessible(true);
		m.invoke(obj, new Object[] {new String("hello")});
		
		m=c.getDeclaredMethod("met", String.class,Money.class);
		m.setAccessible(true);
		m.invoke(obj, new String("aaaaa"),new Money());
	}
}


class Temp{
	public Temp() {
		System.out.println("empty cons called...");
	}
	public Temp(String s,int n) {
		System.out.println("overloaded cons called...:"+s+":"+n);
	}
	private void met(String s) {
		System.out.println("met called...:"+s);
	}
	private void met(String s,Money m) {
		System.out.println("met called...:"+s+":"+m);
	}
}
class Money{}