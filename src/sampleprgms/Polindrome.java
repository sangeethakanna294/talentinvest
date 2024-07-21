package sampleprgms;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("venkatadrayyavaaripalem");
		System.out.println("Original String: "+s);
		
		String reverse="";
		for (int i=s.length()-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Reverse String: "+reverse);
		
		if(s.equals(reverse)) {
			System.out.println("It is polindrome");
		}else {
			System.out.println("It is not a Polindrome");
		}

	}

}
