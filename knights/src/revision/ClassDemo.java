package revision;

public class ClassDemo {
	int age=40;//simple property or primitive type
	String name="knights";
	int arr[]=new int[5];
	
	double weight=getWeight("pi");
			
	double getWeight(String value) {
		if(value.equals("pi")) {
			return 3.14;
		}
		else {
			return 100;
		}
	}
	
	void business() {
		System.out.println(age+":"+name+":"+weight);
	}
	
	public static void main(String[] args) {
		ClassDemo obj=new ClassDemo();
		obj.business();
	}
}
