package sampleprgms;

public class Swapping {

	public static void main(String[]args) {
		int a=21;
		int b= 87;
		System.out.println("before Swapping: "+a+" " +b);
		int temp= a;
		a= b;
		b= temp;
		System.out.println("After Swapping: "+a+" " +b);
	}
}
