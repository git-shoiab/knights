package genericspack;
//https://fluvid.com/videos/detail/mv1dViwmPru7xKKmB#.YjrwoDoSetg.link
public class GenericsDemo {
	public static void main(String[] args) {
		PaintBrush<Paint> brush=PaintContainer.getBrush();
		
		Paint paint=brush.getObj();
		
		paint.getColor();
		
		PaintBrush<DryAir> dryBrush=DryAirContainer.getBrush();
		DryAir dryAir=dryBrush.getObj();
		dryAir.clean();
	}
}
class DryAir{
	public void clean() {
		System.out.println("cleaning .....");
	}
}
class ColourWater{
	public void playHoli(){
		System.out.println("playing holi.......");
	}
}
class PaintContainer{
	public static PaintBrush<Paint> getBrush() {
		PaintBrush<Paint> brush=new PaintBrush<>();
		brush.setObj(new RedPaint());
		return brush;
	}
}

class ColourWaterContainer{
	public static PaintBrush<ColourWater> getBrush() {
		PaintBrush<ColourWater> brush=new PaintBrush<>();
		brush.setObj(new ColourWater());
		return brush;
	}
}
class DryAirContainer{
	public static PaintBrush<DryAir> getBrush() {
		PaintBrush<DryAir> brush=new PaintBrush<>();
		brush.setObj(new DryAir());
		return brush;
	}
}
class PaintBrush<T>{
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

abstract class Paint{
	public abstract void getColor();
}
class RedPaint extends Paint{
	 @Override
	public void getColor() {
		 System.out.println("red colour....");
	}
}
class BluePaint extends Paint{
	 @Override
	public void getColor() {
		 System.out.println("blue colour....");
	}
}
class GreenPaint extends Paint{
	 @Override
	public void getColor() {
		 System.out.println("green colour....");
	}
}