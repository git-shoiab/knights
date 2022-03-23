package threadpack;
//https://fluvid.com/videos/detail/e-KdETV32ps5dLBov#.YjmvTV0MRN8.link
public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception{
		Animal obj=new Animal();//static way of creating an object
		//Dynamic way of creating an object is through reflection
		
		obj=(Animal)Class.forName("threadpack.Animal").newInstance();
		
		obj=(Animal)Class.forName("threadpack.Animal").
				getConstructor(new Class[] {String.class}).
				newInstance(new Object[] {"billa"});
	}
}


class Animal{
	public Animal() {
		System.out.println("animal default cons called...");
	}
	public Animal(String s) {
		System.out.println("animal string param cons called...");
	}
}