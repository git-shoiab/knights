package exceppack;
//https://fluvid.com/videos/detail/j-mdETd_nYsXeO2QG#.Yii9iE28hmw.link
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Dog tiger=new Dog();
		try {
			tiger.play("stick");
		}catch(DogBiteException dbe) {
			System.out.println(dbe);
		}catch(DogBarkException dbee) {
			System.out.println(dbee);
		}
	}
}
class Dog{
	public void play(String item)throws DogBiteException,DogBarkException {
		if(item.equals("stick")) {
			throw new DogBiteException("you beat I bite....");
		}
		else if(item.equals("stone")) {
			throw new DogBarkException("you throw I bow...bow");
		}
	}
}
class DogBiteException extends Exception{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}
class DogBarkException extends Exception{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}