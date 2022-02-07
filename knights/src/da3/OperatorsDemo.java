package da3;

public class OperatorsDemo {
	public static void main(String[] args) {
		//Arithmetic operators - +,-,*,/,%
		
		int num1=10;
		int num2=3;
		
		int add=num1+num2;		
		System.out.println("Addition..:"+add);
		
		int sub=num1-num2;
		System.out.println("subtraction..:"+sub);
		
		int mul=num1*num2;
		System.out.println("multiplication..:"+mul);
		
		int div=num1/num2;
		System.out.println("division-quotient..:"+div);
		
		int mod=num1%num2;
		System.out.println("Mod - Reminder...:"+mod);
		
		//= is assignment operator
		
		//== is comparison operator
		
		//! -is Negate operator
		System.out.println(2==2);
		
		System.out.println(2!=2);
		System.out.println(3!=2);
		
		//increment and decrement operator
		
		//i++ and --i;
		
		int i=10; //i=i+1;
		//System.out.println(i++);//will print the i first and then increments - post increment
		//System.out.println(++i);//will first increment and then prints - pre increment
		
		System.out.println(i++);//10
		System.out.println(i);//11
		
		i=10;
		System.out.println(++i);//11
		System.out.println(i);//11
		
		//decrement operator
		i=10;
		System.out.println(i--);//10
		System.out.println(i);//9
		
		i=10;
		System.out.println(--i);//9
		System.out.println(i);//9
		
		i=10;
		i+=3;//i=i+3;
		System.out.println(i);//13
		
		i=10;
		i-=2;//i=i-2;
		System.out.println(i);//8
		
		
		i=10;
		i*=5;//i=i*5;
		System.out.println(i);//50
		
		
		i=10;
		i/=2;//i=i/2;
		System.out.println(i);//5
		
		
		i=10;
		i%=2;//i=i%2;
		System.out.println(i);//0
		
		
	}
}
