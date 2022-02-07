package da3;

public class ConditionDemo2 {
	public static void main(String[] args) {
		int num=10;
		
		boolean boo=(num%2==0);
		
		System.out.println(boo?"Even Number...":"Odd Number...");
		
		if(boo) {
			System.out.println("Even number....");
		}
		else {
			System.out.println("Odd number....");
		}
		
		
		int month=5;
		if(month==1) {
			System.out.println("this is jan month...");
		}
		else if(month==3) {
			System.out.println("this is march month");
		}
		else if(month==5) {
			System.out.println("this is may month...");
		}
		else {
			System.out.println("i dont know..");
		}
	}
}
