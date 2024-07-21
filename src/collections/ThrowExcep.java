package collections;

public class ThrowExcep {

	static void help() {
		try {
			throw new NullPointerException("error_unknown");

		} catch (NullPointerException e) {
			System.out.println("Caught inside help().");
			throw e;
		}

	}

	public static void method(String[] args) {
		try {
			help();

		} catch (NullPointerException e) {
			System.out.println("caught in main error");

			System.out.println(e);

		}
	}

	static void fun() throws IllegalAccessException {
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}

	// This is a caller function
	public static void main(String args[]) {
		method(args);
		
		System.out.println(" ");
		
		try {
			fun();
		} catch (IllegalAccessException e) {
			System.out.println("caught in main.");
		}
	}

}
