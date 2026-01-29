package j0129;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C06 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("c:/aaa/a1.txt");
			int data = 0;
			while((data = fr.read()) != -1) {
				// 2byte 1단어
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // try-catch-finally end
		
	}

}
