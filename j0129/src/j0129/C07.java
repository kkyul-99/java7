package j0129;

public class C07 {

	public static void main(String[] args) {
		
		Person p1 = new Person(20010101_1111111L, "홍길동");
		Person p2 = new Person(20010101_1111111L, "유관순");
		
		System.out.println(p1);
		System.out.println(p2);
		
		Person p3 = new Person(p1);
		p3.name = "이순신";
		System.out.println(p3);
		
		Class cObj = Person.class;
		String classname = cObj.getName();
		System.out.println(classname);
		
		
		
//		String txt = "지난 10일, 2026년 새해가 밝은지 열흘만에 남북관계를 꽁꽁 얼어붙게 만든 사건이 일어났습니다. 바로 최근 군·경 합동수사TF가 수사하고 있는 ‘개성 무인기 침투 사건’입니다.\r\n"
//				+ "이 사건은 지난 10일 북한 측에서 “남한 측 무인기가 개성에 침투했다” 라고 주장하면서 시작됐습니다. 북한 측은 해당 무인기의 사진을 공개하면서, 무인기 침투가 대한민국 국군의 소행으로 의심된다고 주장했어요. \r\n"
//				+ "하지만 우리 국방부는 “(해당 무인기는)우리 군이 보유한 기종이 아니다” 라며 북한 측 주장을 전면 부인했습니다. 그러자 자연스레 군이 아닌 민간인이 무인기를 날려보냈을 가능성이 제기됐는데요.";
//		
//		System.out.println(txt.hashCode()); // 837325785
//		
//		String txt2 = "aaabbbccc";
//		System.out.println(txt2.hashCode()); // 1112177698
//		
//		txt = "지난 10일, 2026년 새해가 밝은지, 열흘만에 남북관계를 꽁꽁 얼어붙게 만든 사건이 일어났습니다. 바로 최근 군·경 합동수사TF가 수사하고 있는 ‘개성 무인기 침투 사건’입니다.\r\n"
//				+ "이 사건은 지난 10일 북한 측에서 “남한 측 무인기가 개성에 침투했다” 라고 주장하면서 시작됐습니다. 북한 측은 해당 무인기의 사진을 공개하면서, 무인기 침투가 대한민국 국군의 소행으로 의심된다고 주장했어요. \r\n"
//				+ "하지만 우리 국방부는 “(해당 무인기는)우리 군이 보유한 기종이 아니다” 라며 북한 측 주장을 전면 부인했습니다. 그러자 자연스레 군이 아닌 민간인이 무인기를 날려보냈을 가능성이 제기됐는데요.";
//		
//		System.out.println("쉼표변경: "+txt.hashCode()); // -807310855
		
		
		
//		Person p1 = new Person();
//		p1.id = 20010101_1111111L;
//		p1.name = "홍길동";
//		
//		Person p2 = new Person();
//		p2.id = 20010101_1111111L;
//		p2.name = "유관순";
//		
//		if(p1.equals(p2)) { // p1.id == p2.id
//			System.out.println("같음");
//		} else {
//			System.out.println("다름");
//		}
//		
//		System.out.println(p1);
//		System.out.println(p2);
		
//		Stuscore s = new Stuscore("홍길동",100,100,100);
//		Stuscore s2 = new Stuscore("홍길동",100,100,100);
//		Stuscore s3 = new Stuscore("홍길동",90,90,90);
//		if (s.equals(s3)) {
//			System.out.println("같은 객체: ");
//		} else {
//			System.out.println("다른 객체: ");
//		}
//		System.out.println(s);
//		System.out.println(s2);
		
	}

}
