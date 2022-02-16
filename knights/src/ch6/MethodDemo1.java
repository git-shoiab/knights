package ch6;
//Methods - https://fluvid.com/videos/detail/M-AKQTqYzVI4pvGLg#.Yg0Gbooqivc.link
public class MethodDemo1 {
	public static void main(String[] args) {
		MethodDemo1 obj=new MethodDemo1();
		obj.met();
		obj.met(10);//DATA CHANGES BEHAVIOR CHANGES - POLYMORPHOISM
		obj.met(979878979L);
		obj.met((long)8787878);
		
		obj.met("knights",100);
		
		obj.met(200,"knights......");
		int arr[]= {34,56,78,90};
		
		obj.call(arr);//bad practice
		System.out.println("\n..........................................\n");
		obj.call(new int[] {56,78,90,78});//good practice
		
		System.out.println("\n**************************************************\n");
		obj.varmet(89,90,78,56,67,9898,87878,566);
	}
	
	void met() {
		System.out.println("met method called...");
	}
	
	void met(int i) {
		System.out.println("met method called....:"+i);
	}
	
	void met(long l) {
		System.out.println("longggggggggggggggggggggggggggggggggg");
	}
	void met(String s,int n) {
		System.out.println(s+"  :  "+n);
	}
	
	void met(int n,String s) {
		System.out.println(n+"  :  "+s);
	}
	
	void call(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int n:a) {
			System.out.print(n+" \t");
		}
	}
	
	void varmet(int... a) {//VARARGS
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int n:a) {
			System.out.print(n+" \t");
		}
	}
}
