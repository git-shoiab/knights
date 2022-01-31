package day1;

public class VariableDemo3 {
	public static void main(String[] args) {
		//Complex type initialization
		
		Integer i=20;
		Integer ii=new Integer(20);
		Integer iii=Integer.valueOf(20);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.sum(10,20));
		
		System.out.println(Integer.max(10,20));
		System.out.println(Integer.min(20,50));
		
		String str="how are you..";// this will behave like primitive and it is more preferred
		String s="100";
		String ss=new String("hello world");
		ss=String.valueOf("helloworld");
		
		//for string alone we don't have a primitive type
		//but still string behaves like a primitive type
		
		System.out.println(ss.charAt(0));
		System.out.println(ss.indexOf('h'));
		
		System.out.println(ss.substring(2));
		System.out.println(ss.substring(2, 5));
		
		String num1="100";
		String num2="200";
		
		System.out.println(num1+num2);// the + will concatenate two string
		
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));// parseint method of Integer will convert the string to number
	}
}
