package knights;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Welcome To Java......");
		
		//NUMBERS - INTEGERS TYPE
		
		long distance=9223372036854775807l;//size is 64 bit - the last character is an alphabet L in lowercase
		long distancen=-92233_72036854775808l;//size is 64 bit
		
		int weight=2_147_483_647;//32 bit
		int weightn=-2_147_483_648;//32 bit
		
		short small=32767;//16 bit
		short smalln=-3_2768;
		
		byte verysmall=127;//8 bit
		byte versmalln=-12_8;
		
		//CHARACTER TYPE
		char c='a';//16 bit
		char cc=0;
		char ccc=65535;
		//char cccc=65536;
		//char ccccc=-65535;//you cannot have negate value for char
		
		//FLOATING TYPE
		
		float f=2929;//32 bit
		f=123.34f;
		
		double d=34343.34;//64 bit
		
		//BOOLEAN TYPE
		
		boolean decision=true;//booleans can only accept true or false, they cannot accept any other value
		decision=false;
		
		//STRING
		
		String str="Hello and Welcome to Java";// the size is unlimited - it can contain a stream of characters either a word or a scentence or a para or essay etc
		
	}

}
