package day2;

public class ArraysDemo {
	public static void main(String[] args) {
		int []arr= {100,34,56,8,6,34};//
		int ar[];//both the ways are correct
		
		//initialize an array either with default values or with some pre defined values
		
		//Pre-Defined Values
		
		//arr= {10,20};
		
		System.out.println(arr.length);//length is a property of array object hich return the size of array
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[5]);
		arr[5]=909090;
		System.out.println(arr[arr.length-1]);
		
		//System.out.println(arr[6]); - this throws an exception or error
		
		System.out.println("...................................................");
		//just initializing an array
				ar=new int[5];// by default arrays are initialized with value zero
		
				System.out.println(ar.length);
				ar[0]=90;
				ar[1]=34044;
				ar[2]=999;
				ar[4]=888;
				System.out.println(ar[0]);
				System.out.println(ar[1]);
				System.out.println(ar[4]);
				System.out.println(ar[ar.length-1]);
				
				System.out.println(ar[5]);
	}
}
