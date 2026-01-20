package j0120_01;

public class C0120_06 {

	public static void main(String[] args) {
		// 1~45 사이의 랜덤숫자 6개를 입력 후 출력하시오.
		int[] num = new int[45];
		int[] random = new int[6];
		
		// 1. 순차번호 넣기
		for(int i=0; i<45; i++) {
			num[i] = i+1;
		}
		
		// 2. 번호 섞기
		for(int i=0; i<200; i++) {
			int no = (int)(Math.random()*45);
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		
		// 3. 6개 번호 추출
		
		// 6개의 숫자를 입력하시오.
		
		// 번호 확인
		
		// 모두 출력
		
	}

}
