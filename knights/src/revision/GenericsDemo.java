package revision;

import java.lang.reflect.Field;

//https://fluvid.com/videos/detail/6B-o2iOa4pC9Az2kB#.YlBDGb3eXoQ.link
//https://fluvid.com/videos/detail/_LkeEcqkyof3_7L-A#.YlBGa_uX4Q4.link
public class GenericsDemo {
	public static void main(String[] args) {
		GoodPaintBrush<Water> brush=WaterContainer.getBrush();
		Water water=brush.getItem();
		System.out.println(water);
		
		GoodPaintBrush<Paint> pbrush=PaintContainer.getBrush();
		Paint paint=pbrush.getItem();
		System.out.println(paint);
	}
}

class BadPaintBrush{
	public void doPaint(int c) {
		if(c==1) {
			System.out.println("red colour..");
		}
		else if(c==2){
			System.out.println("blue colour...");
		}
	}
}
class PaintBrush{
	Paint paint;
	public void doPaint() {
		System.out.println(paint);
	}
}
abstract class Paint{}
class RedPaint extends Paint{}
class BluePaint extends Paint{}

class GoodFraudPaintBrush{
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}

class GoodPaintBrush<T>{
	@Inject(className ="revision.BluePaint" )
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}	
}
class Water{}
class WaterContainer {
	public static GoodPaintBrush<Water> getBrush() {
		try {
		GoodPaintBrush<Water> brush=new GoodPaintBrush<Water>();
		Class c=brush.getClass();
		Field field=c.getDeclaredField("item");
		Inject in=field.getAnnotation(Inject.class);
		if(in!=null) {
			brush.setItem(new Water());
		}
		return brush;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
class PaintContainer {
	public static GoodPaintBrush<Paint> getBrush() {
		try {
			GoodPaintBrush<Paint> brush=new GoodPaintBrush<>();
			Class c=brush.getClass();
			Field field=c.getDeclaredField("item");
			Inject in=field.getAnnotation(Inject.class);
			if(in!=null) {
				String classname=in.className();
				Paint paint=(Paint)Class.forName(classname).newInstance();
				brush.setItem(paint);
			}
			return brush;
			}catch(Exception e) {
				System.out.println(e);
				return null;
			}
	}
}