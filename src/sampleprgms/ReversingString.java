package sampleprgms;

public class ReversingString {

	public static void main(String[]args) {
		String s= new String("RamaDevi");
		
		System.out.println("Original String: "+s);
		String reversends ="";
		for(int i=s.length()-1; i>=0 ; i--) {
			reversends = reversends+ s.charAt(i);
		}
		System.out.println("Reversed String: "+reversends);
	}
}
