package da3;

public class LoopsArrayEnhanced {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		int twod[][]= {
				{23,45,67,8,9},
				{23,45,78,89,23},
				{12,23,34,45,56}
		};
		
		for(int i[]:twod) {
			for(int j:i) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
	}
}
