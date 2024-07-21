package interviewprgms;

import java.io.FileOutputStream;

public class WritingFile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\Documents\\New folder\\fos.txt");
		String s = new String("I am going to write into the file.");
		byte  b[]=s.getBytes();
		
		fos.write(b);
		fos.flush();
		fos.close();
		
		System.out.println("Successfully written");
		}catch (Exception e) {
		
		}

	}
}
