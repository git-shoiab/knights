package day2;
//UNEVEN MULTI DIMENSIONAL ARRAY
public class ArrayDemo3 {
	public static void main(String[] args) {
		int ue[][]=new int[4][];
		
		ue[0]=new int[4];//row zero is assigned 4 columns
		ue[1]=new int[1];
		ue[2]=new int[7];
		ue[3]=new int[3];
		
		System.out.println(ue.length);//no of rows
		
		System.out.println(ue[0].length);
		System.out.println(ue[1].length);
		System.out.println(ue[2].length);
		System.out.println(ue[3].length);
		
		ue[1][0]=109010;
		System.out.println(ue[1][0]);
		
		int a[]=new int[5];
		met(a);
		met2(a);
		
		met(new int[] {1,2,3,4});//anonymous array
	}
	
	public static void met(int a[]) {
		
	}
	public static void met2(int bb[]) {
		
	}
}
