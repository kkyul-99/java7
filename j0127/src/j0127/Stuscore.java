package j0127;

public class Stuscore {
	
	//초기화블록
	{
		count++;
		no = count; //번호 자동부여
	}
	
	//생성자-초기화메소드
	//클래스명 같음,리턴X,voidX
	Stuscore(){} //기본생성자
	//매개변수가 있는 생성자
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	void calTotal(int kor,int eng,int math) {
		this.total = kor+eng+math;
	}
	
	void calAvg(int kor,int eng,int math) {
		this.avg = (kor+eng+math)/3.0;
	}

}
