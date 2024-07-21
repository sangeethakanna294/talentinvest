package sampleprgms1;

public class ReverseArray {
    // Function to reverse an array
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        
        // Loop to swap elements from both ends
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];      //n-1-i  goes last element.
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    // Main method to test the reverseArray function
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        
      //  "for each integer i in the array A".
      //  Here, i is a variable that will take on the value of each element in A, one at a time.
        System.out.println("Original array:");
        for (int i : A) {
            System.out.print(i + " ");
        }
        
        // Call the function to reverse the array
        reverseArray(A);
        
        System.out.println("\nReversed array:");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
