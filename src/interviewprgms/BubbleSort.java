package interviewprgms;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		int n = array.length;
		for(int i=0; i < n-1; i++) {
			boolean swapped = false;
			// arary n-i-1 will goes to second element
			// whereas n-1-i will goes to last index of element.
			for(int j=0; j < n-i-1; j++) {
				if (array[j] > array[j+1]) {
					int temp= array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if (! swapped) {
				break;
			}
		}
	}
	public static void printArray(int[]array) {
		for(int i=0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	public static void main(String[]args) {
		int[] i = {32, 12, 43, 63};
		System.out.println("Before sorrting: ");
		printArray(i);
		bubbleSort(i);
		System.out.println("\n\nAfter Sorting: ");
		printArray(i);
		
	}

}
