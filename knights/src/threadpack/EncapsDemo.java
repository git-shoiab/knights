package threadpack;
//KaliMark.Soda soda=new KaliMark().new Soda()
public class EncapsDemo {
	public static void main(String[] args) {
		Pepsi pepsi=new Pepsi();
		pepsi.sellCola();
		
		KaliMark kali=new KaliMark();
		kali.sellCola();
		
		//KaliMark.Soda soda=new KaliMark().new Soda();non static soda class
		KaliMark.Soda soda=new KaliMark.Soda();
	}
}

abstract class Cola{
	public abstract void makeCola();
}


class KaliMark {
	public void sellCola() {
//		class CampaCola extends Cola{
//			@Override
//			public void makeCola() {
//				System.out.println("cola made by campa cola....");
//			}
//		}
		new Cola() {
			
			@Override
			public void makeCola() {
				System.out.println("cola made by formula of campa cola inside kalimark...");
			}
		}.makeCola();
		//Cola cola=new CampaCola();
		//cola.makeCola();
		System.out.println("bottles campa cola in bovonto bottle and sell");
	}
	//inner class
	
//	public Cola trojan() {
//		return new CampaCola();
//	}
	static class Soda{
		
	}
}
class Pepsi{
	public void sellCola() {
		//Cola cola=new KaliMark().new CampaCola();
	//	Cola cola=new KaliMark().trojan();
	//	cola.makeCola();
	//	System.out.println("bottles campa cola in pepsi bottle and sell");	
	}
}