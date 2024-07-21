package sampleprgms;

import java.util.Arrays;

public class SortingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,76,12,32,19};
		Arrays.sort(a);
		System.out.println("sorting of a :");
		for(int i=0; i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
  //      System.out.println(" ");
		int b[]= {7,2, 6, 12, 3,5};
		Arrays.sort(b);
		System.out.println("\n\nsorting of b :");
		for(int i=0; i<b.length; i++) {
			System.out.print(" "+b[i]);
		}
	}

}
