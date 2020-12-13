package exception;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		FileWriter f = null;
		
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
		} catch (Exception e) {
			System.out.println("오류가 발생하였습니다.");
		} finally {
			if(f != null) {
				try {
					f.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
