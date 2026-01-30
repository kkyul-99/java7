package j0130;

import java.io.BufferedReader;
import java.io.FileReader;

public class C06 {

	public static void main(String[] args) {
		// 문서파일 읽어오기 - BufferedReader 객체를 사용해서 진행함.
		String filePath = "c:/aaa/a1.txt";
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine(); // 1줄씩 읽어오기
				if(line == null) break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
