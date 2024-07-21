package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupliSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l= new ArrayList<>();
		l.add(1);
		l.add(1);
		l.add(7);
		Set <Integer> hs = new HashSet<>();
		for(int i=0; i<l.size();i++) {
			hs.add(l.get(i));
		}
		System.out.println(hs);
	}

}
