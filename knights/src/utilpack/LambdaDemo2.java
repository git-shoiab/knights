package utilpack;
//https://fluvid.com/videos/detail/448axCQQPvcOz9qGZ#.Yn0XUygHbJw.link
public class LambdaDemo2 {
	public static void main(String[] args) {
	
		LambdaInter obj=()->{System.out.println("met called...");};
		
		meet(obj);//this is new fashion - lambda
		meet(()->{System.out.println("logic goes here....");});
		meet(new LambdaImpl());//this is old fashioned
		
		LambdaInter2 obj2=(String s,int i)->{System.out.println(s+":"+i);};
		obj2.met("hello knights...", 100);
	}
	
	public static void meet(LambdaInter li) {
		li.met();
	}
}

interface LambdaInter2{
	public void met(String s,int i);
	//public void met2();
}

@FunctionalInterface
interface LambdaInter{
	public void met();
	//public void met2();
}

class LambdaImpl implements LambdaInter{
	@Override
	public void met() {
		System.out.println("old fashioned implementation...");
	}
}