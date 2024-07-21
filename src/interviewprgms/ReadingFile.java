package interviewprgms;

import java.io.FileInputStream;

public class ReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Documents\\New folder\\personal.txt");
			int i=0;
			while( (i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch (Exception e){
			System.out.println("sorry for the inconvienience");
		}
		

	}

}
