package sampleprgms;

public class PrimeCheck {

	public static void main(String[]args) {
	//1. method that we are assuming the primecheck to be false 
		
		int input=17;
		boolean primeCheck=false;
		//The variable primeCheck is initially set to false. This suggests that unless proven otherwise, 
		//the number is assumed to be not prime.
		
		System.out.println("In first case: -->");
		
		for(int i=2; i<=input/2; ++i) {
			if(input% i!=0) {
				primeCheck=true;
				break;
			}
		}
		if(primeCheck) {
			System.out.println("It is a primenumber");
		}else {
			System.out.println("It is not a primenumber");
		}
		
// 2. Lets the primeCheck is true  assuming  that the number is prime until a factor is found.
		int num = 17;
		boolean flag = true;
		
		System.out.println("It second case: -->");
		
		for(int i=2; i<=input/2; ++i) {
			if(num % i ==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("It is a primenumber");
		}else {
			System.out.println("It is not a primenumber");
		}
		
	}
}
