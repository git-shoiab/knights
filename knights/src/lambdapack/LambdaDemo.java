package lambdapack;
//https://fluvid.com/videos/detail/AZX-wTO8PGupg7-Lz#.YmQIJHGD6lQ.link
public class LambdaDemo {
	public static void main(String[] args) {
		System.out.println(Jdk8InterfaceDemo.pi);
		Jdk8InterfaceDemo.met5();
		
		Dominos ilhamDominos=new IlhamDominos();
		ilhamDominos.sellPizza();
	}
}

interface Jdk8InterfaceDemo{	
	public void met();
	public final static float pi=3.14f;
	private void met2() {
		System.out.println("private met2 called...");
	}
	private void met4() {
		System.out.println("private met4 called...");
	}
	
	public default void met3() {
		met2();
		met4();
	}
	public static void met5() {
		System.out.println("met5 static method called...");
	}
}

interface Dominos{
	public void getPayment();
	public void delivery();
	private void makingDough() {
		System.out.println("dough made as per dominos secret logic");
	}
	private void addIngredients() {
		System.out.println("ingredients added as per dominos secret logic..");
	}
	private void baking() {
		System.out.println("baked as per dominos secret logic...");
	}
	private void makePizza() {
		makingDough();
		addIngredients();
		baking();
	}
	public default void sellPizza() {
		getPayment();
		makePizza();
		delivery();
	}
}
class IlhamDominos implements Dominos{
	@Override
	public void delivery() {
		System.out.println("India so I deliver by bike...");
	}
	@Override
	public void getPayment() {
		System.out.println("India so I get payment in rupees....");
	}
}