package assignment_on_collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_FProblem {
	long phone;
	String contact;

	public static void main(String[] args) {
		TreeMap<Long,String> t=new TreeMap<>();
		t.put(999999999l,"Ashraf");
		t.put(8888888l, "piya");
		t.put(7777777l, "priya");
		t.put(5555555l, "Rani");
		t.put(7777888l,"Devi");
		t.put(3432445l, "Cough&&cold");
		System.out.println(t);
		  for(Map.Entry mapElement : t.entrySet()) {
	            long key= (long)mapElement.getKey();
	            System.out.println(key);
		  }
	            for(Map.Entry mapElement : t.entrySet())
	            {
	            String value  = (String)mapElement.getValue();
	            System.out.println(value);
	            }
	            System.out.println(t);
	            
	            for(Map.Entry mapElement : t.entrySet())
	            {
	            long key=(long)mapElement.getKey();
	            
	            String value=(String)mapElement.getValue();
	            System.out.println(key+" "+value);
	            
	            	
	            }
		
	
		  

	}
}
