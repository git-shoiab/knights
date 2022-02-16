package ch6;

//https://fluvid.com/videos/detail/XLE5Zc8jddS6XLxk_#.Yg0Q9_gdKdI.link
public class MethodDemo3 {
	public static void main(String[] args) {
		Hall hall=new MarriageHall();		
		hall.feast();
		
		MarriageHall mh=new MarriageHall();
		mh.feast();
		
	}
}
/*
 * OVERRIDING
 * 1. THE NAME OF THE METHOD SHOULD BE SAME
 * 2. PARAMETERS SHOULD BE SAME
 * 3. RETURN TYPE SHOULD BE SAME
 * 4. ACCESS SPECIFIER SHOULD NOT BE MORE PRIVATE(you cannot reduce the visibility but you can increase the visibility)
 */

class Hall{//super class
	protected void feast() {
		System.out.println("general.....royal.....royal.....royal.....");
	}
}

class MarriageHall extends Hall{//sub class
	public void feast() {
		System.out.println("bengal royal feast,...............");
		super.feast();
		//return 1;
	}
}

class BirthdayHall extends Hall{//another sub class
	
}