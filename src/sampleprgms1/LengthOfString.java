package sampleprgms1;

public class LengthOfString {

	public static void method1() {
		String s= new String("Hello, World!");
		int length= s.length();
		System.out.println("Length of string: "+length);
		
		//It is another way to simply get the length of the String.
//		System.out.println(s.length());
	}
	public static void method2() {
		String s= new String("Hello");
		for(int i=0; i<s.length();i++) {
			
		}
		System.out.println(s.length());

	}
	
	public static void main(String[]args) {
		method1();
		method2();
	}

}
