package da3;

public class OperatorsDemo2 {
	public static void main(String[] args) {
		int num1=10;
		int num2=12;
		
		//Relational operators 
		//these operators will always return true or false
		boolean boo=num1<num2;//lesser than
		System.out.println(boo);
		
		System.out.println(num1>num2);//greather than
		
		System.out.println(num1>=num2);//greather than or equal to 
		
		System.out.println(num1<=num2);//lesser than or equal to
		
		System.out.println(num1<num2 && num1==11);//AND - both the expressions are true then it returns true
		//even if one condition fails it return false
		
		//PIPE
		System.out.println(num1<num2 || num1==11);//OR - even if one of the expression returns true, 
		//then the expression will return true
		
		
	}
}
