package sampleprgms1;

public class SumOfSquaresOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1, 2, 4, 6, 7};
		int sum =0;
		for(int i=0; i<a.length;i++) {
			if(a[i]%2 == 0) {
				sum = sum + a[i] * a[i];
			}
			System.out.println(sum);
		}
		System.out.println("Total sum of even numbers: "+sum);

	}

}
