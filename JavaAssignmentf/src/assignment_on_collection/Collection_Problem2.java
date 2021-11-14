package assignment_on_collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Collection_Problem2 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(12);
		h.add(34);
		h.add(13);
		h.add(15);
		h.add(67);
		h.add(67);//duplicate elements ignored
		h.add(476);
		h.add(90);
		h.add(99);
		h.add(100);
		h.add(90);
		System.out.println(h);
		
		
		
		
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(15);
		t.add(17);
		t.add(20);
		t.add(55);
		System.out.println(t);
		
		
	
	
		
		
	}

}
