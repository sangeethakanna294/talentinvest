package sampleprgms1;

import java.util.Arrays;

public class LargestLeastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 20, 12, 24, 17, 8, 4, 22 };
		Arrays.sort(a);
//	    int largestNumber=a[0];
//	    for(int i=0; i<a.length;i++) {
//	    	if(largestNumber<a[i]) {
//	    		largestNumber=a[i];
//	    	}
//	    }
		int largestNumber = a[a.length - 1];
		System.out.println("Largest number in array: " + largestNumber);
		
		//we can write simply a[0] to get smallest number.
		int smallestNumber = a[0];
		for (int i = 0; i < a.length; i++) {
			if (smallestNumber > a[i]) {
				smallestNumber = a[i];
			}
		}
		System.out.println("Smallest number in array: "+smallestNumber);

	}

}
