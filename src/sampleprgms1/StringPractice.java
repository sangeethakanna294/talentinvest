package sampleprgms1;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= new String("SANGEETHA");
		String s1= new String("SAN GEETHA");
		
		System.out.println("The length of String: " +s.length());
		System.out.println("The char at the specific index: "+s.charAt(5));
		System.out.println(" "+s.trim());
		System.out.println("It is the boolean to check the specific character: "+s.contains("g"));
		System.out.println("Replacing SAN with SWA : "+ s.replace("SAN", "SWA"));
		System.out.println("The original String: "+s);
		System.out.println("Compares the two string: "+s.equals(s1));
		System.out.println("It is equalsIgnoreCase : "+s.equalsIgnoreCase(s1));
		System.out.println("Uppercase to LowerCase: "+s.toLowerCase());

	}

}
