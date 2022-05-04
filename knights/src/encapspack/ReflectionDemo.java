package encapspack;
//https://fluvid.com/videos/detail/zj4k_Tv95KSovmkO8#.YnKIKugmBwY.link
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(String[] args) {
		Politician daku=new Politician();
		PoliceStation p1=new PoliceStation();
		
		p1.arrest(daku);
		
		//p1.arrest(new Doctor());
	}
}

class Politician{
	public String name="I am a good holy man...";
	private String secretName="gunda...";
	
	public void service() {
		System.out.println("I do social service ....");
	}
	
	private void secretService() {
		System.out.println("I loot the country....");
	}
}
class Doctor{}
class PoliceStation{
	public void arrest(Object obj) {
		try {
		Class c=obj.getClass();
		Field f=c.getField("name");
		System.out.println(f.get(obj));
		
		Method m=c.getMethod("service");
		m.invoke(obj);
		
		f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(obj));
		
		m=c.getDeclaredMethod("secretService");
		m.setAccessible(true);
		m.invoke(obj);
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}