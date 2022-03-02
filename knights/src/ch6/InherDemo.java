package ch6;
//https://fluvid.com/videos/detail/ZEn3MT8RYeC9D9QQQ#.Yh9_0sIRP4w.link
public class InherDemo {
public static void main(String[] args) {
	BadBrush bb=new BadBrush();
	bb.paint(1);
	
	GoodBrush1 gb=new GoodBrush1();
	gb.paint(new RedPaint());
	gb.paint(new BluePaint());
	
	GoodBrushTrue gbt=new GoodBrushTrue();
	gbt.paint(new RedPaint());
	gbt.paint(new BluePaint());
	gbt.paint(new  GreenPaint());
}
}

class BadBrush{
	public void paint(int i) {
		if(i==1) {
			System.out.println("red colour....");
		}
		else if(i==2) {
			System.out.println("green colour...");
		}		
	}
}

/*
1. Remove the conditions.
2. Convert the condition to classes
3. INHERITANCE - GROUP THE CONDITIONS UNDER A COMMON CLASS
4. create a relationship between the using class and condition class
*/

class GoodBrush1{//badbrush2
	public void paint(RedPaint rp) {
		System.out.println(rp);
	}
	public void paint(BluePaint bp) {
		System.out.println(bp);
	}
}
class Paint{
	
}
class RedPaint extends Paint{//redpaint is a kind of paint
	
}
class BluePaint extends Paint{//blue paint is a kind of paint
	
}
class GreenPaint extends Paint{//blue paint is a kind of paint
	
}
//this code is closed for modification but open for extension
class GoodBrushTrue{//badbrush2
	public void paint(Paint rp) {
		System.out.println(rp);
	}
	
}