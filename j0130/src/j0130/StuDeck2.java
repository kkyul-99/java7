package j0130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck2 {
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Stuscore> list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	String filePath = "c:/aaa/stu2.txt";
	
	int no,kor,eng,math,total,choice,temp;
	String name;
	double avg;
	
	// 성적입력
	void stu_input() {
		System.out.println("학생 이름을 입력하세요.>> ");
		String name = scan.next();
		System.out.println("국어 점수를 입력하세요.>> ");
		int kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.>> ");
		int eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.>> ");
		int math = scan.nextInt();
		list.add(new Stuscore(name,kor,eng,math));
	}
	
	// 파일 불러오기
	void fileOpen() {
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
					title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
			System.out.println("-----------------------------------------------------");
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] str = line.split(",");
				int no = Integer.parseInt(str[0]); // 형변환
				String name = str[1];
				int kor = Integer.parseInt(str[2]);
				int eng = Integer.parseInt(str[3]);
				int math = Integer.parseInt(str[4]);
				int total = Integer.parseInt(str[5]);
				double avg = Double.parseDouble(str[6]);
				list.add(new Stuscore(no,name,kor,eng,math,total,avg));
				String strTxt = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
						str[0],str[1],str[2],str[3],str[4],str[5],str[6]);
				System.out.print(strTxt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("파일 불러오기 완료!");
	} // fileOpen()
	
	// 파일 저장하기
	void fileSave() {
		list.add(new Stuscore("홍길자",50,50,50));
		list.add(new Stuscore("홍길순",50,50,50));
		try {
			// FileWriter(filePath,true) - 이어쓰기
			FileWriter fw = new FileWriter(filePath,true); // 덮어쓰기
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i=0;i<list.size();i++) {
				bw.write(list.get(i).toString());
				bw.newLine();
			}
			bw.close();
			fw.close();
			System.out.println("파일 저장완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // fileSave()

}
