package j0130;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class C07 {

	public static void main(String[] args) {
		String filePath = "c:/aaa/a1.txt";
		try {
			// 설정이 되어있지 않으면(false): 덮어쓰기
			// true 설정하면: 이어쓰기
			FileWriter fw = new FileWriter(filePath,true);
			BufferedWriter bw = new BufferedWriter(fw);
			String txt = "다시 입력22222!! \r\n"; // \r: 줄의 제일 끝
			bw.write(txt);
			// bw.close(), fw.close() 안하면 파일에 텍스트 저장이 안됨.
			 bw.close();
			 fw.close();
			System.out.println("파일저장완료!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 작성 중 오류가 발생했습니다.");
		}

	}

}
