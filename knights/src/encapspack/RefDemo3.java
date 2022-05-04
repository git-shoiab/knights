package encapspack;
//https://fluvid.com/videos/detail/9wa-BiEoVeUQg-3DM#.YnKQtjq3vKY.link
import java.lang.reflect.Field;

public class RefDemo3 {
	public static void main(String[] args) throws Exception{
		AnnoDemo obj=new AnnoDemo();
		
		Class c=obj.getClass();
		//MyAnno myn=(MyAnno)c.getAnnotation(MyAnno.class);
		Field field=(Field)c.getDeclaredField("name");
		field.setAccessible(true);
		MyAnno myn=(MyAnno)field.getAnnotation(MyAnno.class);
		if(myn==null) {
			System.out.println("annotation not present...");
		}
		else {
			System.out.println("annotation is present....");
			System.out.println(myn.value());
		}
	}
}

@MyAnno(value="class level...")
class AnnoDemo{
	
	@MyAnno(value="field level....")
	String name;
	
	@MyAnno(value="method level.....")
	public void met() {
		
	}
}