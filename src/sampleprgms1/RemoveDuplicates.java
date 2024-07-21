package sampleprgms1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void method1() {
	List <Integer> al = new  ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(1);
	al.add(4);
	Set <Integer>hs = new HashSet<>(al);

	System.out.println("List without duplicates:"+hs);
	}
	public static void method2() {
		List<String> al=new ArrayList<>();
    	al.add("sa");
    	al.add("n");
    	al.add("sa");
    	al.add("geetha");
    	Set<String> hs= new LinkedHashSet<>();
    	for(int i=0; i<= al.size()-1; i++) {
    		hs.add(al.get(i));
    	}
    	System.out.println("String without duplicates: "+hs);
	}
	
	public static void main(String[]args) {
		method1();
		method2();
	}
}
