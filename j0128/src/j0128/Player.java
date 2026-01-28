package j0128;

abstract public class Player {
	int currentPlay;
	
	// 미완성 메서드
	abstract void play(int cp);
	abstract void stop();
	
	void play() { // 완성 메서드 - 오버로딩
		System.out.println("실행합니다.");
	}

}
