package annopack;

import java.lang.reflect.Field;

public class AnnoDemoSmall {
	public static void main(String[] args) throws Exception{
		Sample sample=Container.getSample();
		
		
		System.out.println(sample.name);
	}
}
class Container{
	public static Sample getSample()throws Exception {
		Sample sample=new Sample();
		Class c=sample.getClass();
		
		Field field=c.getDeclaredField("name");
		field.setAccessible(true);
		In in=field.getAnnotation(In.class);
		if(in!=null) {
			sample.name="value is injected...................";
		}
		else {
			sample.name="dummy value.............";
		}
		return sample;
	}
}
class Sample{
	@In(factoryname = "annopack.LakhaiShoeFactory")
	String name;
}