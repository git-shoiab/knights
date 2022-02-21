package ch6;
//https://fluvid.com/videos/detail/rx3dEsDqa5uj7Rnoa#.YhOkizX8i4o.link
public class ArrayVariableDemo {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		
		ArrayVariableDemo obj=new ArrayVariableDemo();
		//System.out.println("Before Passing...:"+arr[2]);
		//obj.pbrArray(arr);//by default arrays are pass by reference
		//System.out.println("After Passing...:"+arr[2]);
		
		//1st solution - anonymous array
		obj.pbrArray(new int[] {102,2,3,3,4});//anonymous array - non reusable
		
		//2nd solution - create a copy and send
		int copyarr[]=new int[4];
		System.arraycopy(arr, 0, copyarr, 0, 4);
		
		System.out.println("copy arr...........:"+copyarr[1]);
		System.out.println("Before Passing...:"+arr[1]);
		obj.pbrArray(copyarr);
		System.out.println("After Passing...:"+arr[1]);	
		
		System.out.println("copy arr............:"+copyarr[1]);
	}
	
	
	void pbrArray(int a[]) {
		a[1]=303030;
	}
}
