package interviewprgms;

import java.util.Scanner;

public class Converstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		double dollars= sc.nextDouble();
		double conversion = sc.nextDouble();
		
		double rupees = conversion * dollars;
		
		System.out.println("Amount in dollars: "+dollars);
		System.out.println("1 dollar equals to: "+ conversion +"rupees");
		System.out.println(dollars + " equals to "+rupees+" rupees");

	}

}
