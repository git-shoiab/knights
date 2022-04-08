package revision;
//https://fluvid.com/videos/detail/6B-o2iOa4pC9Az2kB#.YlBDGb3eXoQ.link
public class GenericsDemo {
	public static void main(String[] args) {
		GoodPaintBrush<Water> brush=WaterContainer.getBrush();
		Water water=brush.getItem();
		System.out.println(water);
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
		GoodPaintBrush<Water> brush=new GoodPaintBrush<Water>();
		brush.setItem(new Water());
		return brush;
	}
}
class PaintContainer {
	public static GoodPaintBrush<Paint> getBrush() {
		GoodPaintBrush<Paint> brush=new GoodPaintBrush<>();
		brush.setItem(new RedPaint());
		return brush;
	}
}