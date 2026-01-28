package j0128;

public class C06 {

	public static void main(String[] args) {
		SCV s = new SCV();
		
		// --- 탱크 생성 ---
		Tank t = new Tank();
		System.out.println("현재체력: "+t.hitPoint);
		
		// --- 폭탄 맞음 ---
		System.out.println("폭탄 맞음.");
		t.hitPoint -= 30;
		System.out.println("현재체력: "+t.hitPoint);
		System.out.println("==============");
		System.out.println("탱크 충전중...");
		s.repair(t); // 기계만 수리를 해야 함.
		System.out.println(t.hitPoint);
		System.out.println("==============");
		
		// --- 마린 생성 ---
		Marine m = new Marine();
		System.out.println("현재체력: "+m.hitPoint);
		
		// --- 총 맞음 ---
		System.out.println("총 맞음.");
		m.hitPoint -= 10;
		System.out.println("현재체력: "+m.hitPoint);
		System.out.println("==============");
//		s.repair(m); // 마린은 수리 불가
		System.out.println(m.hitPoint);
	}

}
