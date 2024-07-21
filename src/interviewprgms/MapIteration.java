package interviewprgms;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void method() {
		Map<Integer, String> m =new HashMap<>();
		
		m.put(1, "Suma");
		m.put(2, "Sangeetha");
		
		m.forEach((key, value) -> System.out.println("Id :"+key + ", "+ value));	
	}
	public static void method1() {
		Map<String, String> map = new HashMap<>();
		
		map.put("K", "Sangeetha");
		map.put("B", "Venkat");
		
		for(Map.Entry<String, String> e: map.entrySet()) {
			String key=e.getKey();
			String value= e.getValue();
			System.out.println("first name: "+key +", "+"Last name: "+value);
		}
	}
	public static void main(String[]args) {
		method();
		method1();
	}
}
