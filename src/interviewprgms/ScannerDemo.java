package interviewprgms;

import java.util.Scanner;

public class ScannerDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		char gender = sc.next().charAt(0);
		long phoneno = sc.nextLong();
		double cgpa = sc.nextDouble();
		
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Gender: "+gender);
		System.out.println("Phoneno. : "+phoneno);
		System.out.println("Grade: "+cgpa);
		
	}

}
