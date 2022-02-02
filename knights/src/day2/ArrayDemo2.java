package day2;

public class ArrayDemo2 {
	public static void main(String[] args) {
//		int twod[][]= {
//				{10,20,3,1,3},
//				{1,2,5,6,10},
//				{67,890,543,12,3455}
//		};
		
		int twod[][]=new int[3][5];//3 rows and 5 columns
		
		System.out.println(twod.length);//this will return number of rows
		
		System.out.println(twod[0].length);//this will return number of columns of that row
		
		System.out.println(twod[0][0]);
		System.out.println(twod[2][4]);
		
		System.out.println(twod[0][1]);
		System.out.println(twod[2][0]);
		
		twod[0][1]=9999;
		twod[2][0]=8888;
		
		System.out.println(twod[0][1]);
		System.out.println(twod[2][0]);
	}
}
