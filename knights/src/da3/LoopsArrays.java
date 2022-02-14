package da3;

public class LoopsArrays {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int twod[][]= {
				{23,45,67,8,9},
				{23,45,78,89,23},
				{12,23,34,45,56}
		};
		
		for(int i=0;i<twod.length;i++) {//no of rows
			for(int j=0;j<twod[i].length;j++) {//no of columns of that particular row
				System.out.print(twod[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}
}
