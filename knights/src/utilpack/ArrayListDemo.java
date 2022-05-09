package utilpack;
//https://fluvid.com/videos/detail/Ee1-6HDG6OIQYrdOw#.YnUsF13iE0M.link

//https://fluvid.com/videos/detail/QKZX3hqdvOC9qGeYp#.Ynkm3Ax0Zx8.link
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListDemo {
	public static void main(String[] args) {
		int i[]= {10,20,30};
		
		//ArrayList list=new ArrayList();
		//LinkedList<Integer> list=new LinkedList<>();
		Vector<Integer> list=new Vector<>();
		list.add(60);
		list.add(55);
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
		//list.add(50);
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
		System.out.println("............................");
		Enumeration<Integer> en=list.elements();
		list.add(50);
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		Collections.sort(list);
		System.out.println(list);
		Collections.synchronizedCollection(list);//for vector not needed
		
		//Collections.sort(list,(n1,n2)->{return n2.compareTo(n1);}); //-this is best
		Collections.sort(list,new MyComparator());
		System.out.println(list);
		
	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}