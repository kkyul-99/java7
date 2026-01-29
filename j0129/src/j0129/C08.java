package j0129;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 기본형과 객체형
		int a = 10;
		Integer b = new Integer(10);
		BigInteger c = new BigInteger("123456789012345678901234567890");
		
		
		
		// String, StringBuffer()
//		StringBuffer sb = new StringBuffer("0123");
//		sb.append(4);
////		sb = sb+"4"; // 오류발생
//		System.out.println(sb);
//		System.out.println(sb.charAt(0));
//		
//		String str = "0123";
//		str = str+4;
//		System.out.println(str);
//		System.out.println(str.charAt(0));
//		
//		String str = "0"; // 10123456789
//		int a = 0;
//		for(int i=1;i<10;i++) {
//			str += i;
//		}
//		System.out.println(str); // 1개
		
		
		
		// subString(0,5) - 문자열 자르기
		// 10조12345번
		// 12345
//		String txt = "10조12345번";
//		System.out.println(txt.substring(3,8)); // 12345
//		System.out.println(txt.substring(3)); // 12345번
////		System.out.println(txt.substring(0,-1)); // 오류발생(python은 가능)
//		System.out.println(txt.substring(0)); // 전체 출력
//		
//		// charAt() - 특정 위치의 문자 1개 추출
//		System.out.println(txt.charAt(0)); // 1
//		System.out.println(txt.charAt(2)); // 조
		
		
		
		// split() - 특정문자열 기준으로 분리
		// valueOf() - 기본형을 객체형으로 변환
		// parse~~() - 문자열을 기본형으로 변환
//		String txt = "1,홍길동,100,100,100,300,100.0";
//		String[] arr = txt.split(",");
//		int no = Integer.parseInt(arr[0]);
//		String name = arr[1];
//		int kor = Integer.valueOf(arr[2]);
//		int eng = Integer.valueOf(arr[3]);
//		int math = Integer.valueOf(arr[4]);
//		int total = Integer.valueOf(arr[5]);
//		double avg = Double.parseDouble(arr[6]);
//		System.out.println(Arrays.toString(arr));
		
		
		
		// trim() - 앞뒤 공백 제거(사이 공백은 제거 안됨)
//		String txt = "     a     b     c     ";
//		String txt2 = "     abc     ";
//		System.out.println(txt.trim());
//		System.out.println(txt2.trim());
//		// replace()는 원래 문자 대체 메서드이지만 공백제거에도 사용 가능
//		System.out.println(txt.replace(" ",""));
		

		
		// replace() - 문자 대체
//		String txt = "aaabbbcdeaaabcccceaeaeab";
//		String txt2 = txt.replace("a", "A");
//		System.out.println(txt2);
//		System.out.println(txt.replace("a", "A"));
//		System.out.println(txt.replace("a", "").length()); // a제거 후 길이 = 15
		
		
		
		// indexOf()
//		String txt = "aaabbbcdeaaabcccceaeaeab";
//		System.out.println("문자길이: "+txt.length());
//		
//		int count = 0;
//		for(int i=0;i<txt.length();i++) {
//			if(txt.indexOf("e",i) != -1) {
//				System.out.println((count+1)+"번째 위치값: "+txt.indexOf("e",i));
//				i = txt.indexOf("e",i);
//				count++;
//			}else break;
//        }
//		System.out.println("e의 개수: "+count);
		
//		System.out.println(txt.indexOf("e")); // txt.indexOf("e") = 8
//		System.out.println(txt.indexOf("e",8+1));
//		System.out.println(txt.indexOf("e",17+1));
//		System.out.println(txt.indexOf("e",19+1));
//		System.out.println(txt.indexOf("e",21+1));
		
		
		
		// contains()
//		String[] name = {
//				"홍길동","유관순","이순신","강감찬","김구",
//				"김유신","홍길자","홍길순","유관자","이순자",
//		};
//		
//		// 홍이 들어가 있는 사람을 모두 출력하시오.
//		int temp = 0;
//		
//		System.out.println("검색할 사람의 이름을 입력하세요.>> ");
//		String fName = scanner.next();
//		
//		System.out.println("[ 검색 결과 ]");
//		for(int i=0;i<name.length;i++) {
//			if(name[i].contains(fName)) {
//				System.out.println(i+": "+name[i]);
//				temp = 1;
//			}
//		} // for end
//		System.out.println("변경하려는 사람의 번호를 입력하세요.>> ");
//		int no = scanner.nextInt();
//		
//		// 변경할 이름을 입력받아, 수정을 시키고 전체 출력하시오.
//		// 1. 변경할 이름 입력
//		// 2. 변경할 이름으로 변경
//		// 3. 전체 출력
//		if(temp==0) {
//			System.out.println("검색된 사람이 없습니다.");
//		}else {
//			System.out.println(name[no]+"을(를) 어떤 이름으로 변경하시겠습니까?>> ");
//			String cName = scanner.next();
//			name[no] = cName;
//			System.out.println("[ 이름 리스트 ]");
//			for(int i=0;i<name.length;i++) {
//				System.out.println(i+": "+name[i]);
//			}
//		} // if-else end
		
	}

}
