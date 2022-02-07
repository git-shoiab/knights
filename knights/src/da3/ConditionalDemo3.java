package da3;

public class ConditionalDemo3 {
	//switch -case
	
	public static void main(String[] args) {
		int month=5;
		
		switch(month%2) {
		case 0:{
			System.out.println("even month...");
			break;
		}
		case 1:{
			System.out.println("odd month....");
		}
		}
		
		
		switch(month) {
		case 1:{
			System.out.println("this is jan");
			break;
		}
		case 2:{
			System.out.println("this is feb");
			break;
		}
		case 3:{
			System.out.println("this is march..");
			break;
		}
		default:{
			System.out.println("i dont know i am sorry...very sorry...");
		}
		}
		
		char c='a';
		switch(c) {		case 'a':{			System.out.println(" a for apple...");			break;
		}
		case 'b':{
			System.out.println("b for ball...");
			break;
		}
		default:{
			System.out.println("i dont know");
		}
		}
		
		String str="07 mar 2022";
		
		String m=str.substring(3,6);
		System.out.println(m);
		
		switch(m) {
		case "jan":{
			System.out.println("this is january month....");
			break;
		}
		case "feb":{
			System.out.println("this is feb month......");
			break;
		}
		default:{
			System.out.println("Yet to improve....");
		}
		}
	}
}
