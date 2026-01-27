package j0127;

import java.util.Calendar;
import java.util.Date;

public class C03 {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.getNum());
		
		Singleton s2 = Singleton.getInstance();
		s2.setNum(100);
		System.out.println(s2.getNum());
		System.out.println(s1.getNum());
		
		
//		Singleton s1 = new Singleton();
//		s1.setNum(100);
//		System.out.println(s1.getNum());
		
		
		
		
//		Date d = new Date();
//		System.out.println(d);
//		Date d2 = new Date();
//		System.out.println(d2);
//		
////		Calendar c = new Calendar();
//		Calendar c = Calendar.getInstance();
//		Calendar c2 = Calendar.getInstance();
//		System.out.println(c);
//		System.out.println(c2);
		

	}

}
