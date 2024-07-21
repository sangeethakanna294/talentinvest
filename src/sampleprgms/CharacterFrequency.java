package sampleprgms;

import java.util.HashMap;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= new String("SANGEETHA");
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length();i++) {
			hm.put(s.charAt(i), (hm.get(s.charAt(i))!=null)? hm.get(s.charAt(i))+1 :1);
			
		}
		System.out.println(hm);

	}

}
