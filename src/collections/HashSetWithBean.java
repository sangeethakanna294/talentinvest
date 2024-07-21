package collections;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetWithBean {
	
	public static void main(String[]args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Mahesh");
		hs.add("Suresh");
		hs.add("Mahesh");
		hs.add("Kamesh");
		hs.add("Rakesh");
		hs.add("Roopesh");
		hs.add("Kamal");
		
		// Order might vary becuze, HashSet do not maintain the order of its elements.
		Iterator <String> i = hs.iterator();
		
		while(i.hasNext()) {            // hasNext() is used for iteration, it returns true if it have nxt element.
			 System.out.println(i.next());
		}
		
		System.out.println("Removing Kamesh in set : "+hs.remove("Kamesh"));
		System.out.println("After invoking remove(object) method: "+hs);  
		
		hs.removeIf(str -> str.contains("Kamal"));
		System.out.println("After invoking removeIf() method: "+hs);  
		
		
		HashSet<Associates> hst = new HashSet<Associates>();
		Associates e1= new Associates ( "Venkat B", 30, "IT");
		Associates e2= new Associates ( "Sangeetha K", 22, "Biology");
		Associates e3= new Associates ( "Ganga K", 21, "B.Com");
		Associates e4= new Associates ( "Kishore C",  22, "BSC");
		
		hst.add(e1);
		hst.add(e2);
		hst.add(e3);
		hst.add(e4);
		
		for(Associates e: hst) {
			System.out.println( e.name + ", "+ e.id + ", " + e.deptName );
		}
			
	}

}
