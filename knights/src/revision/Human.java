package revision;
//https://fluvid.com/videos/detail/p35djuwp_DTrnMAz2#.YjH2LMP6KR4.link
public class Human {
	public static void main(String[] args) {
		Human abdurrehman=new Human();
		Bag mybag=abdurrehman.buyBag();
		System.out.println(mybag);
		System.out.println(abdurrehman.getBalanceMoney());
	}
	
	int money=1000;
	boolean purchase=false;
	void spendMoney(String quality) {
		if(quality.equals("a1")) {
			System.out.println("I want to spend 500");
			if(purchase) {
				money=money-500;
			}
		}
		else if(quality.equals("a2")) {
			System.out.println("I want to spend 300");
			if(purchase) {
				money=money-300;
			}
		}
	}
	int getBalanceMoney() {
		return money;
	}
	
	Bag buyBag() {
		purchase=false;
		spendMoney("a1");
		
		return new Bag();
	}
}
class Bag{}