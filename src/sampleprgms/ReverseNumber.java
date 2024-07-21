package sampleprgms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 12345, reverse=0;
		System.out.println("Original number: "+num);
		// This loop continous will continous until zero.
		for(; num !=0; num /=10) {     // num /=10 removes last digit from the num after each iteration.
			int digit= num % 10;	   // extract the last digit of num;
			reverse = reverse * 10 + digit;    //appends this digit to reverse.
		}
		System.out.println("Reverse number: "+reverse);
			
	}

}
