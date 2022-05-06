package utilpack;
//https://fluvid.com/videos/detail/Ee1-6HDG6OIQYrdOw#.YnUsF13iE0M.link
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		int i[]= {10,20,30};
		
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		
		System.out.println(list);
		System.out.println("size...:"+list.size());
		System.out.println(list.get(1));
		
		System.out.println(list.contains(20));
		
		list.remove(1);
		System.out.println("size...:"+list.size());
		
		for(Object n:list) {
			System.out.println(n);
		}
		for(int n=0;n<list.size();n++) {
			System.out.println(list.get(n));
		}
		
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ListIterator liter=list.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
	}
}
