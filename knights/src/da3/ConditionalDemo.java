package da3;

public class ConditionalDemo {
	public static void main(String[] args) {
		//Ternary Operator
		
		System.out.println(false ?"success":"failure");
		
		
		
		boolean boo=true;
		String result=boo?"success":"failure";
		
		System.out.println(result);
		
		
		
		int num=11%2;
		
		boo=(num==0);//comparison operator - will return true or false
		
		result=boo?"Even number...":"Odd Number...";
		
		System.out.println(result);
	}
}
