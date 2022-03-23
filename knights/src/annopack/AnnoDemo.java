package annopack;
//https://fluvid.com/videos/detail/-KRkYhGY_rhEz4eXx#.Yjriz0LggHQ.link
import java.lang.reflect.Field;

//https://fluvid.com/videos/detail/P5OY2TPYPLIgrX7-B#.YjrM-12GuK4.link
public class AnnoDemo {
	public static void main(String[] args)throws Exception {
		ShoeShop shop=ChennaiContainer.getShoeShop();
		
		System.out.println(shop.sellShoe());
	}
}

class ChennaiContainer{
	
	public static ShoeShop getShoeShop()throws Exception {
		//ShoeFactory factory=new LakhaniShoeFactory();
		ShoeShop shop=new SiriusShoeShop();
		Class c=shop.getClass();
		
		Field field=c.getSuperclass().getDeclaredField("factory");
		field.setAccessible(true);
		In in=field.getAnnotation(In.class);
		
		if(in!=null) {
			String factoryname=in.factoryname();
			ShoeFactory factory=(ShoeFactory)
					Class.forName(factoryname).getConstructor().newInstance();
			shop.setFactory(factory);
		}
		else {
			
		}
		//knowledge of factory to shop - because shop is dependent on factory
		
		//shop.setFactory(factory);
		
		return shop;
	}
}
abstract class Shoe{}

class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}

interface Manufacturer{
	public Shoe makeShoe();
}
abstract class ShoeFactory implements Manufacturer{
	public ShoeFactory() {
		// TODO Auto-generated constructor stub
	}
}
interface Seller{
	public Shoe sellShoe();
}
abstract class ShoeShop implements Seller{
	@In(factoryname = "annopack.BataShoeFactory")
	private ShoeFactory factory;

	public ShoeFactory getFactory() {
		return factory;
	}

	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
	
}

class BataShoeFactory extends ShoeFactory{
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}

class SiriusShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe() {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}