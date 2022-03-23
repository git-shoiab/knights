package threadpack;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(String[] args) throws Exception{
		PoliceStation p1=new PoliceStation();
		Doctor doc=new Doctor();
		Politician pol=new Politician();
		p1.arrest(pol);
		//p1.arrest(doc);
	}
}
class PoliceStation{
	public void arrest(Object obj)throws Exception {
		Class c=obj.getClass();
		Field field= c.getField("name");
		System.out.println(field.get(obj));
		
		Method method=c.getMethod("service");
		method.invoke(obj);
		
		//special room - torture room
		field=c.getDeclaredField("secretName");
		field.setAccessible(true);
		System.out.println(field.get(obj));
		
		method=c.getDeclaredMethod("secretService");
		method.setAccessible(true);
		method.invoke(obj);
		
		method=c.getDeclaredMethod("secretService",new Class[] {String.class});
		method.setAccessible(true);
		method.invoke(obj,new Object[] {"billa"});

	}
}
class Doctor{}
class Politician{
	public String name="I am a good man..";
	private String secretName="rowdy..";
	
	public void service() {
		System.out.println("I do social service....");
	}
	
	private void secretService() {
		System.out.println("I do loot money...");
	}
	
	private String secretService(String s) {
		System.out.println("secret service order from ..:"+s);
		return "swaha..............";
	}
}