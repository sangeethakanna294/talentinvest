package sampleprgms;

public class FibinocciSeries {

	public static void main(String[]args) {
	// After two number each subsequent number is the sum of two preceeding numbers.	
		int first =1;
		int second= 1;
		System.out.print(first+" "+second);
		
		for(int i=0; i<=10; i++) {
			int third= first + second;
			System.out.print(" "+third);
			
			first=second;
			second= third;
		}
	}
}
